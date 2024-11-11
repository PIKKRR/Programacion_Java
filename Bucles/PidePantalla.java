package Bucles;
import java.util.Scanner;

/*
Desarrolla un programa que solicite al usuario ingresar su nombre y un número, luego imprime el nombre la cantidad de veces especificada por el número.
Autor: Antonio Casamitjana 'PIKKRR' */ 

public class PidePantalla{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nombre;
        int num1;
        int i=0;
        System.out.println("Escribe tu nombre");
        nombre=sc.next();
        System.out.println("¿Cuántas veces quieres que se imprima?");
        num1=sc.nextInt();

        for (i=0;i<num1;i++){
            System.out.println(nombre);

        sc.close();
        }



        }



    }


