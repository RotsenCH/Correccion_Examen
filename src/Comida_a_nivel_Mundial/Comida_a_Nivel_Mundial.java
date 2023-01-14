package Comida_a_nivel_Mundial;

public class Comida_a_Nivel_Mundial {
    private String nombre;
    private int ingredientes;

    public Comida_a_Nivel_Mundial(String nombre, int ingredientes){
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(int ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void imprimirAtributos(){
        System.out.println("Nombre del Platillo: " + nombre
                + "\nNúmero de ingredientes: " + ingredientes);
    }
}
