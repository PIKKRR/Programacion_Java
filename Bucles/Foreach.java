package Bucles;
import java.util.*;

public class Foreach {

    /* Haz un programa que use el bucle For-each usando una suma de enteros.
 Autor: Jose P. Couso  "Blayneraptor" 
 */
    
    public static void main(String[] args) {
        
        ArrayList<Integer> lista = new ArrayList<Integer>();

        lista.add(2);
        lista.add(9);
        lista.add(20);
        lista.add(12);

        int suma=0;

        for (int numeros:lista){
            suma+=numeros;
        }
        System.out.println(suma);
    }
}
