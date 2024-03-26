package n1exercici1;

public abstract class Instrument {
    private String nom;
    private int preu;

    public Instrument(String nom, int preu){
        this.nom = nom;
        this.preu = preu;
    }

    abstract void tocar();

    static {
        System.out.println("Instrument init");
    }

    public String getNomInstrument(){
        return "El nom del instrument és: " + this.nom;
    }

    public String getPreuInstrument(){
        return "El preu del instrument és: " + this.preu;
    }
}
