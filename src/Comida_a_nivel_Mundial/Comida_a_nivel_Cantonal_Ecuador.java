package Comida_a_nivel_Mundial;

public class Comida_a_nivel_Cantonal_Ecuador extends Comida_a_Nivel_Nacional{
    private String ciudad;
    public Comida_a_nivel_Cantonal_Ecuador(String nombre, int integrantes, String ciudad) {
        super(nombre, integrantes, "Ecuador");
        setCiudad(ciudad);
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public void imprimirAtributos(){
        super.imprimirAtributos();
        System.out.println("Ciudad o Cantón: " + ciudad);
    }
}
