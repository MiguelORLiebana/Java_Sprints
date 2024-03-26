package n3exercici1_B;

public class NoticiaF1 extends Noticia implements NoticiaPreuPunts{

    private String escuderia;
    private int preu;
    private int puntuacio;

    public NoticiaF1(String titular, String escuderia){
        super(titular);
        this.escuderia = escuderia;
        this.preu = 100;
        this.puntuacio = 4;
    }

    private void isEscuderiaF1(){
        if(escuderia.contains("Mercedes") ||(escuderia.contains("Ferrari"))){
            this.puntuacio += 3;
            this.preu += 50;
        }
    }

    @Override
    public void calcularPreuPunts() {
        isEscuderiaF1();
    }

    @Override
    public void getPunts(){
        System.out.println("La puntuació és de: " + puntuacio + " punts");
    }

    @Override
    public void getPreu(){
        System.out.println("El preu és de: " + preu + " euros");
    }
}
