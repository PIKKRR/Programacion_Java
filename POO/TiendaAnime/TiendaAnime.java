package POO.TiendaAnime;
public class TiendaAnime {
    
    private ArticuloAnime[] articulos;
    private int totalArticulos;

    // Constructor
    public TiendaAnime(int capacidad) {
        articulos = new ArticuloAnime[capacidad];
        totalArticulos = 0;
    }

    // Método para agregar un artículo a la tienda
    public void agregarArticulo(ArticuloAnime articulo) {
        if (totalArticulos < articulos.length) {
            articulos[totalArticulos] = articulo;
            totalArticulos++;
            System.out.println("Artículo agregado a la tienda: " + articulo.getDescripcion());
        } else {
            System.out.println("La tienda está llena. No se puede agregar más artículos.");
        }
    }

    // Método para mostrar todos los artículos disponibles en la tienda
    public void mostrarArticulos() {
        System.out.println("Artículos Disponibles:");
        for (int i = 0; i < totalArticulos; i++) {
            System.out.println(articulos[i].getDescripcion());
        }
    }

    // Método para calcular el precio total de todos los artículos en la tienda
    public double calcularPrecioTotal() {
        double precioTotal = 0;
        for (int i = 0; i < totalArticulos; i++) {
            precioTotal += articulos[i].precio;
        }
        return precioTotal;
    }
}

