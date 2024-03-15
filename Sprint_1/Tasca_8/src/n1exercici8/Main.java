package n1exercici8;

public class Main {
    public static void main(String[] args) {

        String name = "hola";


        IReverse reverseF = (a) -> {
            StringBuffer str = new StringBuffer(a);
            str.reverse();
            return str.toString();
        };

        System.out.printf(reverseF.reverse(name));

    }
}

@FunctionalInterface
interface IReverse{
    String reverse(String reverse);
}
