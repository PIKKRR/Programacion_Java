package String;
import java.util.Scanner;

/*Crear un programa que solicite al usuario su nombre y apellido,
  luego muestre su nombre completo en mayúsculas, la longitud de su nombre completo,
  sus iniciales y su nombre completo con las vocales reemplazadas por asteriscos."

Autor: Jose P. Couso "Blayneraptor" */

public class StringVI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ahora, ingrese su apellido: ");
        String apellido = scanner.nextLine();

        

        String nombreCompleto = nombre + " " + apellido;

        System.out.println("Su nombre completo en mayúsculas es: " + nombreCompleto.toUpperCase());

        System.out.println("La longitud de su nombre completo es: " + nombreCompleto.length());

        String inicialNombre = String.valueOf(nombre.charAt(0));
        String inicialApellido = String.valueOf(apellido.charAt(0));
        System.out.println("Sus iniciales son: " + inicialNombre.toUpperCase() + inicialApellido.toUpperCase());

        String nombreSinVocales = nombreCompleto.replaceAll("[aeiouAEIOU]", "*");
        System.out.println("Su nombre completo sin vocales es: " + nombreSinVocales);
        scanner.close();
        
    } 
}
