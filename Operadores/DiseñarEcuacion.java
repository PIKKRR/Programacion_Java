package Operadores;
import java.util.Scanner;


/* Diseña la ecuación cuadrática y muestra las soluciones reales si existen.
Autor: Jose P. Couso "Blayneraptor" */

public class DiseñarEcuacion {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a diseñar la ecuación cuadrática. \nIntroduce los valores enteros de A, B, C consecutivamente:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        double discriminante = Math.pow(b, 2) - 4 * a * c;
        
        double resultadoPositivo;
        double resultadoNegativo;
        
        if (discriminante >= 0) { 
            double raizDiscriminante = Math.sqrt(discriminante);
            resultadoPositivo = (-b + raizDiscriminante) / (2 * a);
            resultadoNegativo = (-b - raizDiscriminante) / (2 * a);
            
            if (Double.isNaN(resultadoNegativo)) {
                System.out.println("No hay soluciones reales.");
            } else {
                System.out.println("Solución 1: " + resultadoPositivo);
                System.out.println("Solución 2: " + resultadoNegativo);
            }
        } else {
            System.out.println("No hay soluciones reales.");
        }

        sc.close();
    }
}


 /* 
        No me deja si la ecuación no tiene solución.

        double resultadopositivo=(-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
        double resultadonegativo=(-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;

        System.out.println(resultadopositivo);
        System.out.println(resultadonegativo);

        sc.close();

        */