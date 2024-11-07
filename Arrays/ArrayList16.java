package Arrays;
import java.util.*;

/* Crea un programa para gestionar una lista de números utilizando tanto un ArrayList 
como un array convencional. El programa permitirá realizar operaciones básicas como agregar 
números, calcular la suma y encontrar el número más grande en ambas estructuras.

Autor: Jose P. Couso  "Blayneraptor"*/

public class ArrayList16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<Integer>();

        int numero;
        do {
            System.out.println(
                    "Elija una opción: \n1-Agregar numeros. \n2-Calcular suma. \n3-Encontrar el número más grande. \n4-Convertir Array tradicional. \n5-Salir");
            numero = sc.nextInt();

            switch (numero) {
                case 1:
                    int numerointroducido;
                    do {
                        System.out.println("Introduzca número hasta que escriba \"-99\" ");
                        numerointroducido = sc.nextInt();
                        if (numerointroducido != -99) {
                            lista.add(numerointroducido);
                        }
                        System.out.println(lista);
                    } while (numerointroducido != -99);
                    break;
                case 2:

                    System.out.println(
                            "Elija dos números para sumarlos, escoja las posiciones según el ArrayList empezando desde 0:");
                    System.out.println(lista);
                    System.out.println("Primera posición:");
                    int numerosuma1 = sc.nextInt();
                    System.out.println("Sumar el número " + lista.get(numerosuma1) + " con el número de la posición:");
                    int numerosuma2 = sc.nextInt();
                    System.out.println("La suma del número " + lista.get(numerosuma1) + " y del número "
                            + lista.get(numerosuma2) + " es " + (lista.get(numerosuma1) + lista.get(numerosuma2)));
                    break;
                case 3:
                    if (!lista.isEmpty()) {
                        int maximo = Collections.max(lista);
                        System.out.println("El número más grande de la lista es el " + maximo);
                    } else {
                        System.out.println("La lista está vacía. No hay números para encontrar.");
                    }
                    break;

                case 4:
                    
                    Integer[] array = lista.toArray(new Integer[lista.size()]);
                    
                    System.out.println("Array tradicional: " + Arrays.toString(array));
                    break;
                case 5:
                    System.out.println("Has salido del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        } while (numero != 5);
        sc.close();

    }
}
