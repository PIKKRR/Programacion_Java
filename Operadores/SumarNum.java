package Operadores;
import java.util.Scanner;

/* Solicita dos números al usuario, suma y muestra el resultado.
Autor: Antonio Casamitjana 'PIKKRR' */ 

public class SumarNum {
    public static void main(String[] args) {
        
        int num1,num2,suma;
        Scanner sc= new Scanner(System.in);
        System.out.println("Escribe dos números: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        suma=num1+num2;
        System.out.println("La suma de los dos números es: "+ suma);
       
sc.close();
    }
}
