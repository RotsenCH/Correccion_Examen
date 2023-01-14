package Grupos_Musicales_o_Artistas;

public class Grupo_Musical_o_Artista {
    private String nombre, pais;
    private int integrantes;

    public Grupo_Musical_o_Artista(String nombre, String pais, int integrantes){
        this.nombre = nombre;
        this.pais = pais;
        this.integrantes = integrantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }

    public void imprimirAtributos(){
        System.out.println("Nombre del Grupo o Artista: " + nombre
                + "\n Pais nativo: " + pais
                + "\nNúmero de integrantes: " + integrantes);
    }
}
