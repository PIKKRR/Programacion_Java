package POO.AnimalMarino;
public class MainMarino {
    public static void main(String[] args) {
        // Crear un objeto Pez
        Pez pez = new Pez("Pez Payaso", "Arrecife de Coral", 0.1, "Tropical");

        // Crear un objeto MamiferoMarino
        MamiferoMarino mamifero = new MamiferoMarino("Delfín", "Océano", 200, 2);

        // Mostrar la descripción de los animales marinos
        System.out.println("Descripción del pez: " + pez.getDescripcion());
        System.out.println("Descripción del mamífero marino: " + mamifero.getDescripcion());
    }
}