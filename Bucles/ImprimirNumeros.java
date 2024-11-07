package Bucles;
import java.util.Scanner;

/*
Desarrolla un programa que imprima los números del 0 al 50 en incrementos de 5.
Autor: Jose P. Couso "Blayneraptor"
*/

public class ImprimirNumeros {
    
    public static void main(String[] args) {
         
        Scanner sc= new Scanner(System.in);

        for (int i=0;i<=50;i+=5){
            
            System.out.println(i);

        }
        sc.close();
    }
}
