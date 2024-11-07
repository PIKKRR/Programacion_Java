package Arrays;
import java.util.*;

/* Crear un arraylist con 5 valores de tipo integer. Calcular la media de todos los valores. 
Visualizar todos los valores y la media 
Autor: Jose P. Couso  "Blayneraptor"*/

public class ArrayList10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        double suma = 0;
        for (int i = 0; i < 5; i++) {
        System.out.println("Introduce el número para la posición: " + i);
            numeros.add(sc.nextInt());
            suma += numeros.get(i);
        }
        sc.close();

        System.out.println("Valores introducidos: " + numeros);
        System.out.println("La media de los números sería: " + suma / numeros.size());

    }
}

