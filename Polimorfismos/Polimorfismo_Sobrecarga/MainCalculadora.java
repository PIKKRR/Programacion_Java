package Polimorfismos.Polimorfismo_Sobrecarga;
public class MainCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        // Uso de diferentes versiones del método sumar
        
        // Llamada al método sumar(int a, int b) para sumar dos enteros
        int sumaEnteros = calc.sumar(5, 3);
        
        // Llamada al método sumar(double a, double b) para sumar dos números decimales
        double sumaDecimales = calc.sumar(2.5, 3.5);
        
        // Llamada al método sumar(String a, String b) para concatenar dos cadenas
        String concatenacion = calc.sumar("Hola ", "Mundo");
        
        // Llamada al método sumar(int a, int b, int c) para sumar tres enteros
        int sumaTresEnteros = calc.sumar(2, 3, 5);
        
        // Impresión de los resultados
        System.out.println("Suma de enteros: " + sumaEnteros);
        System.out.println("Suma de decimales: " + sumaDecimales);
        System.out.println("Concatenación de cadenas: " + concatenacion);
        System.out.println("Suma de tres enteros: " + sumaTresEnteros); 
    }
}