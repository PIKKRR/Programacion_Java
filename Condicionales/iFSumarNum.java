package Condicionales;
import java.util.Scanner;

/*
Desarrolla un programa que solicite al usuario ingresar números hasta que ingrese el número 0.
Luego, muestra la suma de todos los números ingresados excluyendo el 0.
Autor: Antonio Casamitjana 'PIKKRR'
*/

public class iFSumarNum {
    public static void main(String[] args) {
        
         int num1=0;
         int suma=0;
        Scanner sc= new Scanner(System.in);

        do{
            System.out.println("Introduce un número.(Introduce 0 para terminar)");
            num1=sc.nextInt();
        if (num1==0) {
            System.out.println("Has terminado, la suma de los anteriores números es: " + suma);
        } else {
            suma+=num1;
        }

        } while (num1!=0);
        sc.close();
    }
}
