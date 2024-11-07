package POO.Cine;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Clase Cine
class Cine {
    Pelicula peliculaActual;
    double precioEntrada;
    Asiento[][] asientos;
    Random rand;

    // Constructor de la clase Cine
    public Cine(Pelicula peliculaActual, double precioEntrada, int filas, int columnas) {
        this.peliculaActual = peliculaActual;
        this.precioEntrada = precioEntrada;
        this.asientos = new Asiento[filas][columnas];
        this.rand = new Random();
        char letraInicial = 'A';

        // Inicializar los asientos
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                this.asientos[i][j] = new Asiento((char)(letraInicial + j), filas - i);
            }
        }
    }

    // Método para mostrar el estado de los asientos
    public void mostrarEstadoAsientos() {
        System.out.println("Estado de los asientos:");
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                if (asientos[i][j].ocupado) {
                    System.out.print("X ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }

    // Método para vender una entrada de forma aleatoria
    public boolean venderEntrada(Espectador espectador) {
        // Crear una lista de asientos disponibles
        List<Asiento> disponibles = new ArrayList<>();
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                if (!asientos[i][j].ocupado) {
                    disponibles.add(asientos[i][j]);
                }
            }
        }

        // Si no hay asientos disponibles, devolver falso
        if (disponibles.isEmpty()) {
            return false;
        }

        // Seleccionar un asiento aleatorio de la lista de disponibles
        Asiento asientoSeleccionado = disponibles.get(rand.nextInt(disponibles.size()));

        // Comprobar si el espectador cumple los requisitos y tiene suficiente dinero
        if (espectador.edad >= this.peliculaActual.edadMinima && espectador.dinero >= this.precioEntrada) {
            // Ocupar el asiento seleccionado y descontar el dinero del espectador
            asientoSeleccionado.ocuparAsiento();
            espectador.dinero -= this.precioEntrada;
            return true;
        } else {
            return false;
        }
    }
}