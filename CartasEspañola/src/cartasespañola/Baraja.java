/* @author Nicolas_Hollmann */
 

package cartasespañola;

import java.util.ArrayList;
import java.util.List;

public class Baraja {
   private List<Cartas> cartas;

    public void Baraja() {
        cartas = new ArrayList<>();
        String[] palos = {"Espadas", "Bastos", "Oros", "Copas"};
        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new Cartas(numero,palo));
                }
            }
        }
        System.out.println(cartas);
    }
}


