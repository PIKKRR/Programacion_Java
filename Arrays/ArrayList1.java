package Arrays;
import java.util.ArrayList;
import java.util.HashSet;

public class ArrayList1 {

    /*Desarrolla un programa en Java que elimine elementos duplicados de un ArrayList.
    Crear un ArrayList con elementos duplicados.
    Utilizar un HashSet para eliminar los elementos duplicados del ArrayList.
    Limpiar el ArrayList original.
    Añadir todos los elementos únicos del HashSet de vuelta al ArrayList.
    Finalmente, imprimir el ArrayList resultante, que ahora contendrá solo elementos únicos.
    
    Autor: Antonio Casamitjana 'PIKKRR' */

    public static void main(String[] args) {
       
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(2);
        lista.add(1);
        lista.add(5);
        
        System.out.println("Lista original: " + lista);
        
        HashSet<Integer> conjunto = new HashSet<>(lista);
        lista.clear();
        lista.addAll(conjunto);
        
        System.out.println("Lista sin elementos repetidos: " + lista);
    }
}
