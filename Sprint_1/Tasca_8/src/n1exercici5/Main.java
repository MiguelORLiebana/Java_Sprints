package n1exercici5;

public class Main {
    public static void main(String[] args) {

//        Solución 1 - Clase anónima
//        FunctInterface obj = new FunctInterface() {
//            @Override
//            public double getValue() {
//                return 3.1415;
//            }
//         };
//
//        System.out.println(String.valueOf(obj.getValue()));


//        Solución 2 - Clase anónima
//        double a = new FunctInterface(){
//            @Override
//            public double getValue(){
//                return 3.14;
//            }
//        }.getValue();
//        System.out.printf(String.valueOf(a));


//      Solución 3 - Lambda
        FunctInterface obj1 = () -> 3.1415;

        System.out.println(obj1.getValue());

    }
}


// Sólo puede contener un método -> https://www.youtube.com/watch?v=QrptTiBP5yk

@FunctionalInterface
interface FunctInterface {
   double getValue();
}