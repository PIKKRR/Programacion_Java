
import java.util.*;

public class ClasePrincipal {
    public static void main(String[] args) {
        ListaDeActores listaActores = new ListaDeActores();
        menu(listaActores);
    }

    public static void menu(ListaDeActores listaActores) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1) Agregar nombre");
            System.out.println("2) Modificar nombre");
            System.out.println("3) Borrar nombre");
            System.out.println("4) Buscar nombre");
            System.out.println("5) Visualizar nombres");
            System.out.println("6) Cantidad de actores");
            System.out.println("7) Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre a agregar: ");
                    String nombreAgregar = scanner.next();
                    listaActores.agregarNombre(nombreAgregar);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre a modificar: ");
                    String nombreModificar = scanner.next();
                    System.out.print("Ingrese el nuevo nombre: ");
                    String nuevoNombre = scanner.next();
                    listaActores.modificarNombre(nombreModificar, nuevoNombre);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre a borrar: ");
                    String nombreBorrar = scanner.next();
                    listaActores.borrarNombre(nombreBorrar);
                    break;
                case 4:
                    System.out.print("Ingrese el nombre a buscar: ");
                    String nombreBuscar = scanner.next();
                    listaActores.buscarNombre(nombreBuscar);
                    break;
                    case 5:
                    System.out.println("Visualizando nombres...");
                    listaActores.visualizarNombres();
                    break;
                case 6:
                    System.out.println("Calculando cantidad de actores...");
                    System.out.println("Cantidad de actores: " + listaActores.cantidadActores());
                    break;
                
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
                    break;
            }
        } while (opcion != 7);

        scanner.close();
    }
}