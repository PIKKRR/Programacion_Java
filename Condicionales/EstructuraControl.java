package Condicionales;
import java.util.Scanner;

/*
Desarrolla un programa que solicite al usuario ingresar dos números.
El programa determinará cuál de los dos números es mayor e imprimirá un mensaje indicando el resultado.
Autor: Antonio Casamitjana 'PIKKRR'
*/

public class EstructuraControl {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println("Escribe un número");
        num1 = sc.nextInt();
        System.out.println("Escribe un segundo número");
        num2 = sc.nextInt();
        
        if (num1>num2){
            System.out.println("El número: " + num1 + ", es mayor que el número: " + num2);
        } else {
            System.out.println("El número: " + num1 + ", es menor que el número: " + num2);
        }
        sc.close();
    }
}
