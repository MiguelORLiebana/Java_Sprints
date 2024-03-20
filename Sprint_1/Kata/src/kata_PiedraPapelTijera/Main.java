package kata_PiedraPapelTijera;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(" ************ jugar piedra, papel y tijera ************");

        jugar();
    }

    public static void jugar(){
        Boolean finPartida = false;
        Scanner scanner = new Scanner(System.in);
        Jugador player1 = new Jugador("Ana");
        Jugador player2 = new Jugador("Luis");
        Boolean acceso1 = false;
        Boolean acceso2 = false;

        while(!finPartida){
            System.out.println("*********************** Nueva Jugada ***************************");
            acceso1 = false;
            while(!acceso1) {
                acceso1 = false;
                System.out.println("Introducir jugada primer jugador: 1.Piedra 2. papel 3.Tijera ");
                try {
                    Integer a = scanner.nextInt();
                    player1.setJugada(a);
                    acceso1 = true;
                } catch (Exception e) {
                    System.out.println("Error: valor incorrecto. Entra valor jugada de nuevo");
                }
            }

            acceso2 = false;
            while(!acceso2){
                acceso2 = false;
                System.out.println("Introducir jugada segundo jugador: 1.Piedra 2. papel 3.Tijera ");
                try{
                    Integer b = scanner.nextInt();
                    player2.setJugada(b);
                    acceso2 = true;
                } catch(Exception e){
                    System.out.println("Error: valor incorrecto. Entra valor jugada de nuevo");
                }
            }

            if(player1.getJugada() == player2.getJugada()){
                System.out.println("Empatan!!!!!");
            }
            else if(player1.getJugada() == valoresJugada.piedra && player2.getJugada() == valoresJugada.papel){
                System.out.println("Player 2 " + player2.getNombre() + " Wins!!");
            } else if(player1.getJugada() == valoresJugada.papel && player2.getJugada() == valoresJugada.piedra){
                System.out.println("Player 1 " + player1.getNombre() + " Wins!!");
            }else if(player1.getJugada() == valoresJugada.tijera && player2.getJugada() == valoresJugada.papel){
                System.out.println("Player 1 " + player1.getNombre() + " Wins!!");
            } else if(player1.getJugada() == valoresJugada.papel && player2.getJugada() == valoresJugada.tijera){
                System.out.println("Player 2 " + player2.getNombre() + " Wins!!");
            }else if(player1.getJugada() == valoresJugada.tijera && player2.getJugada() == valoresJugada.piedra){
                System.out.println("Player 2 " + player2.getNombre() + " Wins!!");
            } else if(player1.getJugada() == valoresJugada.piedra && player2.getJugada() == valoresJugada.tijera){
                System.out.println("Player 1 " + player1.getNombre() + " Wins!!");
            }
        }
    }
}
