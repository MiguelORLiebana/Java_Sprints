package n1exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> llista = new ArrayList<String>();
        llista.add("lluvia");
        llista.add("julia");
        llista.add("coche");
        llista.add("nieve");
        llista.add("pon");
        llista.add("faraon");

        List<String> llistaFinal;

        llistaFinal = retornarLlistaO(llista);

        mostrarLlista(llistaFinal);
    }

    public static List<String> retornarLlistaO(List<String> llista){

        List<String> aux;

//        for (String a : llista) { if (a.contains("o")) aux.add(a); }

        aux = llista.stream().filter(a -> a.contains("o")).filter(a -> a.length() > 5).collect(Collectors.toList());

        return aux;
    }

    public static void mostrarLlista(List<String> llista){

        llista.forEach(System.out::println);
    }
}
