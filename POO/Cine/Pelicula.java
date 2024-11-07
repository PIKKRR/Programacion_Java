package POO.Cine;
class Pelicula {
    String titulo;
    int duracion;
    int edadMinima;
    String director;

    // Constructor de la clase Pelicula
    public Pelicula(String titulo, int duracion, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }
}