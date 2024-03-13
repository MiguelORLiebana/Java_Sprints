package n1exercici2;

import n1exercici1.Treballador;

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

    @Deprecated (since = "1.0", forRemoval = true)
    public void deprecatedMethod(){
        System.out.println("Método deprecado");
    }
}
