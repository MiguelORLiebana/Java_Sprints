package n1exercici6;

import java.util.*;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        List<Object> llista = Arrays.asList(1,"hola", 2, "adiós", "ei", "coche", 10);
//        List<Object> llista = new ArrayList<>();
//        llista.add(1);
//        llista.add("hola");
//        llista.add(2);
//        llista.add("adios");
//        llista.add("ei");
//        llista.add("coche");
//        llista.add(10);

        List<String> llistaStrings;
        List<String> llistaOrd;

        //PREGUNTA: No puedo introducir .sorted(Comparator.comparing(String::length))
        llistaStrings = (List<String>) (Object)llista
                .stream()
                .filter(a -> String.valueOf(a.getClass()).equals(("class java.lang.String")))
                //.sorted(Comparator.comparing(String::length))
                .toList();

        System.out.println("******* Llista Inicial *******");
        System.out.println(llista);

        System.out.println("******* Llista Sin números *******");

//        System.out.println(String.valueOf(llistaStrings.getFirst().getClass()));
//        System.out.println(String.valueOf(llista.getClass()));


        System.out.println(llistaStrings.toString());

        System.out.println("******* Llista Ordenada *******");

        llistaOrd = llistaStrings
                .stream()
                .sorted(Comparator.comparing(String::length))
                .toList();

        System.out.printf(llistaOrd.toString());
    }
}
