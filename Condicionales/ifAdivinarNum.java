package Condicionales;
import java.util.Random;
import java.util.Scanner;

/*
Desarrolla un programa en el que el usuario intenta adivinar un número generado aleatoriamente entre 1 y 100.
El programa indicará si el número ingresado es demasiado alto, demasiado bajo o si el usuario ha acertado.
Autor: Antonio Casamitjana 'PIKKRR'
*/

public class ifAdivinarNum {
    public static void main(String[] args) {
        
        int numsecreto, num1;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        numsecreto = rd.nextInt(100);
        System.out.println("Adivina el número del 1 al 100");
        
        do {
            System.out.println("Introduce un número");
            num1 = sc.nextInt();
            if (num1 == numsecreto) {
                System.out.println("¡Has acertado!");
            } else if (num1 > numsecreto) {
                System.out.println("!Más bajo¡");
            } else {
                System.out.println("¡Más alto!");
            }

        } while (num1 != numsecreto);
        
        sc.close();

    }
}
