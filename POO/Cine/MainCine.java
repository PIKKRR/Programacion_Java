package POO.Cine;
public class MainCine {
    public static void main(String[] args) {
        // Crear una película
        Pelicula pelicula = new Pelicula("Titanic", 180, 12, "James Cameron");

        // Crear un cine
        Cine cine = new Cine(pelicula, 10.0, 8, 9);

        // Crear un espectador
        Espectador espectador = new Espectador("Juan", 20, 20.0);

        // Intentar vender una entrada
        if (cine.venderEntrada(espectador)) { // Aquí pasamos el espectador como argumento
            System.out.println("Entrada vendida con éxito");
        } else {
            System.out.println("No se pudo vender la entrada");
        }

        // Mostrar el estado de los asientos
        cine.mostrarEstadoAsientos();
    }
}
