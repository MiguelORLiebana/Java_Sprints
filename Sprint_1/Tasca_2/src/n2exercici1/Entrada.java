package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    static Scanner scanner = new Scanner(System.in);
    public void executar() throws InterruptedException {
        Byte valorByte = llegirByte("Introdueix la teva edat: ");
        Integer valorInteger = llegirInt("Introdueix una xifra de tipus Integer");
        Float valorDecimal = llegirFloat("Introdueix un nombre decimal: ");
        Double valorDouble = llegirDouble("Introdueix un nombre double: ");
        char valorChar = llegirChar("Introdueix un char: ");
        String valorString = llegirString("Introdueix una paraula o text: ");
        Boolean valorBoolean = llegirSiNo("Introdueix s o n: ");
    }

    //*************** InputMismatchException ********************
    static byte llegirByte(String missatge){
        Boolean notOk = false;
        Byte nextByte;

        while(!notOk){
            System.out.println(missatge);
            try{
                nextByte = scanner.nextByte();
                notOk = true;
                return nextByte;
            } catch(InputMismatchException e){
                System.out.println("Error: edat no es correcte!");
                scanner.nextLine();      // Limpieza de buffer -> https://es.stackoverflow.com/questions/357304/bucle-infinito-con-scanner-de-java
            }
        }
        return -0;
    }

    public static int llegirInt(String missatge) {
        Boolean notOk = false;
        Integer nextInt;

        while(!notOk){
            System.out.println(missatge);
            try{
                nextInt = scanner.nextInt();
                notOk = true;
                return nextInt;
            } catch(InputMismatchException e){
                System.out.println("Error: la xifra no es correcte!");
                scanner.nextLine();      // Limpieza de buffer -> https://es.stackoverflow.com/questions/357304/bucle-infinito-con-scanner-de-java
            }
        }
        return -0;
    }

    public static float llegirFloat(String missatge) {
        Boolean notOk = false;
        Float nextFloat;

        while(!notOk){
            System.out.println(missatge);
            try{
                nextFloat = scanner.nextFloat();
                notOk = true;
                return nextFloat;
            } catch(InputMismatchException e){
                System.out.println("Error: nombre no es correcte!");
                scanner.nextLine();      // Limpieza de buffer -> https://es.stackoverflow.com/questions/357304/bucle-infinito-con-scanner-de-java
            }
        }
        return -0;
    }

    public static double llegirDouble(String missatge) {
        Boolean notOk = false;
        Double nextDouble;

        while(!notOk){
            System.out.println(missatge);
            try{
                nextDouble = scanner.nextDouble();
                notOk = true;
                return nextDouble;
            } catch(InputMismatchException e){
                System.out.println("Error: No és correcte, NO és un double!");
                scanner.nextLine();      // Limpieza de buffer -> https://es.stackoverflow.com/questions/357304/bucle-infinito-con-scanner-de-java
            }
        }
        return -0;
    }

    //*************** Exception ********************

    public static char llegirChar(String missatge) {
        Boolean notOk = false;
        char nextChar;

        while(!notOk){
            System.out.println(missatge);
            try{
                nextChar = scanner.next().charAt(0);
                notOk = true;
                return nextChar;
            } catch(Exception e){
                System.out.println("Error: No és correcte, NO és un char!");
                scanner.nextLine();      // Limpieza de buffer -> https://es.stackoverflow.com/questions/357304/bucle-infinito-con-scanner-de-java
            }
        }
        return -0;
    }

    public static String llegirString(String missatge) {
        Boolean notOk = false;
        String nextString;

        while(!notOk){
            System.out.println(missatge);
            try{
                nextString = scanner.nextLine();
                notOk = true;
                return nextString;
            } catch(Exception e){
                System.out.println("Error: No és correcte, NO és un char!");
                scanner.nextLine();      // Limpieza de buffer -> https://es.stackoverflow.com/questions/357304/bucle-infinito-con-scanner-de-java
            }
        }
        return "";
    }

    public static boolean llegirSiNo(String missatge){
        Boolean notOk = false;
        String nextLine;

        while(!notOk){
            System.out.println(missatge);
            try{
                nextLine = scanner.nextLine();

                if(nextLine.equals("s") || nextLine.equals("n")) {
                    notOk = true;
                    return true;
                }
            } catch(Exception e){
                System.out.println("Error: No és correcte, NO és un char!");
                scanner.nextLine();      // Limpieza de buffer -> https://es.stackoverflow.com/questions/357304/bucle-infinito-con-scanner-de-java
            }
        }
        return false;
    }
}


