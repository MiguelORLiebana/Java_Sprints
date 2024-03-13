package n1exercici1;

public class TreballadorOnline extends Treballador {

    private String nom;
    private String cognom;
    private Integer preuHora;

    private final Integer tarifaInternet = 100;

    public TreballadorOnline(String nom, String cognom, Integer preuHora){
        super(nom, cognom, preuHora);
        this.nom = nom;
        this.cognom = cognom;
        this.preuHora = preuHora;
    }

    @Override
    public void calcularSou(Integer hores){
        Integer sou = preuHora * hores + tarifaInternet;
        System.out.println("Soy del Treballador Online: " + sou);
    }
}
