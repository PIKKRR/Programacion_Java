package Operadores;
import java.util.Scanner;

/* Convierte longitud de cm a pulgadas. Muestra resultado con cuatro decimales.
Autor: Jose P. Couso "Blayneraptor" */

public class ConversorCm {
    
    public static void main(String[] args) {
        
        double cm, pulgadas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe cuántos cm quieres convertir a pulgadas:");
        cm = sc.nextDouble();

        pulgadas = cm / 2.54;
        String pulgadasFormato = String.format("%.4f", pulgadas);
        System.out.println(cm + " centímetros son " + pulgadasFormato + " pulgadas");
        sc.close();
    }
}
