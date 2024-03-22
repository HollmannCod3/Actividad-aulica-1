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
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Baraja {
    

//    List<Carta> cartas;
    Stack<Carta> cartas; 
    List<Carta> monton;
    private final int numeros[]={1,2,3,4,5,6,7,10,11,12};
    private final String palos[]={"Oro","Basto","Copa","Espada"};
    HashMap<String, Character> stringToCharMap = new HashMap<String, Character>() {{
            put("Oro", 'O');
            put("Basto", 'B');
            put("Copa", 'C');
            put("Espada", 'E');
        }};
    // stringToCharMap.get("Oro") devuelve 'O';

    public Baraja() {
        this.cartas = new Stack<>();
        this.monton = new ArrayList<>();
        
        for(String palo:palos){
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
            Carta carta = cartas.pop();
            monton.add(carta);
            return carta;
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

        if (monton.size() != 0) {
            for (Carta carta : monton) {
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
        
        for (int i = 0; cartas.size() < i; i++) {
            System.out.println(cartas.elementAt(i));
        }

    }

}
