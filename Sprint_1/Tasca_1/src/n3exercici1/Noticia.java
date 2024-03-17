package n3exercici1;

public class Noticia {

    enum Esports { futbol, basquet, tenis, f1, motociclisme, error };

    enum Competicio { }
    private String titular;
    private String text;
    private int puntuacio;
    private int preu;
    private Esports esport;

    public Noticia(String titular){
        this.titular = titular;
        this.text = "";
    }

    public void mostrarTitular(){
        System.out.println("El titular de la noticia es: " + this.titular);
    }

    public String getTitular(){
        return this.titular;
    }

    public void getPunts(String titular){
        Esports esport = getEsport(titular);
        this.puntuacio = 0;

        if(isFutbol()){
            puntuacio += 5;
            isCampions(titular);
            isLliga(titular);
            isBarçaMadrid(titular);
            isTorresBenzema(titular);
        } else if(isTenis()){
            puntuacio += 4;
            isTenistas(titular);
        } else if(isF1()){
            puntuacio += 3;
            isEscuderiaF1(titular);
        } else if(isMotociclisme()){
            puntuacio += 3;
            isEscuderiaF1(titular);
        } else if(isBasquet()){
            puntuacio += 4;
            isEurolliga(titular);
            isACB(titular);
            isBarçaMadrid(titular);
        }
    }

    private Esports getEsport(String titular){
        String[] sport = titular.split(" ");

        if(sport[0].contains(Esports.f1.toString())){
            return Esports.f1;
        } else if(sport[0].contains(Esports.basquet.toString())){
            return Esports.basquet;
        } else if(sport[0].contains(Esports.futbol.toString())){
            return Esports.futbol;
        } else if(sport[0].contains(Esports.tenis.toString())) {
            return Esports.tenis;
        } else if(sport[0].contains(Esports.motociclisme.toString())) {
            return Esports.motociclisme;
        }
        return Esports.error;
    }

    private void isLliga(String titular){
        if(titular.contains("Lliga")) this.puntuacio += 1;
    }

    private void isTorresBenzema(String titular){
        if(titular.contains("Benzema") || titular.contains("Ferran Torres")) this.puntuacio += 1;
    }

    private void isCampions(String titular){
        if(titular.contains("Eurolliga")) this.puntuacio += 3;
    }
    private void isEurolliga(String titular){
        if(titular.contains("Eurolliga")) this.puntuacio += 3;
    }
    private void isACB(String titular){
        if(titular.contains("ACB")) this.puntuacio += 2;
    }
    private void isBarçaMadrid(String titular){
        if(titular.contains("Barça") || titular.contains("Madrid")) this.puntuacio += 1;
    }

    private void isEscuderiaF1(String titular){
        if(titular.contains("Mercedes") ||(titular.contains("Ferrari"))) this.puntuacio += 3;
    }

    private void isEscuderiaMoto(String titular){
        if(titular.contains("Honda") ||(titular.contains("Yamaha"))) this.puntuacio += 3;
    }

    private void isTenistas(String titular){
       if(titular.contains("Nadal") ||(titular.contains("Djokkovic")) ||(titular.contains("Federer")))this.puntuacio += 3;
    }

    public boolean isTenis(){
        return esport == Esports.tenis;
    }

    public boolean isFutbol() {
        return esport == Esports.futbol;
    }

    public boolean isF1(){
        return esport == Esports.f1;
    }

    public boolean isBasquet(){
        return esport == Esports.basquet;
    }

    public boolean isMotociclisme(){
        return esport == Esports.motociclisme;
    }
}

