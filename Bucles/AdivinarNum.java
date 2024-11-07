package Bucles;
import java.util.Random;
import java.util.Scanner;

/*
Desarrolla un juego en donde el usuario debe adivinar un número secreto entre 1 y 10.
Imprime el resultado de cada intento y muestra si el usuario ha acertado o ha agotado
sus intentos.
Autor: Jose P. Couso "Blayneraptor"
*/

public class AdivinarNum {

    public static void main(String[] args) {
        Random random = new Random();

        int numeroAleatorio = random.nextInt(10) + 1;
        int num1 = 0;
        int intentosMaximos = 10;
        int intentoActual = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Adivina el número secreto entre 1 y 10.");

        while (intentoActual <= intentosMaximos) {
            System.out.print("Intento número " + intentoActual + ": ");
            num1 = sc.nextInt();

            if (num1 == numeroAleatorio) {
                System.out.println("¡Enhorabuena,has adivinado el número!");
                break;
            } else {
                System.out.println("Incorrecto.Inténtalo de nuevo.");
                intentoActual++;
            }
        }

        if (intentoActual > intentosMaximos) {
            System.out.println("Lo siento, has agotado tus intentos. El número correcto era: " + numeroAleatorio);
        }

        sc.close();
    }
}

