package Videojuegos;

public class Videojuego_Deportes extends Videojuego{
    private String deporte;

    public Videojuego_Deportes(String nombre, String empresa, int anio, String deporte) {
        super(nombre, empresa, anio);
        setDeporte(deporte);
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public void imprimirAtributos(){
        super.imprimirAtributos();
        System.out.println("Deporte del videojuego: " + deporte);
    }
}
