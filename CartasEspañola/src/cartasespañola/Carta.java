
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

import java.util.HashMap;

/**
 *
 * @author adam
 */
public class Carta {
    
/*

 */

    private int numero;
    private char palo;
    HashMap<Character, String> charToStringMap = new HashMap<Character,String>() {{
            put('O', "Oro   ");
            put('B' ,"Basto " );
            put('C', "Copa  ");
            put('E', "Espada" );
        }};

    public Carta(int numero, char palo) {
        this.numero = numero;
        this.palo = palo;
    }
    
    

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPalo(char palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public char getPalo() {
        return palo;
    }
    
    
    @Override
    public String toString() {
        String strPalo = charToStringMap.get(palo);
        return  numero + " de " +  strPalo + "\t";
    }
    
    
    
    
    
}
