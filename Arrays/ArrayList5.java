package Arrays;

import java.util.ArrayList;

/* Haz varios usos de los métodos que tiene el ArrayList, lastIndexOf, remove, set, size, subList, toArray.
Autor: Antonio Casamitjana 'PIKKRR' */ 


public class ArrayList5 {

    public static void main(String[] args) {
    
    ArrayList <Integer> numeros= new ArrayList<Integer>();

    numeros.add(5);
    numeros.add(7);
    numeros.add(2);
    numeros.add(1);
    numeros.add(2);
    numeros.add(12);

    System.out.println(numeros);

    //Usando .lastIndexOf, te dice la posición desde el final del valor que le pidas.

     System.out.println(numeros.lastIndexOf(2));

    //Usando .remove, elimina el valor de la posición que le indicas.

    System.out.println(numeros.remove(0));

    System.out.println(numeros);

    //Usando .set, actualiza el valor de la posición que le indicas.

    numeros.set(1,10);

    System.out.println(numeros);

    //Usando .size, te dice el tamaño del array.

    System.out.println(numeros.size());

    //Usando .subList, te dice los valores desde una posición inicial a una final.

    System.out.println(numeros.subList(2, 4));

    //Usando .toArray, convierte el ArrayList en un array normal.

    Integer [] arraynumeros=numeros.toArray(new Integer[numeros.size()]);

    for (int i=0;i<arraynumeros.length;i++){
        System.out.print(arraynumeros[i] + " ");
      }
    }
}
