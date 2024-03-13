package n1exercici2;

import java.util.ArrayList;
import java.util.List;

public class Dni {

    public String calcularDni(Integer numDni){

        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        Integer aux = numDni%23;
        String letra = letras[aux];
        return letras[aux];
    }
}
