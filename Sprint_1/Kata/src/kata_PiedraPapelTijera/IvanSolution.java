package kata_PiedraPapelTijera;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class IvanSolution {

    public static void main(String[] args) {

        List<String> optionsList = Arrays.asList("scissors", "paper", "rock");

        Random random = new Random();

        int randomGame = random.nextInt(optionsList.size());
        String player1 = optionsList.get(randomGame);
        System.out.println("Player 1 throw: " + player1);

        randomGame = random.nextInt(optionsList.size());
        String player2 = optionsList.get(randomGame);
        System.out.println("Player 2 throw: " + player2);

        System.out.println(getWinner(player1, player2));
    }

    public static String getWinner(String p1, String p2) {
        return p1.equals(p2) ?
                "Draw!" :
                "Player " + ("scissorspaper paperrock rockscissors".contains(p1+p2) ?
                        1 : 2 ) + " won!";
    }

    /*
        El operador ternario es una forma concisa de escribir una declaración if-else en una sola línea. Se compone de tres partes:

            -La condición a evaluar (condición booleana)
            -El valor si la condición es verdadera (valor verdadero)
            -El valor si la condición es falsa (valor falso)

            String mensaje = (edad >= 18) ? “Eres mayor de edad” : “Eres menor de edad”;
            System.out.println(mensaje);
     */
}