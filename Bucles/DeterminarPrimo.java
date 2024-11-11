package Bucles;
import java.util.Scanner;

/*
Crea un programa que solicite al usuario ingresar un número positivo. Determina
si el número ingresado es primo o no.
Autor: Antonio Casamitjana 'PIKKRR' */ 

public class DeterminarPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número positivo:");
        int num = sc.nextInt();

        int cont = 0;

        for (int x = 1; x <= num; x++) {
            if (num % x == 0) {
                cont = cont + 1;
            }
        }

        if (cont == 2) {
            System.out.println("El número " + num + " es primo.");
        } else {
            System.out.println("El número " + num + " no es primo.");
        sc.close();
        }
    }
}
