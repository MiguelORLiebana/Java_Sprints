package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Integer h = 8;
        System.out.printf(String.valueOf(h.getClass()));
        Scanner scanner = new Scanner(System.in);

//        Integer edad = scanner.nextInt();
//        String dni = scanner.nextLine();d
    }

    //*************** InputMismatchException ********************
    public static byte llegirByte(String missatge){
        //TODO
        byte a = 1;
        return a;
    }

    public static int llegirInt(String missatge) {
        //TODO
        Integer a = 1;
        return a;
    }

    public static float llegirFloat(String missatge) {
        //TODO
        float a = 1;
        return a;
    }

    public static double llegirDouble(String missatge) {
        //TODO
        double a = 1;
        return a;
    }

    //*************** Exception ********************

    public static char llegirChar(String missatge) {
        //TODO
        char a = 'a';
        return a;
    }

    public static String llegirString(String missatge) {
        //TODO
        String a = "";
        return a;
    }

    public static boolean llegirSiNo(String missatge){
        //si l’usuari/ària introdueix “s”, retorna “true”, si l’usuari introdueix “n”, retorna “false”.
        //TODO
        Boolean a = false;
        return a;
    }
}
