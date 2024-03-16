package n1exercici1;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        //String directory = "C:"+ File.separator+"Users"+File.separator+"hp"+File.separator+"Desktop"+File.separator+"git_JavaSprint"+File.separator+"Java_Sprints";
        //System.out.printf("directory");

        Llista llista = new Llista();

        try{
            llista.llistarContingut(args[0]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.printf(e.getMessage());
        }
    }
}
