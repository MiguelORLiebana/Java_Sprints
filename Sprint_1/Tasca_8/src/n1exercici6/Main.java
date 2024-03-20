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

        List<String> llistaStrings1;
        List<String> llistaStrings2;
        List<String> llistaOrd;

        System.out.println("******* Llista Inicial *******");
        System.out.println(llista);

        //Opción 1 - ***********************************************************************
        llistaStrings1 = llista
                .stream()
                //.filter(a -> String.valueOf(a.getClass()).equals(("class java.lang.String")))
                .filter(a -> a instanceof String)
                .map(String.class::cast)
                .sorted(Comparator.comparing(String::length))
                .toList();
        System.out.println("******* Opción 1 - Llista Ordenada de Curta a Llarga *******");
        System.out.println(llistaStrings1);

        //Opción 2  ***********************************************************************
        llistaStrings2 = (List<String>) (Object)llista
                .stream()
                .filter(a -> String.valueOf(a.getClass()).equals(("class java.lang.String")))
                //.sorted(Comparator.comparing(String::length))
                .toList();

        System.out.println("******* Opción 2 - Llista Sin números *******");

//        System.out.println(String.valueOf(llistaStrings.getFirst().getClass()));
//        System.out.println(String.valueOf(llista.getClass()));

        System.out.println(llistaStrings2.toString());

        System.out.println("******* Opción 2 - Llista Ordenada de Curta a Llarga *******");

        llistaOrd = llistaStrings2
                .stream()
                .sorted(Comparator.comparing(String::length))
                .toList();

        System.out.printf(llistaOrd.toString());
    }
}
