package Operadores;
import java.util.Scanner;

/* Solicita dos números al usuario y muestra suma, resta, división y producto.
Autor: Jose P. Couso "Blayneraptor" */

public class AlgoritmoCalculos{

    public static void main(String[] args) {
        
        int a,b,suma,resta,division,producto;
        Scanner sc= new Scanner(System.in);
        System.out.println("Escribe dos números: ");
        a=sc.nextInt();
        b=sc.nextInt();

        suma=a+b;
        resta=a-b;
        producto=a*b;
        division=a/b;

        System.out.println("La suma sería="+ suma);
        System.out.println("La resta sería="+ resta);
        System.out.println("La división sería="+ division);
        System.out.println("El producto sería="+ producto);
        sc.close();
    }
}