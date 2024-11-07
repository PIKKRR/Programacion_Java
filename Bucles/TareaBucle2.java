package Bucles;

import java.util.Scanner;


/*
Desarrolla un programa que genere los primeros 10 números de la serie de Fibonacci e imprima cada número.
La serie de Fibonacci comienza con 0 y 1, y cada número posterior es la suma de los dos números anteriores.
Autor: Jose P. Couso "Blayneraptor"
*/

public class TareaBucle2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 1;
        int resultado;

        int i;
        System.out.println("Te muestro los 10 primeros números de la serie de Fibonnaci");

        for (i = 1; i <= 10; i++) {

            resultado = num1 + num2;
            num1 = num2;
            num2 = resultado;

            System.out.println(resultado);
            sc.close();
        }

    }
}
