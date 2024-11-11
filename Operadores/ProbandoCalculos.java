package Operadores;
public class ProbandoCalculos {

    /* Define funciones para sumar dos números y obtener un saludo personalizado.
    Autor: Antonio Casamitjana 'PIKKRR' */ 
    public static void main(String[] args) {
        
        int suma = sumar(5, 3);
        System.out.println("La suma es: " + suma);

        
        String saludo = obtenerSaludo("Juan");
        System.out.println(saludo);
    }

    
    public static int sumar(int a, int b) {
        return a + b;
    }

    
    public static String obtenerSaludo(String nombre) {
        return "Hola, " + nombre + "!";
    }
}