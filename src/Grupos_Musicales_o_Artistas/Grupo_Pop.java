package Grupos_Musicales_o_Artistas;

public class Grupo_Pop extends Grupo_Musical_o_Artista{
    private String estilo;

    public Grupo_Pop(String nombre, String pais, int integrantes, String estilo) {
        super(nombre, pais, integrantes);
        setEstilo(estilo);
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public void imprimirAtributos(){
        super.imprimirAtributos();
        System.out.println("Estilo del Grupo Pop: " + estilo);
    }
}
