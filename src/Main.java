import java.util.Scanner;

import Comida_a_nivel_Mundial.Comida_a_Nivel_Mundial;
import Comida_a_nivel_Mundial.Comida_a_Nivel_Nacional;
import Comida_a_nivel_Mundial.Comida_a_nivel_Cantonal_Ecuador;
import Videojuegos.*;
import Grupos_Musicales_o_Artistas.*;
import Grupos_Musicales_o_Artistas.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        boolean pausar = false;
        try{
            while(!pausar){
                int opMenu = menuPrincipal();
                switch (opMenu){
                    case 1:{
                        System.out.println("\n\t1. Videojuegos");
                        List listaVideojuegos = new ArrayList();
                        listaVideojuegos.add(new Videojuego("Dota 2", "Valve", 2006));
                        listaVideojuegos.add(new Videojuego_Deportes("Basquet Dream", "Epic Game", 2010,"Basquet"));
                        listaVideojuegos.add(new Videojuego_Futbol("Dota 2", "Valve", 2006,5));

                        for (int i = 0; i < listaVideojuegos.size(); i++){
                            System.out.println("\n\tVideojuego #" + (i + 1));
                            Videojuego v = (Videojuego) listaVideojuegos.get(i);

                            v.imprimirAtributos();

                            System.out.println("");
                        }
                    }break;
                    case 2:{
                        System.out.println("\n\t2. Grupos Musicales o Artistas");
                        List listaGrupoMusical = new ArrayList();

                        listaGrupoMusical.add(new Grupo_Musical_o_Artista("Green Day", "Inglaterra", 4));
                        listaGrupoMusical.add(new Grupo_Pop("Muse", "Estados Unidos", 5, "Pop Rock"));
                        listaGrupoMusical.add(new Grupo_EuroPop("MSM", "Canada", 1, 2015));

                        for (int i = 0; i < listaGrupoMusical.size(); i++){
                            System.out.println("\n\tGrupo Musical #" + (i + 1));
                            Grupo_Musical_o_Artista v = (Grupo_Musical_o_Artista) listaGrupoMusical.get(i);

                            v.imprimirAtributos();

                            System.out.println("");
                        }
                    }break;
                    case 3:{
                        System.out.println("\n\t3. Comida a Nivel Mundial");
                        List listaComida = new ArrayList();

                        listaComida.add(new Comida_a_Nivel_Mundial("Seco de Pollo", 4));
                        listaComida.add(new Comida_a_Nivel_Nacional("Tacos", 5, "México"));
                        listaComida.add(new Comida_a_nivel_Cantonal_Ecuador("Encebolado", 10, "Manabí"));

                        for (int i = 0; i < listaComida.size(); i++){
                            System.out.println("\n\tVideojuego #" + (i + 1));
                            Comida_a_Nivel_Mundial v = (Comida_a_Nivel_Mundial) listaComida.get(i);

                            v.imprimirAtributos();

                            System.out.println("");
                        }

                    }break;
                    case 4:{
                        System.out.printf("Saliendo......");
                        pausar = true;
                    }
                }

            }
        }catch (Exception ex){
            System.out.println("\n\tDato no válido, ingrese un dato válido" + ex.getLocalizedMessage());
        }
    }
    public static int menuPrincipal(){
        int op = 0;//Variable paa recoger la opcion del menu ingresado por el usuario
        System.out.println("\n\t\tMenú de Opciones");
        System.out.println("\t1. Videojuegos");
        System.out.println("\t2. Grupos Musicales o Artistas");
        System.out.println("\t3. Comida a Nivel Mundial");
        System.out.println("\t4. Salir");
        System.out.print("\n\tIngresa una Opcion: ");
        op = sc.nextInt();
        while ((op < 1) || (op > 4)){
            System.out.print("Ingrese una opcion en el rango 1-4: ");
            op = sc.nextInt();
        }
        return op;
    }

}