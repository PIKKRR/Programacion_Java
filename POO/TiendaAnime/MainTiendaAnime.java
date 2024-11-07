package POO.TiendaAnime;
public class MainTiendaAnime {
    public static void main(String[] args) {
        // Crear una tienda de artículos de anime con capacidad para 5 artículos
        TiendaAnime tienda = new TiendaAnime(5);

        // Agregar artículos a la tienda
        tienda.agregarArticulo(new FiguraAccion("Figura de Goku", 29, "Figura de acción de Goku de Dragon Ball", "Goku"));
        tienda.agregarArticulo(new Manga("Naruto Vol. 1", 9, "Manga de Naruto, primer volumen", 1));
        tienda.agregarArticulo(new DVDAnime("Death Note: The Complete Series", 39, "Serie completa de Death Note en DVD", 1008));

        // Mostrar los artículos disponibles en la tienda
        tienda.mostrarArticulos();

        // Calcular el precio total de todos los artículos en la tienda
        System.out.println("Precio Total: $" + tienda.calcularPrecioTotal());
    }
}