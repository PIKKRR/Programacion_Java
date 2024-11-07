package POO.Aula;
import java.util.Random;

// Clase para representar un profesor
class Profesor {
    private String nombre;
    private int edad;
    private char sexo;
    private String materia;
    private boolean disponible;

    public Profesor(String nombre, int edad, char sexo, String materia) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.materia = materia;
        // Existe un 20% de probabilidad de no estar disponible
        this.disponible = !(new Random().nextInt(100) < 20);
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

    public String getMateria() {
        return materia;
    }

    public boolean estaDisponible() {
        return disponible;
    }
}
