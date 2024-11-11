package Condicionales;
import java.util.Scanner;

/*
Desarrolla un programa que solicite al usuario ingresar una serie de números positivos.
El programa calculará la media de los números positivos ingresados. 
El programa terminará cuando se ingrese un número negativo.
Autor: Antonio Casamitjana 'PIKKRR'
*/

public class ifCalcularNum {
    public static void main(String[] args) {
        
        int num1 = 0;
        double suma = 0;
        int contador = 0;
        double resultado = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce un número. (Introduce un número negativo para terminar)");
            num1 = sc.nextInt();
            if (num1 < 0) {
                System.out.println("Has terminado, la media de los números positivos es: " + suma + " entre " + contador + " números introducidos, es igual a: " + resultado);
            } else {
                suma += num1;
                contador++;
                resultado = suma / contador;
            }

        } while (num1 >= 0);
        sc.close();

    }
}
