package Condicionales;
import java.util.Scanner;

/*
Desarrolla un programa que solicite al usuario ingresar un número entre 0 y 10.
Luego, muestra la tabla de multiplicar de ese número.
Autor: Jose P. Couso "Blayneraptor"
*/

public class IfMostrarTabla {
    
    public static void main(String[] args) {
        
        int num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entre el 0 y 10 para mostrarte su tabla de multiplicar:");
        num1=sc.nextInt();

        for (int i=1;i<11;i++){
        int resultado= num1*i;
        System.out.println(num1 + " por " + i + " es igual a: " + resultado);
        }
        sc.close();
    

    }
}
