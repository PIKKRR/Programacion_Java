package Bucles;

import java.util.Scanner;


/*
Desarrolla un programa que solicite al usuario ingresar un número entero del 1 al 12. Luego, imprime la
tabla de multiplicar correspondiente al número ingresado. Utiliza un bucle while para generar la tabla.
El programa se cerrará después de mostrar la tabla.
Autor: Jose P. Couso "Blayneraptor"
*/

public class TablaMultiplicarVisual {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1;
        int i = 1;
        int resultado = 0;

        System.out.println("Escribe un número entero desde el 1 al 12:");
        num1 = sc.nextInt();

        while (i <= 10) {
            resultado = num1 * i;
            System.out.println(num1 + " x " + i + " = " + resultado);
            i++;
        }

        sc.close();

    }
}
