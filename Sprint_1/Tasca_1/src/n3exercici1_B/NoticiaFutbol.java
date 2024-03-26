package n3exercici1_B;

public class NoticiaFutbol extends Noticia implements NoticiaPreuPunts{

    private String jugador;
    private String competicio;
    private String club;
    private int preu = 300;
    private int puntuacio = 5;

    public NoticiaFutbol(String titular, String jugador, String competicio, String club){
        super(titular);
        this.jugador = jugador;
        this.competicio = competicio;
        this.club = club;
        calcularPreuPunts();
    }

    private void isLliga(){
        if(!competicio.contains("Lliga") && competicio.contains("Lliga")) this.puntuacio += 1;
    }

    private void isTorresBenzema(){
        if(jugador.contains("Benzema") || jugador.contains("Ferran Torres")){
            this.puntuacio += 1;
            this.preu += 50;
        }
    }

    private void isCampions(){
        if(competicio.contains("Lliga de Campions")) {
            this.puntuacio += 3;
            this.preu += 100;
        }
    }

    private void isBarçaMadrid(){
        if((club.contains("Barça") || club.contains("Madrid"))) {
            this.puntuacio += 1;
            this.preu += 100;
        }
    }

    @Override
    public void calcularPreuPunts() {
        isBarçaMadrid();
        isCampions();
        isTorresBenzema();
        isLliga();
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
