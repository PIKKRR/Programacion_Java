package Operadores;
import java.util.Scanner;

/* Convierte la velocidad en km/h ingresada por el usuario a m/s y muestra el resultado con dos decimales.
Autor: Antonio Casamitjana 'PIKKRR' */ 

public class CambiarVelocidad {

    public static void main(String[] args) {
        
        int velocidad1=0;
        double velocidad2=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("¿A cuántos km estas circulando?");
        velocidad1=sc.nextInt();

        velocidad2=velocidad1*0.277778;
        String velocidad2formateada=String.format("%.2f", velocidad2);
        
        System.out.println("Estas circulando a una velocidad de " + velocidad2formateada + "m/s");
        sc.close();
        





    }



}
