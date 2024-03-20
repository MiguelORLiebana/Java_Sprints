package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {

    static Scanner scanner = new Scanner(System.in);
    public void executar() throws InterruptedException {
        Byte valorByte = llegirByte("Introdueix la teva edat: ");
        System.out.println("El valor del byte és: " + valorByte);

        Integer valorInteger = llegirInt("Introdueix una xifra de tipus Integer");
        System.out.println("El valor de l´Integer és: " + valorInteger);

        Float valorDecimal = llegirFloat("Introdueix un nombre decimal: ");
        System.out.println("El valor decimal és: " + valorDecimal);

        Double valorDouble = llegirDouble("Introdueix un nombre double: ");
        System.out.println("El valor double és: " + valorDouble);

        char valorChar = llegirChar("Introdueix un char: ");
        System.out.println("El valor char és: " + valorChar);

        String valorString = llegirString("Introdueix una paraula o text: ");
        System.out.println("El valor String és: " + valorString);

        Boolean valorBoolean = llegirSiNo("Introdueix s o n: ");
        System.out.println("El valor Boolean és: " + valorBoolean);
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

        while(!notOk){
            System.out.println(missatge);
            try{
                String a = scanner.next();

                if(a.length() == 1 && (a.matches("[a-z]+") || a.matches("[A-Z]+"))){
                    notOk = true;
                    return a.charAt(0);
                }
                else{
                    throw new Exception("Error, introduce un char");
                }
            } catch(Exception e){
                System.out.println("Error: No és correcte, NO és un char!");
                scanner.nextLine();      // Limpieza de buffer -> https://es.stackoverflow.com/questions/357304/bucle-infinito-con-scanner-de-java
            }
        }
        return -0;
    }

    public static String llegirString(String missatge) {
        Boolean notOk = false;
        String nextString ="";
        nextString = scanner.nextLine();

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

        while(!notOk){
            System.out.println(missatge);
            try{
                String nextLine = scanner.nextLine();

                if(nextLine.equals("s")) {
                    notOk = true;
                    return true;
                }else if (nextLine.equals("n")){
                    notOk = false;
                    return false;
                }

            } catch(Exception e){
                System.out.println("Error: No és correcte, NO és un char!");
                scanner.nextLine();      // Limpieza de buffer -> https://es.stackoverflow.com/questions/357304/bucle-infinito-con-scanner-de-java
            }
        }
        return false;
    }
}


