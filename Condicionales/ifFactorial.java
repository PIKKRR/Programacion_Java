package Condicionales;
import java.util.Scanner;

/*
Desarrolla un programa que calcule el factorial de un número ingresado por el usuario.
Autor: Antonio Casamitjana 'PIKKRR'
*/

public class ifFactorial {

    public static void main(String[] args) {
        
        int factorial=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para decir su factorial");
        int num1=sc.nextInt();
        
        for (int i=1;i<=num1;i++){
        factorial*=i;
        }   
        System.out.println(factorial);
        sc.close();
    }
}
