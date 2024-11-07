package Arrays;
import java.util.*;


/* Haz un programa en Java que lea una serie de valores numéricos enteros desde el teclado y los guarde 
en un ArrayList de tipo Integer. La lectura de números enteros termina cuando se introduzca el 
valor -99. Este valor no se guarda en el ArrayList. 
A continuación el programa mostrará por pantalla el número de valores que se han leído, su 
suma y su media. Por último se mostrarán todos los valores leídos, indicando cuántos de ellos 
son mayores que la media.

Autor: Jose P. Couso  "Blayneraptor"*/

public class ArrayList13 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> lista = new ArrayList<Integer>();
        System.out.println("Introduzca los números en el ArrayList, introduzca el número \"-99\" para terminar.");
        int numero;
        do {
            numero = sc.nextInt();
            if (numero != -99) {
                lista.add(numero);
            }
        } while (numero != -99);
        
        if (lista.isEmpty()) {
            System.out.println("No se han introducido números.");
        } else {
            int suma = 0;
            for (int num : lista) {
                suma += num;
            }
            double media = (double) suma / lista.size();
            System.out.println("Número de valores leídos: " + lista.size());
            System.out.println("Suma de los valores: " + suma);
            System.out.println("Media de los valores: " + media);
            
            int mayoresMedia = 0;
            for (int num : lista) {
                if (num > media) {
                    mayoresMedia++;
                }
            }
            System.out.println("Número de valores mayores que la media: " + mayoresMedia);
            
            System.out.println("Valores leídos: " + lista);
        } sc.close();
    }
}
