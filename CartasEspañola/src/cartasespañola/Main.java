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

public class Main {

    public static void main(String[] args) {
        Baraja b1 = new Baraja();
        menuCartas(b1);
       
        
        
        
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
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Selecciona una opcion:");
        
        System.out.print("\t[s]iguienteCarta");
        System.out.print("\t[c]artasDisponibles()");
        System.out.print("\t[d]arCartas()");
        System.out.println("");
        
        System.out.print("\t[w]cartasMonton()");
        System.out.print("\t[m]ostrarBaraja()");
        System.out.print("\t[N]ueva Baraja");
        System.out.println("");
        
        System.out.println("\t[Q]uit/Salir");
        System.out.println("-----------------------------------------------------------------------");
    }
    public static void menuCartas(Baraja baraja){
        boolean seguir = true;
        char opcion;
        
        Scanner leer = new Scanner(System.in);
        do{
            mostrarMenuCartas();
            System.out.print("Opcion >> ");
            opcion = leer.nextLine().toUpperCase().charAt(0);
            
            switch (opcion) {
                /*
                [s]iguienteCarta(): Carta 
                    - Devuelve la siguiente carta que está en la baraja, 

                - Cuando no haya más o se haya llegado al final, 
                  se indica al usuario que no hay más cartas.
                */
                case 'S':
                    System.out.println("");
                    System.out.print("\t");
                    System.out.println(baraja.siguienteCarta());                    
                    break;
                    
                // [c]artasDisponibles(): void
                // Indica el número de cartas que aún se puede repartir.    
                case 'C':
                    System.out.println("");
                    System.out.print("\t");
                    baraja.cartasDisponibles();                   
                    break;
                // [D]ar Cartas
                /*
                    [d]arCartas(): List<Carta>

                    Dado un número de cartas que nos pidan, le devolveremos 
                    ese número de cartas.

                    En caso de que haya menos cartas que las pedidas, 
                    no devolveremos nada, pero debemos indicárselo al usuario.
                */
                case 'D':
                    baraja.darCartas();
                    break;
                    
                //[w]cartasMonton()
                /*
                    cartasMonton(): void

                    Mostramos aquellas cartas que ya han salido, si no ha 
                    salido ninguna indicárselo al usuario
                */
                case 'W':
                    baraja.cartasMonton();
                    break;
                    
                // [m]ostrarBaraja()
                /*
                    mostrarBaraja(): void

                    Muestra todas las cartas hasta el final. Es decir, 
                    mostrará las cartas que no se han sacado.
                */
                case 'M':
                    System.out.println("");
                    baraja.mostrarBaraja();
                    
                    break;
                    
                // N]ueva Baraja
                case 'N':
                    baraja = new Baraja();
                    break;
                    
                // [Q]uit/Salir
                case 'Q':
                    System.out.println("\n"
                            + "\t"
                            + "Goodbye!"
                            + "\n");
                    seguir = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while(seguir);
    }

}
