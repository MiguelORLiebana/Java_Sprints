package n2exercici1;


public class Main {

    public static void main(String[] args) {

        Entrada entrada = new Entrada();

        try{
            entrada.executar();
        }catch(Exception e){
            System.out.printf("Error");
        }
    }
}
