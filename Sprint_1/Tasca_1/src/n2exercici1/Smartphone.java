package n2exercici1;

public class Smartphone extends Telefon implements Camera, Rellotge  {

    Smartphone(String marca, String model){
        super();
        this.marca = marca;
        this.model = model;
    }

    @Override
    public void fotografiar(){
        System.out.println("S’està fent una foto");
    }

    @Override
    public void alarma(){
        System.out.println("Està sonant l’alarma");
    }
}
