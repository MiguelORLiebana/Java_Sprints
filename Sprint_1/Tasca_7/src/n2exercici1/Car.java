package n2exercici1;

@JsonSerializable(file = "Object.json")
public class Car {
    private String car;

    public Car(String car){
        this.car = car;
    }

    public String getName(){
        return this.car;
    }
}
