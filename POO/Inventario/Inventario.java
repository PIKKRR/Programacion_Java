package POO.Inventario;
import java.util.HashMap;
import java.util.Map;

class Inventario {
    private Map<String, Producto> productos;

    // Constructor
    public Inventario() {
        productos = new HashMap<>();
    }

    // Método para agregar un producto al inventario
    public void agregarProducto(String nombre, double precio, int stock) {
        if (!productos.containsKey(nombre)) {
            Producto producto = new Producto(nombre, precio, stock);
            productos.put(nombre, producto);
            System.out.println("Producto agregado al inventario: " + nombre);
        } else {
            System.out.println("El producto ya existe en el inventario.");
        }
    }

    // Método para realizar una venta de un producto
    public void venderProducto(String nombre, int cantidad) {
        Producto producto = productos.get(nombre);
        if (producto != null) {
            if (producto.getStock() >= cantidad) {
                producto.setStock(producto.getStock() - cantidad);
                System.out.println("Venta realizada: " + cantidad + " unidades de " + nombre);
            } else {
                System.out.println("No hay suficiente stock para realizar la venta.");
            }
        } else {
            System.out.println("El producto no existe en el inventario.");
        }
    }

    // Método para generar un informe del inventario
    public void generarInforme() {
        System.out.println("Informe de Inventario:");
        for (Producto producto : productos.values()) {
            System.out.println("Nombre: " + producto.getNombre() + ", Precio: $" + producto.getPrecio() + ", Stock: " + producto.getStock());
        }
    }
}
