package Bucles;
import java.util.Scanner;

/*
Crea un programa que solicite al usuario 5 números enteros. Calcula y muestra la media aritmética de los números ingresados.
Autor: Jose P. Couso "Blayneraptor"
*/

public class CalcularMedia {
    public static void main(String[] args) {
        
        int[] num = new int[5];
        double suma = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe 5 números:");
        
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
            suma += num[i];
        }

        double media = suma / 5;

        System.out.println("La media aritmética es: " + media);

        sc.close();
    }
}
