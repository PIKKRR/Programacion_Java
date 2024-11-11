package Bucles;

import java.util.Scanner;

/*
Desarrolla un programa que solicite al usuario ingresar números enteros positivos. El programa determinará
si cada número ingresado es primo o no. Si se ingresa un número negativo, solicitará ingresar un número
positivo. El programa se detendrá cuando se ingrese el número 0.
Autor: Antonio Casamitjana 'PIKKRR' */ 

public class TareaBucle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        do {
            System.out.println("Introduce un número, introduce 0 para salir");
            num1 = sc.nextInt();

            if (num1 > 0) {
                boolean esPrimo = true;
                if (num1 <= 1) {
                    esPrimo = false;

                } else {
                    for (int i = 2; i <= num1 / 2; i++) {
                        if (num1 % i == 0) {
                            esPrimo = false;
                            break;
                        }
                    }
                }
                if (esPrimo) {
                    System.out.println(num1 + " es un número primo. ");
                } else {
                    System.out.println(num1 + " no es un número primo.");
                }

            } else if (num1 < 0) {
                System.out.println(" por favor, introduce un número positivo.");
            }

        } while (num1 != 0);
        System.out.println("Has salido.");
        sc.close();

    }
}
