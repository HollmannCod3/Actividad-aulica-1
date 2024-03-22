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
import java.util.List;

public class Baraja {
    

    List<Carta> cartas;
    List<Carta> monton;
    private final int numeros[]={1,2,3,4,5,6,7,10,11,12};
    private final String palos[]={"oro","basto","copa","espada"};

    public Baraja() {
        this.cartas = new ArrayList<>();
        this.monton = new ArrayList<>();
        
        for(String palo:palos){
            for(int numero:numeros){
                cartas.add(new Carta(numero, palo));
            }
        }
        barajar();
        
    }
    
    
    // barajar(): cambia de posición todas las cartas aleatoriamente.
    public final void barajar(){
        List<Carta> cartasMezcladas = new ArrayList<>();
        while(cartas.size() > 0){
            int randomIndex = (int) (Math.random() * cartas.size());
            cartasMezcladas.add(cartas.get(randomIndex));
            cartas.remove(randomIndex);
        }
        cartas = cartasMezcladas;
    }
    
    /*
    // siguienteCarta(): Carta 
    Devuelve la siguiente carta que está en la baraja, 
    
    // Cuando no haya más o se haya llegado al final, 
    // se indica al usuario que no hay más cartas.
    */
    public Carta siguienteCarta(){
        
        return null;
    
    }
    
    // cartasDisponibles(): void
    // Indica el número de cartas que aún se puede repartir.
    public void cartasDisponibles(){
        
    }
    
    /*
    darCartas(): List<Carta>
    
    Dado un número de cartas que nos pidan, le devolveremos 
    ese número de cartas. En caso de que haya menos cartas que las pedidas, 
    no devolveremos nada, pero debemos indicárselo al usuario.
    */
    public List<Carta> darCartas(){
        
        return null;
    }
    
    /*
    cartasMonton(): void
    
    Mostramos aquellas cartas que ya han salido, si no ha 
    salido ninguna indicárselo al usuario
    */
    
    public void cartasMonton(){
        
    }
    
    /*
    mostrarBaraja(): void
    
    Muestra todas las cartas hasta el final. Es decir, 
    mostrará las cartas que no se han sacado.
    */
    public void mostrarBaraja(){
        
    }

}
