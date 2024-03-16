package n1exercici2;

public class CalculoDni {

    public String calcularDni(Integer numDni){

        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        Integer aux = numDni%23;
        return letras[aux];
    }
}
