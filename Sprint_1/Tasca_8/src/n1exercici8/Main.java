package n1exercici8;

public class Main {
    public static void main(String[] args) {

        String name = "hola";
        String nameReverse = "aloh";

        IReverse reverseF = (a) -> {
            StringBuilder str = new StringBuilder(a);
            str.reverse();

            return str.toString();
        };

        System.out.println(reverseF.reverse(name));

        if(nameReverse.equals(reverseF.reverse(name))) System.out.println("It´s Ok!!");
    }
}

@FunctionalInterface
interface IReverse{
    String reverse(String reverse);
}
