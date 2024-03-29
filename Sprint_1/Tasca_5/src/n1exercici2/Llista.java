package n1exercici2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Llista {

    // Option 1
    //Notes: https://www.youtube.com/watch?v=pkrRxaOuGDk

    public void llistarContingutDiretoriesAndFolders(String directory){
        File file = new File(directory);

        if(file.isFile()){
            mostrar(file, Paths.get(file.getAbsolutePath()));
        } else {
            mostrar(file, Paths.get(file.getAbsolutePath()));

            File[] files = file.listFiles();

            for(File f: files){
                llistarContingutDiretoriesAndFolders(f.toString());
            }
        }
    }

    private void mostrar(File file, Path path){
        try{
            BasicFileAttributes attr = Files.getFileAttributeView(path, BasicFileAttributeView.class).readAttributes();
            String tipus = IsDirectoryOrFile(attr);
            showInfo(file, attr, path, tipus);

        } catch(IOException e){
            System.out.println("---- Error atributs del directori -----");
        }
    }

    // Option 2 - Not Working

    public void llistarContingutDirectoris(String directory) {

        File file = new File(directory);
        File [] aux = file.listFiles();

        System.out.println("************* Llista per ordre alfabètic ***********");
        Arrays.sort(aux);

        for(File a: aux){

            Path path = Paths.get(directory);

            try{
                BasicFileAttributes attr = Files.getFileAttributeView(path, BasicFileAttributeView.class).readAttributes();
                String tipus = IsDirectoryOrFile(attr);
                showInfo(a, attr, path, tipus);

            } catch(IOException e){
                System.out.println("---- Error atributs del directori -----");
            }
        }
    }

    private String IsDirectoryOrFile(BasicFileAttributes attr){
        String item = "";
        if(attr.isDirectory()) return item = ", és un directori (D), ";
        else return item = " - és un fitxer (F)";
    }

    private void showInfo(File file, BasicFileAttributes attr, Path path, String tipus){
        System.out.println(tipus + " - " +
                            formatDate(attr) +
                            " Path: " + file.getAbsolutePath());
    }

    private String formatDate(BasicFileAttributes time){
        try{
            FileTime date = time.lastModifiedTime();
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
            String dateCreated = df.format(date.toMillis());

            return "darrere modificació: " + dateCreated + " - ";
        } catch(IllegalArgumentException e){
            System.out.println("Error date format!");
        }
        return "Error";
    }
}