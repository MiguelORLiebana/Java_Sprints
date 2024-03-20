package n1exercici1;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Llista {

    public void llistarContingut(String directory) {

        File file = new File(directory);
        List<String> aux = Arrays.asList(file.list());

        System.out.println("************* Llista sense ordre alfabètic **********");
        for(String a: aux){
            System.out.println(a);
        }

        System.out.println("************* Llista per ordre alfabètic ***********");
        List<String> llistaOrdre = aux
                .stream()
                .sorted()
                .collect(Collectors.toList());

        for(String a: llistaOrdre){
            System.out.println(a);
        }
    }
}
