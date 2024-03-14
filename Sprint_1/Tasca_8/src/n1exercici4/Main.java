package n1exercici4;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> meses = cargarMeses();

        //method reference
        meses.forEach(System.out::println);
    }

    public static List<String> cargarMeses(){
        List<String> aux = Arrays.asList("gener","febrer","març","abril","maig","juny","juliol","agost","setembre","octubre","novembre","desembre");

        return aux;
    }
}