package POO.Biblioteca;

import java.util.*;

public class Bibliotecario {

    public String nombre;
    public int edad;
    public String cargo;
    public List<Libro> librosPrestados;

    // Constructor

    public Bibliotecario(String nombre, int edad, String cargo) {

        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
        this.librosPrestados = new ArrayList<>();

    }

    public void imprimir() {

        System.out.println("El nombre del bibliotecario es : " + nombre);
        System.out.println("La edad del bibliotecario es : " + edad);
        System.out.println("El cargo del bibliotecario es : " + cargo);

    }

    public void prestar(Libro libro) {
        librosPrestados.add(libro);
        System.out.println("El bibliotecario " + nombre + " ha prestado el libro " + libro.titulo);

    }

}
