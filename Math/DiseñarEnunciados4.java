package Math;

/* Desarrolla un programa que utilice métodos de la clase Math y de la clase String
para realizar diversas operaciones y mostrar los resultados.
Autor: Jose P. Couso "Blayneraptor" */

public class DiseñarEnunciados4 {
    public static void main(String[] args) {
        
        //4 Métodos usando Math

        int numero=9;
        
        double numeroPI=Math.PI;
        double resultado=Math.round(numeroPI);
        System.out.println("El numero PI es: " + numeroPI);
        System.out.println("El número PI redondeado es: " + resultado);
        System.out.println("La raiz cuadrada de 9 es: " + Math.sqrt(numero) );
        System.out.println("El número 9 elevado a 2 es: " + Math.pow(numero, 2));
        System.out.println(" ");

        //4 Métodos usando String

        String palabra="Digitech";
        System.out.println("La longitud de la palabra Digitech es de " + palabra.length() + " letras");
        System.out.println("El caracter número 4 de la palabra Digitech es: " + palabra.charAt(4));
        System.out.println("La mitad de la palabra Digitech es: " + palabra.substring(palabra.length()/2));
        System.out.println("La palabra Digitech en mayúsculas sería: " + palabra.toUpperCase());

    }
}
