package Operadores;
import java.util.Scanner;

/* Solicita y muestra el nombre del usuario.
Autor: Antonio Casamitjana 'PIKKRR' */ 

public class IntroduceNombre {
    
    public static void main(String[] args) {
        
        String nombre;
        Scanner sc= new Scanner(System.in);
        System.out.println("Hola, ¿Cuál es tu nombre?:");
        nombre=sc.next();

        System.out.println("Buenos días, " + nombre);

    sc.close();
    }

}
