package Condicionales;
import java.util.Scanner;

/*
Desarrolla un programa que solicite al usuario ingresar dos números y un operador (+, -, *, /).
Luego, realiza la operación correspondiente e imprime el resultado.
Autor: Antonio Casamitjana 'PIKKRR'
*/

public class AlgoritmoCalculoOperador {
    

    public static void main(String[] args) {
        
        int num1,num2,resultado;
        String operador;
        Scanner sc= new Scanner(System.in);
        System.out.println("Escribe un número");
        num1=sc.nextInt();
        System.out.println("Escribe otro número");
        num2=sc.nextInt();
        System.out.println("Escribe el operador (+,-,*,/):"); 
        operador=sc.next();
        
       if (operador.equals("+")){
        resultado=num1+num2;
        System.out.println("La suma sería: " + resultado);
       }else if (operador.equals("-")){
        resultado=num1-num2;
        System.out.println("La resta sería: " + resultado);
       }else if (operador.equals("/")){
        resultado=num1/num2;
        System.out.println("La división sería: " + resultado);
       }else if (operador.equals("*")){
        resultado=num1*num2;
        System.out.println("El producto sería: " + resultado);
       }

       sc.close();
    }
}
