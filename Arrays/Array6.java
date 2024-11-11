package Arrays;
import java.util.Scanner;

/* Desarrolla un programa en Java que solicite al usuario ingresar la longitud
de una tabla o array. Luego, inicializa el array con números del 1 al tamaño
especificado e imprime la tabla utilizando diferentes tipos de bucles: for,
while y visualmente con barras verticales.
Autor: Antonio Casamitjana 'PIKKRR'  */

public class Array6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Introduce el número de celdas de la tabla o array:");
        int longitud = sc.nextInt();

      
        int[] tabla = new int[longitud];
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = i + 1;
        }

        System.out.println("Imprimir la tabla con un bucle for:");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(tabla[i] + " ");
        }
        System.out.println(); 

        System.out.println("Imprimir la tabla con un bucle while:");
        int j = 0;
        while (j < tabla.length) {
            System.out.print(tabla[j] + " ");
            j++;
        }
        System.out.println(); 

        System.out.println("Imprimir la tabla visualmente:");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("| " + tabla[i] + " ");
        } sc.close();
        System.out.println("|"); }
}
