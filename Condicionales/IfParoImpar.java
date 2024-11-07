package Condicionales;
import java.util.Scanner;

/*
Desarrolla un programa que solicite al usuario ingresar un número.
Determina si el número ingresado es positivo o negativo, y muestra el resultado.
Autor: Jose P. Couso "Blayneraptor"
*/

public class IfParoImpar {
    

    public static void main(String[] args) {
        
        int num1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce un número");
        num1 =sc.nextInt();

        if (num1>0) {
            System.out.println("El número " + num1 + " es positivo");
        } else {
            System.out.println("El número " + num1 + " es negativo");
        }
        sc.close();
    }
}
