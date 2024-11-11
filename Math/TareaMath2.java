package Math;
import java.util.Scanner;

/* Desarrolla un programa que calcule el área de un triángulo dado la longitud de sus tres lados.
El usuario introduce las longitudes de los lados del triángulo y el programa muestra el área calculada,
mostrando solo tres decimales.
Autor: Antonio Casamitjana 'PIKKRR' */ 


public class TareaMath2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una longitud en cm para los lados para calcular el area de un triángulo.");
        System.out.print("Lado A: ");
        double ladoa=sc.nextDouble();
        System.out.print("Lado B: ");
        double ladob=sc.nextDouble();
        System.out.print("Lado C: ");
        double ladoc=sc.nextDouble();

        double p= (ladoa+ladob+ladoc)/2;
        double area=Math.sqrt((p*(p-ladoa)*(p-ladob)*(p-ladoc)));
       
        System.out.printf("El área del triangulo es: %.3f cm%n" , area );
        sc.close();
    }
}
