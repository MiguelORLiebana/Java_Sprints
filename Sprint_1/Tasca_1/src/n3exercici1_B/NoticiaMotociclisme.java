package n3exercici1_B;

public class NoticiaMotociclisme extends Noticia implements NoticiaPreuPunts{

    private String equip;
    private int preu;
    private int puntuacio;

    public NoticiaMotociclisme(String titular, String equip){
        super(titular);
        this.equip = equip;
        this.preu = 100;
        this.puntuacio = 3;
    }

    private void isEscuderiaMoto(){
        if(equip.contains("Honda") ||(equip.contains("Yamaha"))){
            this.puntuacio += 3;
            this.preu += 50;
        }
    }

    @Override
    public void calcularPreuPunts() {
        isEscuderiaMoto();
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
