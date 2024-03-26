package n1exercici2;

public class Cotxe {
    public static final String marca = "Opel";
    public static String model = "X";
    public final int potencia;

    public Cotxe(int potencia){

        this.potencia = potencia;
    }

    public static void frenar(){
        System.out.println("El vehicle està frenant");
    }

    public void accelerar(){
        System.out.println("El vehicle està accelerant");
    }

    public void getInfo(){
        System.out.println("The brand car is: " + this.marca + ", model " + this.model + " and " + this.potencia + " hp");
    }
}
