package Boolean;
import java.util.Scanner;

/*
Desarrolla un programa en Java que verifique si una palabra es un palíndromo.
Imprime la palabra al revés y muestra si es un palíndromo o no.
Autor: Antonio Casamitjana 'PIKKRR' */ 

public class Boolean1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String palabra="radar";
        String palabraalreves="";
        boolean espalindromo=true;

        for (int i=palabra.length()-1;i>=0;i--){
            palabraalreves+=palabra.charAt(i);
        }
        System.out.println("La palabra al reves sería " + palabraalreves);

        if (palabra.equals(palabraalreves)){
            espalindromo=true;
        } else {
            espalindromo=false;
        }sc.close();
        System.out.println("¿Es un palindromo la palabra " + palabra +  " ? " + espalindromo);


    }
}
