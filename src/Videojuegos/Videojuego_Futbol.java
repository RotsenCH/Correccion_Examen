package Videojuegos;

public class Videojuego_Futbol extends Videojuego_Deportes{

    private int numJugadores;

    public Videojuego_Futbol(String nombre, String empresa, int anio, int numJugadores) {
        super(nombre, empresa, anio, " Fútbol");
        setAnio(numJugadores);
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

    public void imprimirAtributos(){
        super.imprimirAtributos();
        System.out.println("Deporte del videojuego: " + numJugadores);
    }
}
