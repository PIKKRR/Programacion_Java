package POO.Aula;
import java.util.Random;

// Clase para representar un estudiante
class Estudiante {
    private String nombre;
    private int edad;
    private char sexo;
    private double calificacion;

    public Estudiante(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        // Generar una calificación aleatoria entre 0 y 10
        this.calificacion = new Random().nextDouble() * 10;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public double getCalificacion() {
        return calificacion;
    }

    // Método para simular si el estudiante hace novillos
    public boolean hacerNovillos() {
        // Existe un 50% de probabilidad de hacer novillos
        return new Random().nextBoolean();
    }
}