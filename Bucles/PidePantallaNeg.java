package Bucles;
import java.util.Scanner;

/*
Desarrolla un programa que solicite al usuario ingresar números enteros. La suma de los números se calculará hasta que se ingrese un número negativo.
Autor: Jose P. Couso "Blayneraptor"
*/

public class PidePantallaNeg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int suma = 0;

        do {
            System.out.println("Introduce un número (introduce un número negativo para finalizar):");
            numero = sc.nextInt();

            if (numero >= 0) {
                suma += numero;
            }

        } while (numero >= 0);

        System.out.println("La suma de los números introducidos es: " + suma);

        sc.close();
    }
}
