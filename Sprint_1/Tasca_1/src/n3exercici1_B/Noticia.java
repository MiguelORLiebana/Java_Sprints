package n3exercici1_B;

public class Noticia {

    private String titular;
    private String text;
    private int puntuacio;
    private int preu;

    public Noticia(String titular){
        this.titular = titular;
        this.text = "";
//        this.preu = preu;
//        this.puntuacio = puntuacio;
    }

    public void mostrarTitular(){
        System.out.println("El titular de la noticia es: " + this.titular);
    }

    public String getTitular(){
        return this.titular;
    }

    public void getPunts(){
        System.out.println("La puntuació és de: " + puntuacio + " punts");
    }

    public void getPreu(){
        System.out.println("El preu és de: " + preu + " euros");
    }
}

