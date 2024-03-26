package n1exercici1;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("********** Càrrega classe per accés a un membre estàtic **********");
        Corda.methodCorda();
        Corda.methodCorda();

        System.out.println("\n********** Càrrega class per instància de classe Corda **********");
        Corda guitarra = new Corda("Fender", 1000);
        guitarra.tocar();
        System.out.println(guitarra.getNomInstrument());
        System.out.println(guitarra.getPreuInstrument());

        Corda guitarra1 = new Corda("Otra", 2000);
        guitarra1.tocar();

        System.out.println("\n********** instància de classe Vent ***************");
        Vent saxo = new Vent("Selmer", 1200);
        saxo.tocar();
        System.out.println(saxo.getNomInstrument());
        System.out.println(saxo.getPreuInstrument());

        System.out.println("\n********** instància de classe Percussio **********");
        Percussio bateria = new Percussio("Yamaha", 1500);
        bateria.tocar();
        System.out.println(bateria.getNomInstrument());
        System.out.println(bateria.getPreuInstrument());
    }
}
