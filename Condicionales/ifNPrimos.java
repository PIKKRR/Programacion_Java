package Condicionales;
import java.util.Scanner;

/*
Desarrolla un programa que solicite al usuario ingresar un número.
Luego, determina y muestra todos los números primos entre 1 y el número ingresado.
Al final, muestra cuántos números primos encontró.
Autor: Antonio Casamitjana 'PIKKRR'
*/

public class ifNPrimos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num = sc.nextInt();
        int contador = 0;

        for (int i = 2; i <= num; i++) {
            if (esPrimo(i)) {
                contador++;
                System.out.println("Es un número primo: " + i);
            }
        }sc.close();

        System.out.println("Total de números primos entre 1 y " + num + ": " + contador);
    }

    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
        
    }
}
