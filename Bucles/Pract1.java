package Bucles;
import java.util.Scanner;


/*
Desarrolla un programa que solicite al usuario ingresar la cantidad de segundos transcurridos en un partido.
Luego, convierte esos segundos en minutos e imprime el minuto correspondiente.
El programa preguntará si se desea ingresar otro valor.
Autor: Jose P. Couso "Blayneraptor"
*/

public class Pract1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String seguir;

        do {
            System.out.println("Introduce cuántos segundos de partido han transcurrido: ");
            int segundos = sc.nextInt();
            int minutos = segundos / 60;
            System.out.println("El minuto es el : " + (minutos + 1));
            System.out.println("¿Otro valor? (s/n)");
            sc.nextLine();
            seguir = sc.nextLine(); 
        } while (seguir.equals("s"));

        sc.close();
    }
}
