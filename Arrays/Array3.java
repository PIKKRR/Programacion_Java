package Arrays;
public class Array3 {
    
    
/* Desarrolla un programa en Java que inicialice dos arrays: uno de cadenas de texto con las letras "a", "e", "r", "t", "y", "v", y otro de números enteros del 1 al 6 en orden ascendente.
El programa debe crear un tercer array que contenga la suma de los elementos de los dos primeros arrays.
Imprimir la longitud del tercer array.
 Autor: Jose P. Couso  "Blayneraptor"  */

    public static void main(String[] args) {
        
        String lista[]={"a","e","r","t","y","v"};
        int lista2[]={1,2,3,4,5,6};

        
        int lista3[]=new int[lista.length+lista2.length];

        System.out.println(lista3.length);


    }
}
