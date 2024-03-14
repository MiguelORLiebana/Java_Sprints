package n1exercici1;

public class Main {
    public static void main(String[] args) {

        Cotxe[] cotxesA, cotxesB;

        NoGenericMethods a = new NoGenericMethods("Opel", "Mercedes", "Fiat");

        NoGenericMethods b = new NoGenericMethods("Mercedes", "Fiat", "Opel");

        cotxesA = a.getCotxes();
        cotxesB = b.getCotxes();

        mostrar(cotxesA);
        mostrar(cotxesB);
    }

    public static void mostrar(Cotxe[] cotxes){
        for(Cotxe a: cotxes){
            System.out.println(a.getModel());
        }
    }
}
