package n1exercici2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Invocar mètode estàtic FRENAR:");
        Cotxe.frenar();

        System.out.println("\nInvocar métode no estàtic ACCELERAR:");
        Cotxe cotxe = new Cotxe( 100);
        cotxe.accelerar();
        cotxe.getInfo();

        System.out.println("\n***** variable static - final - static final *****");
        System.out.println("Variable static model: " + Cotxe.model);
        System.out.println("Variable static final: " + Cotxe.marca);
        System.out.println("Variable final: " + cotxe.potencia);

    }
}
