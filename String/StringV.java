package String;
import java.util.Scanner;

/* Verifica y guarda un email que contenga "@" y ".".
Autor: Jose P. Couso "Blayneraptor" */

public class StringV {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un email que contenga \"@\" y \".\": ");
        
        String email;
        do {
            email = sc.nextLine();
            if (!email.contains("@") || !email.contains(".")) {
                System.out.println("El email debe contener '@' y '.'. Introduce de nuevo el email: ");
            }
        } while (!email.contains("@") || !email.contains("."));
        sc.close();
        System.out.println("Email guardado correctamente: " + email);
    }   
}
