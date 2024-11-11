package Bucles;
import java.util.Scanner;


/*
Desarrolla un programa que solicite al usuario ingresar su nombre y luego lo imprima 10 veces.
Autor: Antonio Casamitjana 'PIKKRR' */ 

public class ImprimirNombre {
    
        public static void main(String[] args) {
    
            String nombre;
            Scanner sc = new Scanner(System.in);
            System.out.println("Escribe tu nombre:");
            nombre=sc.next();
            for (int i=1;i<10;i++){

            System.out.println(nombre);
            }
            sc.close();
    }
}
