package n3exercici1_B;

public class NoticiaBasquet extends Noticia implements NoticiaPreuPunts{

    private String competicio;
    private String club;
    private int preu;
    private int puntuacio;

    public NoticiaBasquet(String titular, String competicio, String club){
        super(titular);
        this.competicio = competicio;
        this.club = club;
        this.preu = 250;
        this.puntuacio = 4;
    }

    private void isBarçaMadrid(){
        if((club.contains("Barça") || club.contains("Madrid"))) {
            this.puntuacio += 1;
            this.preu += 75;
        }
    }

    private void isEurolliga(){

        if(competicio.contains("Eurolliga")) {
            this.puntuacio += 3;
            this.preu += 75;
        }
    }

    private void isACB(){
        if(competicio.contains("ACB")) this.puntuacio += 2;
    }

    @Override
    public void calcularPreuPunts() {
        isBarçaMadrid();
        isEurolliga();
        isACB();
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
