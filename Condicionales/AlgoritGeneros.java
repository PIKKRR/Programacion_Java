package Condicionales;
import java.util.Scanner;

/*
Desarrolla un programa que solicite al usuario ingresar su género y nombre.
Si el género es "masculino", imprime "Bienvenido" seguido del nombre.
Si el género es "femenino", imprime "Bienvenida" seguido del nombre.
De lo contrario, imprime "Hola Indeciso".
Autor: Jose P. Couso "Blayneraptor"
*/

public class AlgoritGeneros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String genero, nombre;

        System.out.println("Escribe tu género:");
        genero = sc.next();
        System.out.println("Escribe tu nombre:");
        nombre = sc.next();

        if (genero.equals("masculino")) {
            System.out.println("Bienvenido " + nombre);
        } else if (genero.equals("femenino")) {
            System.out.println("Bienvenida " + nombre);
        } else {
            System.out.println("Hola Indeciso");
        }

        sc.close();
    }
}
