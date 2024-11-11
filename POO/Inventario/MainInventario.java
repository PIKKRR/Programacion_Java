package POO.Inventario;
public class MainInventario {
    public static void main(String[] args) {
        // Crear un inventario
        Inventario inventario = new Inventario();

        // Agregar productos al inventario
        inventario.agregarProducto("Camisa", 25.99, 50);
        inventario.agregarProducto("Pantalón", 39.99, 30);
        inventario.agregarProducto("Zapatos", 49.99, 20);

        // Realizar ventas
        inventario.venderProducto("Camisa", 10);
        inventario.venderProducto("Pantalón", 5);

        // Generar un informe del inventario
        inventario.generarInforme();
    }
}