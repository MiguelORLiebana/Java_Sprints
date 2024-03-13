package n1exercici2;


public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        //https://www.tutorialspoint.com/the-suppresswarnings-annotation-in-java#:~:text=The%20%40SuppressWarnings%20annotation%20belongs%20to,and%20the%20warning%20is%20unwarranted.

        Treballador treballador = new Treballador("Marc", "Pou", 20);
        TreballadorPresencial treballadorP = new TreballadorPresencial("Lluisa", "Perez", 30);
        TreballadorOnline treballadorO = new TreballadorOnline("Jordi", "Andreu", 40);

        treballador.calcularSou(150);
        treballadorP.calcularSou(150);
        treballadorO.calcularSou(150);

        treballadorP.saludar();
        treballadorO.deprecatedMethod();
    }
}
