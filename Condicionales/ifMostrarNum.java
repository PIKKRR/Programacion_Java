package Condicionales;
import java.util.Scanner;

/*
Desarrolla un programa que solicite al usuario ingresar un número.
Luego, muestra todos los números desde 1 hasta el número ingresado.
Autor: Jose P. Couso "Blayneraptor"
*/

public class ifMostrarNum {
    
    public static void main(String[] args) {
        

        int num1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce un número.");
        num1=sc.nextInt();
        System.out.println("Te muestro todos los números del 1 hasta el " + num1);
        for (int i=1;i<=num1;i++){
            System.out.println(i);
        } 
        sc.close();

    }
}
