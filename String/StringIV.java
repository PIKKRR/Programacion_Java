package String;

/* Separa una frase en palabras e imprime cada palabra por separado.
Autor: Jose P. Couso "Blayneraptor" */

public class StringIV {
    public static void main(String[] args) {
        
        String frase = "La mañana está fría.";

        String[] palabras = frase.split("\\s+");

        System.out.println("La mañana está fría.");
        for (String palabra : palabras) {
            System.out.println(palabra);
    }
}

}
