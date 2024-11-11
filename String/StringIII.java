package String;
import java.util.Scanner;


/* Realiza operaciones con un texto dado:

Imprime la mitad de los caracteres.
Imprime el último caracter.
Imprime el texto al revés.
Imprime todas las vocales separadas por un guión.
Cuenta y muestra el número de vocales.
Verifica si el texto es un palíndromo.
Autor: Antonio Casamitjana 'PIKKRR' */ 

public class StringIII {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String saludo = "HolaMundo";
        String mitadsaludo;
        char ultimocaracter;
        String vocales;

        System.out.println("Vamos a realizar unas pruebas con este texto: \n" + saludo);
        mitadsaludo = saludo.substring(0, saludo.length() / 2);
        System.out.println("Imprimir la mitad de los caracteres de la saludo: " + mitadsaludo);
        ultimocaracter = saludo.charAt(saludo.length() - 1);
        System.out.println("Imprimir el último caracter de la saludo: " + ultimocaracter);
        StringBuilder saludoreverse = new StringBuilder(saludo).reverse();
        System.out.println("Imprimir la saludo al reves: " + saludoreverse);
        System.out.print("Todas las vocales separadas con un guión: ");
        for (int i = 0; i < saludo.length(); i++) {
            System.out.print(saludo.charAt(i) + "-");
        }
        System.out.println(" ");
        vocales = saludo.replaceAll("[^aeiouAEIOU]", "");
        System.out.println("Vocales almacenadas: " + vocales.length());

        if (esPalindromo(saludo)) {
            System.out.println(saludo + " es un palíndromo.");
        } else {
            System.out.println(saludo + " no es un palíndromo.");
        }sc.close();
    }

    
    private static boolean esPalindromo(String cadena) {
        String cadenaFormateada = cadena.replaceAll("\\s", "").toLowerCase();
        String cadenaInvertida = new StringBuilder(cadenaFormateada).reverse().toString();
        return cadenaFormateada.equals(cadenaInvertida);
    } 
}
