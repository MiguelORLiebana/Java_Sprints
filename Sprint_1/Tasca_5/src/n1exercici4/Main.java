package n1exercici4;

import java.io.File;

public class Main {
    public static void main(String[] args) {

//        String dir = System.getProperty("user.dir");
//        String directory = dir +File.separator+File.separator+"Tasca_5"+File.separator+"src"+File.separator+"n1exercici4"+File.separator+"Readme.txt";

        Llista llista = new Llista();

        try{
            llista.mostrarConsolaFitxer(args[0]);

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.printf(e.getMessage());
        }
    }
}
