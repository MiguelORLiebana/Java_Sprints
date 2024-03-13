package n1exercici2;

public class Treballador {

    private String nom;
    private String cognom;
    private Integer preuHora;

    public Treballador(String nom, String cognom, Integer preuHora){
        this.nom = nom;
        this.cognom = cognom;
        this.preuHora = preuHora;
    }

    public void calcularSou(Integer hores){
        Integer sou = hores * preuHora;
        System.out.println("Sou del Treballador: " + sou);
    }
}

