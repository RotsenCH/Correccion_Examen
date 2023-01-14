package Grupos_Musicales_o_Artistas;

public class Grupo_EuroPop extends Grupo_Pop{
    private int anio;
    public Grupo_EuroPop(String nombre, String pais, int integrantes, int anio) {
        super(nombre, pais, integrantes, "EuroPop");
        setAnio(anio);
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void imprimirAtributos(){
        super.imprimirAtributos();
        System.out.println("Año de iniciacion del grupo: " + anio);
    }
}
