package n1exercici1;

public class TreballadorPresencial extends Treballador{

    private String nom;
    private String cognom;
    private Integer preuHora;

    private static Integer benzina = 100;

    public TreballadorPresencial(String nom, String cognom, Integer preuHora){
        super(nom, cognom, preuHora);
        this.nom = nom;
        this.cognom = cognom;
        this.preuHora = preuHora;
    }

    @Override
    public void calcularSou(Integer hores){
        Integer sou = hores * preuHora + benzina;
        System.out.println("Soy del Treballador Presencial: " + sou);
    }
}
