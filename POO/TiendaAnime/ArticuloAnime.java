package POO.TiendaAnime;
class ArticuloAnime {
    protected String nombre;
    protected int precio;
    protected String descripcion;

    // Constructor
    public ArticuloAnime(String nombre, int precio, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    // Método para obtener la descripción del artículo de anime
    public String getDescripcion() {
        return "Nombre: " + nombre + ", Precio: $" + precio + ", Descripción: " + descripcion;
    }
}