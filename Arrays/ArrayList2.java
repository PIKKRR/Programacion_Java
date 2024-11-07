package Arrays;
import java.util.ArrayList;

/*Desarrolla un programa para gestionar un inventario de una tienda utilizando un ArrayList. El programa debe permitir lo siguiente:

Inicializar el inventario con algunos productos predeterminados.
Agregar un nuevo producto en una posición específica del inventario.
Eliminar un producto del inventario.
Actualizar la información de un producto existente en el inventario.
Mostrar el nombre del último producto del inventario.

Autor: Jose P. Couso  "Blayneraptor" 
*/

public class ArrayList2 {
    
    public static void main(String[] args) {
        
        ArrayList <String>lista= new ArrayList<>();
        lista.add("Tomate");
        lista.add("Manzana");
        lista.add("Naranja");
        lista.add("Melon");

        System.out.println("Inventario " + lista);

        lista.add("Sandia");

        System.out.println("Inventario añadiendo lo último " + lista);

        lista.remove("Manzana");

        System.out.println("Inventario quitando manzana " + lista);

        lista.set(0, "Tomate rojo");

        System.out.println("Inventario modificando color del tomate" + lista);

        String producto=lista.get(0);
        
        System.out.println("Producto especifico según su posición (0) = " + producto);

        String UltimoProducto=lista.get(lista.size()-1);

        System.out.println("Accedemos al último producto del inventario " + UltimoProducto);


    }

}
