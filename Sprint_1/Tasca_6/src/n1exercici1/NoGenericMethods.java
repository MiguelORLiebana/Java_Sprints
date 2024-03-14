package n1exercici1;

public class NoGenericMethods {

    private Cotxe[] cotxe = new Cotxe[3];

    public NoGenericMethods(String model1, String model2, String model3){
        this.cotxe[0] = new Cotxe(model1);
        this.cotxe[1] = new Cotxe(model2);
        this.cotxe[2] = new Cotxe(model3);
    }

    public void saveObjects(Cotxe cotxe1, Cotxe cotxe2, Cotxe cotxe3){
        this.cotxe[0] = cotxe1;
        this.cotxe[1] = cotxe2;
        this.cotxe[2] = cotxe3;
    }
    public Cotxe[] getCotxes(){

        return cotxe;
    }

    public void setCotxes(String model1, String model2, String model3){
        this.cotxe[0].setModel(model1);
        this.cotxe[1].setModel(model2);
        this.cotxe[2].setModel(model3);
    }
}
