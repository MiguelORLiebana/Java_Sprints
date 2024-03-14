package n1exercici3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

     List<String> meses = cargarMeses();

     meses.forEach(a -> System.out.println(a));

    }

    public static List<String> cargarMeses(){
        List<String> aux = new ArrayList<>();
        aux.add("gener");
        aux.add("febrer");
        aux.add("març");
        aux.add("abril");
        aux.add("maig");
        aux.add("juny");
        aux.add("juliol");
        aux.add("agost");
        aux.add("setembre");
        aux.add("agost");
        aux.add("setembre");
        aux.add("octubre");
        aux.add("novembre");
        aux.add("desembre");

        return aux;
    }
}
