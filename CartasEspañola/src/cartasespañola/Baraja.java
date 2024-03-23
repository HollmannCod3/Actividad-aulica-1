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

import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Baraja {
    

//    List<Carta> cartas;
    Stack<Carta> cartas; 
    List<Carta> monton;
    private final int numeros[]={1,2,3,4,5,6,7,10,11,12};
    private final char palos[]={'O','B','C','E'};
    
    // stringToCharMap.get("Oro") devuelve 'O';

    public Baraja() {
        this.cartas = new Stack<>();
        this.monton = new ArrayList<>();
        
        for(char palo:palos){
            for(int numero:numeros){
                cartas.push(new Carta(numero, palo));
            }
        }
        barajar();
        
    }
    
    
    // barajar(): cambia de posición todas las cartas aleatoriamente.
    public final void barajar(){
//        List<Carta> cartasMezcladas = new ArrayList<>();
//        while(cartas.size() > 0){
//            int randomIndex = (int) (Math.random() * cartas.size());
//            cartasMezcladas.add(cartas.get(randomIndex));
//            cartas.remove(randomIndex);
//        }
//        cartas.addAll(cartasMezcladas);
        Collections.shuffle(cartas);
        
    }
    
    /*
    // siguienteCarta(): Carta 
    Devuelve la siguiente carta que está en la baraja, 
    
    // Cuando no haya más o se haya llegado al final, 
    // se indica al usuario que no hay más cartas.
    */
    public Carta siguienteCarta(){
        try{
            monton.add(cartas.peek());
            return cartas.pop();
        }catch(EmptyStackException e){
            System.out.println("No hay mas cartas");
            return null;
        }
        
    }
    
    // cartasDisponibles(): void
    // Indica el número de cartas que aún se puede repartir.
    public int cartasDisponibles(){
        System.out.println("Hay " + cartas.size() + " disponibles.");
        return cartas.size();
        
    }
    
    /*
    darCartas(): List<Carta>
    
    Dado un número de cartas que nos pidan, le devolveremos 
    ese número de cartas. En caso de que haya menos cartas que las pedidas, 
    no devolveremos nada, pero debemos indicárselo al usuario.
    */
    
    public List<Carta> darCartas(){
        Scanner leer = new Scanner(System.in);
        int numCartas = -1;
        do{
            System.out.print("\n"
                    + "Cuantas cartas?: ");
            try{
                numCartas = Integer.parseInt(leer.nextLine());
                if(numCartas < 0){
                    System.out.println("\n"
                            + "Tiene que ser mayor igual que cero.");
                }
            } catch (NumberFormatException e){
                System.out.println("Solo se puede ingresar numeros enteros.");
            }
        }while(numCartas < 0);
        
        
        return darCartas(numCartas);
    }
    
    public List<Carta> darCartas(int numero){
        if(cartas.size() < numero){
            System.out.println("No hay cartas disponibles.");
            return null;
        }
        List<Carta> cartasParaDar = new ArrayList<>();
        for(int i=0; i < numero;i++){
            cartasParaDar.add(siguienteCarta());
        }
        return cartasParaDar;
        
        
    }
    
    /*
    cartasMonton(): void
    
    Mostramos aquellas cartas que ya han salido, si no ha 
    salido ninguna indicárselo al usuario
    */
    
    public void cartasMonton() {

        if (!monton.isEmpty()) {
            for (Carta carta : monton) {
                System.out.print("\t");
                System.out.println(carta);
            }
            return;
        }
        System.out.println("Todavia no sale ninguna carta");

    }

    /*
    mostrarBaraja(): void
    
    Muestra todas las cartas hasta el final. Es decir, 
    mostrará las cartas que no se han sacado.
    */
    public void mostrarBaraja(){
        int i, j;
        i = j = 0;
        
        while(i < cartas.size()){
            j=0;
            while(i < cartas.size() && j < 4){
                System.out.print(cartas.elementAt(i));
                i++;
                j++;
            }
            System.out.println("");
        }
    }

}
