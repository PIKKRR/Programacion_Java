package Math;
import java.util.Scanner;

/* Desarrolla un programa que calcule el área de un círculo dado su radio.
El usuario introduce el radio del círculo y el programa muestra el área calculada.
Autor: Antonio Casamitjana 'PIKKRR' */ 

public class RadioCirculo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el radio del círculo: ");
        double radio=sc.nextDouble();
        double resultado=Math.PI*Math.pow(radio, 2);

            System.out.println("El resultado de su área es: " + Math.round(resultado));

        sc.close();
    }




}