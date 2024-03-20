package n1exercici7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        List<Object> llista = Arrays.asList(1,"hola", 2, "adiós", "ei", "coche", 10);
        List<String> llistaStrings;
        List<String> llistaOrd;

        System.out.println("******* Llista Inicial *******");
        System.out.println(llista);

        //PREGUNTA: No puedo introducir .sorted(Comparator.comparing(String::length))
        llistaStrings = llista
                .stream()
                //.filter(a -> String.valueOf(a.getClass()).equals(("class java.lang.String")))
                .filter(a -> a instanceof String)
                .map(String.class::cast)
                .sorted(Comparator.comparing(String::length).reversed())
                .toList();
        System.out.println("******* Opción 1 - Llista Ordenada de Llarga a Curta *******");
        System.out.println(llistaStrings);
    }
}
