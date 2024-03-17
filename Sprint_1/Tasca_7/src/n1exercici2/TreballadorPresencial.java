package n1exercici2;

import n1exercici1.Treballador;

public class TreballadorPresencial extends Treballador {

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
        System.out.println("Sou del Treballador Presencial: " + sou);
    }

    @Deprecated(since = "2.0", forRemoval = true)
    public void saludar(){
        System.out.println("Deprecated method since version 2.0 TreballadorPresencial");
    }
}
