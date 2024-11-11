package Condicionales;
import java.util.Scanner;

/*
Desarrolla un programa que solicite al usuario ingresar números hasta que ingrese 0.
El programa debe indicar si cada número ingresado es positivo, negativo o cero.
Autor: Antonio Casamitjana 'PIKKRR'
*/

public class ifLeerNum {
    
    public static void main(String[] args) {
        
        int num1;
        Scanner sc= new Scanner(System.in);
        do {

            System.out.println("Introduce un número.(Introduce 0 para terminar)");
            num1 =sc.nextInt();

          if (num1>0){
            System.out.println("El número es positivo");
        } else if (num1<0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("Has terminado");
        }

        }  while (num1!=0) ;
        sc.close();
    
    }
}
