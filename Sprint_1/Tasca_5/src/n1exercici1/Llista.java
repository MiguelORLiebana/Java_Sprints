package n1exercici1;

import java.io.File;
import java.util.Arrays;

public class Llista {

    public void llistarContingut(String directory) {

        File file = new File(directory);
        File [] files = file.listFiles();

        System.out.println("************* Llista per ordre alfabètic ***********");
        Arrays.sort(files);

        for(File a: files){
            System.out.println(a);
        }
    }
}
