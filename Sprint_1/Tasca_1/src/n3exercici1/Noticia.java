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

    public Integer getPunts(String titular){
        calculPuntsIPreu(titular);
        return this.puntuacio;
    }

    public Integer getPreu(String titular){
        calculPuntsIPreu(titular);
        return this.preu;
    }

    public void calculPuntsIPreu(String titular){
        this.puntuacio = 0;
        this.preu = 0;
        this.esport = getEsport(titular);

        if(isFutbol()){
            this.puntuacio += 5;
            this.preu += 300;
            isCampions(titular);
            isLliga(titular);
            isBarçaMadrid(titular, Esports.futbol);
            isTorresBenzema(titular);
        } else if(isTenis()){
            this.puntuacio += 4;
            this.preu += 150;
            isTenistas(titular);
        } else if(isF1()){
            this.puntuacio += 3;
            this.preu += 100;
            isEscuderiaF1(titular);
        } else if(isMotociclisme()){
            this.puntuacio += 3;
            this.preu += 100;
            isEscuderiaMoto(titular);
        } else if(isBasquet()){
            puntuacio += 4;
            isEurolliga(titular);
            isACB(titular);
            isBarçaMadrid(titular, Esports.basquet);
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
        if(titular.contains("Benzema") || titular.contains("Ferran Torres")){
            this.puntuacio += 1;
            this.preu += 50;
        }
    }

    private void isCampions(String titular){
        if(titular.contains("Lliga de Campions")) {
            this.puntuacio += 3;
            this.preu += 100;
        }
    }
    private void isEurolliga(String titular){
        if(titular.contains("Eurolliga")) this.puntuacio += 3;
    }
    private void isACB(String titular){
        if(titular.contains("ACB")) this.puntuacio += 2;
    }
    private void isBarçaMadrid(String titular, Esports esport){
        if((titular.contains("Barça") || titular.contains("Madrid")) && esport.equals(Esports.futbol)) {
            this.puntuacio += 1;
            this.preu += 100;
        } else if((titular.contains("Barça") || titular.contains("Madrid")) && esport.equals(Esports.basquet)){
            this.puntuacio += 1;
            this.preu += 75;
        }
    }

    private void isEscuderiaF1(String titular){
        if(titular.contains("Mercedes") ||(titular.contains("Ferrari"))){
            this.puntuacio += 3;
            this.preu += 50;
        }
    }

    private void isEscuderiaMoto(String titular){
        if(titular.contains("Honda") ||(titular.contains("Yamaha"))){
            this.puntuacio += 3;
            this.preu += 50;
        }
    }

    private void isTenistas(String titular){
       if(titular.contains("Nadal") ||(titular.contains("Djokkovic")) ||(titular.contains("Federer"))){
           this.puntuacio += 3;
           this.preu += 100;
       }
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

