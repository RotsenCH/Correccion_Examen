package Videojuegos;

public class Videojuego {
    private String nombre, empresa;
    private int anio;

    public Videojuego(String nombre, String empresa, int anio){
        this.nombre = nombre;
        this.empresa = empresa;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void imprimirAtributos(){
        System.out.println("Nombre del Videojuego: " + nombre
                + "\nEmpresa que lo creo: " + empresa
                + "\nAño de Creacion: " + anio);
    }
}
