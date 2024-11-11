package Polimorfismos.Polimorfismo_Sobrecarga;
public class Calculadora {
    // Método para sumar dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método para sumar dos números decimales
    public double sumar(double a, double b) {
        return a + b;
    }
    
    // Método para concatenar dos cadenas
    public String sumar(String a, String b) {
        return a + b;
    }
    
    // Método para sumar tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
}
