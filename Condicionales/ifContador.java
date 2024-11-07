package Condicionales;

/*
Desarrolla un programa que imprima todos los números del 00000 al 99999,
sustituyendo el dígito '3' por la letra 'E'.
Autor: Jose P. Couso "Blayneraptor"
*/

public class ifContador {
    public static void main(String[] args) {

        
        for (int i = 0; i <= 99999; i++) {
            String contador = String.format("%05d", i);
            String contadorSustituido = contador.replace("3", "E");
            System.out.println(contadorSustituido);
        }
    }
}
