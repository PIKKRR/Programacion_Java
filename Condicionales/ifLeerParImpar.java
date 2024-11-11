package Condicionales;
import java.util.Scanner;

/*
Desarrolla un programa que solicite al usuario ingresar números hasta que ingrese 0.
El programa debe indicar si cada número ingresado es par, impar o cero.
Autor: Antonio Casamitjana 'PIKKRR'
*/

public class ifLeerParImpar {
    
    public static void main(String[] args) {

        int num1;
        Scanner sc= new Scanner(System.in);
        do {
            System.out.println("Introduce un número.(Introduce 0 para terminar)");
            num1 = sc.nextInt();
            if (num1==0) {
            System.out.println("Has terminado.");
        }   else if (num1 %2 ==0){
            System.out.println("El número es par.");
        }   else {
            System.out.println("El número es impar.");
        }

        } while (num1!=0);
        sc.close();




    }
}
