package n1exercici3;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        //String directory = "C:"+ File.separator+"Users"+File.separator+"hp"+File.separator+"Desktop"+File.separator+"git_JavaSprint"+File.separator+"Java_Sprints";

        Llista directoris = new Llista();

        try{
            directoris.llistarContingutDiretoriesAndFolders(args[0], true);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.printf(e.getMessage());
        }
    }
}
