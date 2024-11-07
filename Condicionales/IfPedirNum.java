package Condicionales;
import java.util.Scanner;
/*
Desarrolla un programa que solicite al usuario ingresar dos números.
Luego, compara los números e imprime un mensaje indicando cuál es mayor, si son iguales o cuál es menor.
Autor: Jose P. Couso "Blayneraptor"
*/

public class IfPedirNum {
    
    public static void main(String[] args) {
        
         int num1,num2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce dos números");
        num1 =sc.nextInt();
        num2 =sc.nextInt();

        if (num1>num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num1==num2){
            System.out.println(num1 + " es igual que " + num2);
        } else {
            System.out.println(num1 + " es menor que " + num2);
        }
        sc.close();
    }
}
