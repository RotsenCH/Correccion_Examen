package Comida_a_nivel_Mundial;

public class Comida_a_Nivel_Nacional extends Comida_a_Nivel_Mundial{
    private String pais;

    public Comida_a_Nivel_Nacional(String nombre, int integrantes, String pais) {
        super(nombre, integrantes);
        setPais(pais);
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void imprimirAtributos(){
        super.imprimirAtributos();
        System.out.println("Pais nativo: " + pais);
    }
}
