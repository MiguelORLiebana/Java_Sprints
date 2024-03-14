package n1exercici5;

public class Main {
    public static void main(String[] args) {

        //Forma 1
        FunctInterface obj = new FunctInterface() {
            @Override
            public double getValue() {
                return 3.1415;
            }
        };

        System.out.printf(String.valueOf(obj.getValue()));


        //Forma 2
        //https://www.geeksforgeeks.org/functional-interfaces-java/   - @FunctionalInterface Annotation

//        FunctInterface obj1 = () -> 3.1;
//
//        System.out.printf(String.valueOf(obj1.getValue()));
    }
}

@FunctionalInterface
interface FunctInterface {
   double getValue();
}