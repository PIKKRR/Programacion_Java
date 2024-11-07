package Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/* Realiza operaciones básicas con ArrayList: agregar, acceder por índice, verificar presencia.
Autor: Jose P. Couso "Blayneraptor" */

public class PruebaArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una lista utilizando ArrayList
        List<String> listaDeNombres = new ArrayList<>();

        // Añadir elementos a la lista
        listaDeNombres.add("Alice");
        listaDeNombres.add("Bob");
        listaDeNombres.add("Charlie");

        // Mostrar la lista
        System.out.println("Lista original: " + listaDeNombres);

        // Solicitar al usuario agregar un nuevo nombre
        System.out.print("Ingrese un nuevo nombre: ");
        String nuevoNombre = scanner.nextLine();

        // Añadir el nuevo nombre a la lista
        listaDeNombres.add(nuevoNombre);

        // Mostrar la lista actualizada
        System.out.println("Lista actualizada: " + listaDeNombres);

        // Acceder a elementos por índice
        System.out.println("Primer nombre en la lista: " + listaDeNombres.get(0));

        // Verificar si un nombre está en la lista
        System.out.print("Ingrese un nombre para verificar su presencia en la lista: ");
        String nombreVerificar = scanner.nextLine();
        boolean estaEnLaLista = listaDeNombres.contains(nombreVerificar);
        System.out.println("¿Está en la lista? " + estaEnLaLista);

        scanner.close();
    }
}
