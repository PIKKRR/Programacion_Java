package Condicionales;
import java.util.Scanner;

/* Desarrolla un programa que inicialice un array de enteros con los números
del 1 al 10 en orden ascendente. Imprimir los elementos del array en orden
descendente.
Autor: Antonio Casamitjana 'PIKKRR'
*/

public class TareaCondicionales {
    
    public static void main(String[] args) {
        
        int num1,num2,num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un primer número");
        num1=sc.nextInt();
        System.out.println("Escribe un segundo número");
        num2=sc.nextInt();
        System.out.println("Escribe un tercer número");
        num3=sc.nextInt();

        
        if (num1 > num2 && num1 > num3 ) {
        System.out.println("El número " + num1+ " es mayor que todos");
        } else if (num2 > num1 && num2 > num3 ){
        System.out.println("El número " + num2+ " es mayor que todos");
        } else if (num3 > num1 && num3 > num2 ){
        System.out.println("El número " + num3+ " es mayor que todos");
        } else{}

        if (num1 < num2 && num1 < num3 ) {
        System.out.println("El número " + num1+ " es menor que todos");
        } else if (num2 < num1 && num2 < num3 ){
        System.out.println("El número " + num2+ " es menor que todos");
        } else if (num3 < num1 && num3 < num2 ){
        System.out.println("El número " + num3+ " es menor que todos");
        }
        sc.close();

    }
}
