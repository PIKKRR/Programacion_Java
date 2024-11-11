
import java.util.ArrayList;


public class ListaDeActores {
    ArrayList<String> actores = new ArrayList<>();

    public void agregarNombre(String nombre) {
        if (!actores.contains(nombre)) {
            actores.add(nombre);
            System.out.println("Nombre agregado correctamente.");
        } else {
            System.out.println("El nombre ya existe en la lista.");
        }
    }

    public void modificarNombre(String nombreAntiguo, String nuevoNombre) {
        if (actores.contains(nombreAntiguo)) {
            int index = actores.indexOf(nombreAntiguo);
            actores.set(index, nuevoNombre);
            System.out.println("Nombre modificado correctamente.");
        } else {
            System.out.println("El nombre no existe en la lista.");
        }
    }

    public void borrarNombre(String nombre) {
        if (actores.contains(nombre)) {
            actores.remove(nombre);
            System.out.println("Nombre borrado correctamente.");
        } else {
            System.out.println("El nombre no existe en la lista.");
        }
    }

    public void buscarNombre(String nombre) {
        if (actores.contains(nombre)) {
            System.out.println("El nombre \"" + nombre + "\" se encuentra en la posición: " + actores.indexOf(nombre));
        } else {
            System.out.println("El nombre no existe en la lista.");
        }
    }

    public void visualizarNombres() {
        System.out.println("Lista de nombres:");
        for (String nombre : actores) {
            System.out.println(nombre);
        }
    }

    public int cantidadActores() {
        return actores.size();
    }
}