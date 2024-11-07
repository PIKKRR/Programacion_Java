package Bucles;
import java.util.Scanner;

/*
Desarrolla un programa que solicite al usuario ingresar un número entre 0 y 999,
y luego imprima la cantidad de dígitos que tiene ese número. El programa debe
terminar si el usuario ingresa 0.
Autor: Jose P. Couso "Blayneraptor"
*/

public class TareaBucle4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int digitos;

        do {
            System.out.print("Introduce un número entre el 0 y 999 (0 para salir): ");
            num1 = sc.nextInt();

            if (num1 == 0) {
                System.out.println("Has terminado el juego.");
                break; 
            } else if (num1 < 10) {
                digitos = 1;
            } else if (num1 < 100) {
                digitos = 2;
            } else {
                digitos = 3;
            }

            System.out.println("El número " + num1 + " tiene " + digitos + " dígito/s.");

        } while (true);

        sc.close();
    }
}
