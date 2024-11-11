package Arrays;

/* Desarrolla un programa en Java que inicialice un array de enteros con los números del 1 al 10 en orden ascendente, y luego imprima los elementos en orden descendente.
El programa deberá realizar lo siguiente:
Inicializar un array de enteros con tamaño 10.
Llenar el array con los números del 1 al 10 en orden ascendente.
Imprimir los elementos del array en orden descendente.
Autor: Antonio Casamitjana 'PIKKRR' */ 


public class Array1 {


    public static void main(String[] args) {
       
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
    

        System.out.println("Array en sentido inverso:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]); 
            
        }
    }
}
