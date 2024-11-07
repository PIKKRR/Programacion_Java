package Arrays;
import java.util.ArrayList;


/* Diseña un arrayList con los siguientes datos:
• Sofía
• Chema
• Alex
• Rosa
Consideraciones
• Mostrar con la propiedad pertinente el tamaño del arraylist.
• Buscar el valor de Juan, con el método en cuestión para ver si lo contiene. 
Mostrar el mensaje si lo contiene o no, según proceda
• Borra el ultimo element del arraylist

Autor: Jose P. Couso  "Blayneraptor" */

public class ArrayList8 {
    
    public static void main(String[] args) {
        
        ArrayList <String> nombres = new ArrayList <String>();
        nombres.add("Sofía");
        nombres.add("Chema");
        nombres.add("Alex");
        nombres.add("Rosa");

        System.out.println("El tamaño del ArrayList es de " + nombres.size() + " nombres");

        if (nombres.contains("Juan")){
            System.out.println("El nombre Juan está dentro del ArrayList.");
        } else {
            System.out.println("El nombre Juan no se encuentra en el ArrayList.");
        }

        nombres.remove(nombres.size()-1);
        System.out.println(nombres);

    }
}
