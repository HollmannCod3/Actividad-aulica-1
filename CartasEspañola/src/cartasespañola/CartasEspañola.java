/**
 * https://github.com/HollmannCod3/Actividad-aulica-1
 *
 * @authors:
 *           Alexis Allendez        https://github.com/AlexisAllendez
 *           Enzo Casalegno         https://github.com/EnzoCasalegno
 *           Nicolás Hollmann       https://github.com/HollmannCod3
 *           Adam Rigg              https://github.com/adamulp/
 */

package cartasespañola;

import java.util.List;
import java.util.Scanner;


/*
 * barajar(): cambia de posición todas las cartas aleatoriamente.

 *  siguienteCarta(): devuelve la siguiente carta que está en la baraja, 
    cuando no haya más o se haya llegado al final, se indica al usuario que 
    no hay más cartas.

 * cartasDisponibles(): indica el número de cartas que aún se puede repartir.

 *  darCartas(): dado un número de cartas que nos pidan, le devolveremos 
    ese número de cartas. En caso de que haya menos cartas que las pedidas, 
    no devolveremos nada, pero debemos indicárselo al usuario.

 *  cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha 
    salido ninguna indicárselo al usuario

 *  mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, 
    mostrará las cartas que no se han sacado.
 */

public class CartasEspañola {

    public static void main(String[] args) {
        
    }
    
    public static void mostrarCarta(Carta carta){
        System.out.println(carta);
    }
    
    public static void mostrarCartas(List<Carta> cartas){
        for(Carta carta:cartas){
            mostrarCarta(carta);
        }
    }
    public static void mostrarMenuCartas(){
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("Selecciona una opcion:");
        System.out.println("\t[s]iguienteCarta");
        System.out.println("\t[[c]artasDisponibles()");
        System.out.println("\t[d]arCartas()");
        System.out.println("\t[w]cartasMonton()");
        System.out.println("\t[m]ostrarBaraja()");
        System.out.println("\t[N]uevo Baraja");
    }
    public static void menuCartas(){
        boolean opcionInvalida = true;
        Character opcion = null;
        Scanner leer = new Scanner(System.in);
        do{
            mostrarMenuCartas();
            opcion = leer.nextLine().toUpperCase().charAt(0);
            switch (opcion) {
                case 'S':
                    opcionInvalida = false;
                    break;
                case 'C':
                    opcionInvalida = false;
                    break;
                case 'D':
                    opcionInvalida = false;
                    break;
                case 'W':
                    opcionInvalida = false;
                    break;
                case 'M':
                    opcionInvalida = false;
                    break;
                case 'N':
                    opcionInvalida = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while(opcionInvalida);
    }

}
