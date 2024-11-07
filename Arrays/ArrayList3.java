package Arrays;
import java.util.ArrayList;

/* 
Desarrolla un programa Java que calcule la suma de números enteros almacenados en un ArrayList.
Utiliza un bucle for-each para recorrer los elementos y sumarlos.
Finalmente, muestra la suma total en la consola, hazlo tambien con un bucle for.

Autor: Jose P. Couso  "Blayneraptor" 

*/

public class ArrayList3 {
    
    public static void main(String[] args) {
        
    ArrayList<Integer> lista= new ArrayList<>();
    lista.add(2);
    lista.add(10);
    lista.add(20);
    lista.add(3);

    System.out.println("Números en la lista " + lista);

    //Con el for normal

    int suma=0;
    for (int i=0;i<lista.size();i++){
        suma+=lista.get(i);
    }
    System.out.println("La suma de los números del array con el bucle for es: " + suma);

    //Con el ForEach

    int sumaForEach=0;
    for (int suma2 : lista)
    sumaForEach+=suma2;
    System.out.println("La suma de los números del array con el bucle for-each es: " + sumaForEach);

    }

}