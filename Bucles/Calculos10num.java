package Bucles;
import java.util.Scanner;

/*
Desarrolla un programa que solicite al usuario ingresar 10 números. Calcula la
cantidad de números pares, la suma de los números pares y el promedio de los
números impares.
Autor: Antonio Casamitjana 'PIKKRR' */ 

public class Calculos10num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumar = 0;
        int suma = 0;
        int csumpar = 0;
        int n;

        System.out.println("Escribe 10 números:");

        for (int s = 1; s <= 10; s++) {
            System.out.print("Ingrese un número " + s + ": ");
            n = sc.nextInt();

            if (n % 2 == 0) {
                csumpar++;
                sumar += n;
            } else {
                suma +=n;
            }
        }

        System.out.println("Los números pares son: " + csumpar);
        System.out.println("La suma de los números pares es: " + sumar);
        System.out.println("El promedio de los números impares es: " + (double) suma / 10);

        sc.close();
    }
}
