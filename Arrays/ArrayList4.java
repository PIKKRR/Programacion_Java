package Arrays;

import java.util.ArrayList;

/* Haz varios usos de los métodos que tiene el ArrayList, contains, get, indexOf, isEmpty, clear.
 Autor: Jose P. Couso  "Blayneraptor" 
 */

public class ArrayList4 {

    public static void main(String[] args) {
        

        ArrayList<String> listaNombres= new ArrayList<String>();

        listaNombres.add("Mesa");
        listaNombres.add("Ordenador");
        listaNombres.add("Silla");
        listaNombres.add("Monitor");
        listaNombres.add("Estufa");
        listaNombres.add("Mesa");

        System.out.println(listaNombres);

       //Usando el .contains, mira a ver si contiene lo que le pregunto

        System.out.println(listaNombres.contains("Mesa"));

        //Usando el .get, dice el objeto según la posición que le pidas

        System.out.println(listaNombres.get(0));

        //Usando el .indexOf, dice la posición en la que está el objeto desde el inicio
        
        System.out.println(listaNombres.indexOf("Mesa"));

        //Usando el .isEmpty, dice si el array está vacio

        System.out.println(listaNombres.isEmpty());

        //Usando el .clear,  borra todo el array

        listaNombres.clear();


    }
}
