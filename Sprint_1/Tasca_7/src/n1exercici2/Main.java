package n1exercici2;


public class Main {
    @SuppressWarnings({"removal"})
    public static void main(String[] args) {

        Treballador treballador = new Treballador("Marc", "Pou", 20);
        TreballadorPresencial treballadorP = new TreballadorPresencial("Lluisa", "Perez", 30);
        TreballadorOnline treballadorO = new TreballadorOnline("Jordi", "Andreu", 40);

        treballador.calcularSou(150);
        treballadorP.calcularSou(150);
        treballadorO.calcularSou(150);

        System.out.println("********** Method Deprecated ***************");

        treballadorP.saludar();
        treballadorO.deprecatedMethod();
    }
}
