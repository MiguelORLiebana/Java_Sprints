package n3exercici1_B;

public class NoticiaTenis extends Noticia implements NoticiaPreuPunts {

    private String competicio;
    private String tenista;
    private int preu;
    private int puntuacio;

    public NoticiaTenis(String titular, String tenista){
        super(titular);
        this.tenista = tenista;
        this.preu = 150;
        this.puntuacio = 4;
    }

    private void isTenistas(){
        if(tenista.contains("Nadal") ||(tenista.contains("Djokkovic")) ||(tenista.contains("Federer"))){
            this.puntuacio += 3;
            this.preu += 100;
        }
    }

    @Override
    public void calcularPreuPunts() {
        isTenistas();
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
