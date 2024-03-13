package n1exercici1;

public class Main {
    public static void main(String[] args) {

        //String directory = "/Users/mike/Desktop";

        Llista llista = new Llista();

        try{
            llista.llistarContingut(args[0]);
        } catch(ArrayIndexOutOfBoundsException e){
            e.getMessage();
        }
    }

}
