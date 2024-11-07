package Bucles;
import java.util.Scanner;
/*
Desarrolla un programa que imprima los números del 100 al 0 en decrementos de 10.
Autor: Jose P. Couso "Blayneraptor"
*/

public class ImprimirNum10 {
    


    
    public static void main(String[] args) {
         
        Scanner sc= new Scanner(System.in);

        for (int i=100;i>=0;i-=10){
            
            System.out.println(i);

        }
        sc.close();
    }
}
