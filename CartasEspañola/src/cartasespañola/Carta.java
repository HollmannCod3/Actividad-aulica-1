
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
    private String palo;
    HashMap<String, Character> stringToCharMap = new HashMap<String, Character>() {{
            put("Oro", 'O');
            put("Basto", 'B');
            put("Copa", 'C');
            put("Espada", 'E');
        }};

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }
    
    

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }
    
    
    @Override
    public String toString() {
        char charPalo = stringToCharMap.get(palo);
        return  numero + charPalo + "\t";
    }
    
    
    
    
    
}
