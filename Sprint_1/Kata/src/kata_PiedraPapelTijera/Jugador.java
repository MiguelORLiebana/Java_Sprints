package kata_PiedraPapelTijera;

public class Jugador {

    private String nombre;
    private valoresJugada jugada;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public void setJugada(int valor) {
        if (valor == 1) this.jugada = valoresJugada.piedra;
        else if (valor == 2) this.jugada = valoresJugada.papel;
        else if (valor == 3) this.jugada = valoresJugada.tijera;
    }

    public valoresJugada getJugada() {
        return this.jugada;
    }

    public String getNombre() {
        return this.nombre;
    }
}
