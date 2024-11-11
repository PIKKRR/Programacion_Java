package Operadores;
import java.util.Scanner;


/* Intercambia los valores de dos variables A y B e imprime los resultados.
Autor: Antonio Casamitjana 'PIKKRR' */ 

public class DosVariables {
    
    public static void main(String[] args) {
    

        int a,b,temporal;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce una variable A");
        a=sc.nextInt();
        System.out.println("Introduce una variable B");
        b=sc.nextInt();
       
        temporal=a;
        a=b;
        b=temporal;

        System.out.println("Las dos variables intercambiadas valdrían A="+ a + " y B=" + temporal);
        sc.close();
    }
}


