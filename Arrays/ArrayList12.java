package Arrays;
import java.util.*;

/* Realizar un programa para gestionar la lista de Empleados, en que tendremos el 
siguiente menú:
1. Agregar Nombres.
2. Modificar nombre
3. Borrar Nombres.
4. Visualizar un Nombre
5. Visualizar todos Nombres.
6. Salir.
Si se selecciona 1, nos pedirá cuantos nombres queremos introducir en el arraylist.
La opción 2 modificará los datos de un empleado.
La opción 3, nos dirá como queremos borrar, nos tiene que dar opción a borrar por 
posición o por nombre
La opción 4 muestra un nombre, según la posición que queremos, hay que comprobar 
si la posición es correcta.
La opción 5 muestra por pantalla un listado de todos los empleados 
Tras procesar cada opción, se debe mostrar de nuevo el menú inicial, hasta que se 
seleccione la opción 6, que terminará el programa

Autor: Jose P. Couso  "Blayneraptor" */

public class ArrayList12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> empleados = new ArrayList<String>();

        boolean continuar = true;
        while (continuar) {
            System.out.println(
                    "Introduce una opción: \n 1-Agregar Nombres. \n 2-Modificar nombre. \n 3-Borrar nombre. \n 4-Visualizar un nombre \n 5-Visualizar todos los nombres. \n 6-Salir.");
            int numero = sc.nextInt();
            String opcion = "";
            switch (numero) {
                case 1:
                    System.out.println("Introduzca los nombres (ingrese 'fin' para terminar):");
                    while (true) {
                        String nombre = sc.next();
                        if (nombre.equals("fin"))
                            break;
                        empleados.add(nombre);
                        System.out.println(empleados);
                    }
                    break;
                case 2:
                    System.out.println("Modifique un nombre.");
                    System.out.println(empleados);
                    System.out.println("Elija la posición:");
                    int posicion = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Elija el nuevo nombre:");
                    String nuevoNombre = sc.nextLine();
                    empleados.set(posicion, nuevoNombre);
                    opcion = "Nombre modificado.";
                    System.out.println(empleados);
                    break;
                case 3:
                    System.out.println("Borra un nombre. Indique borrar por posicion(p) o nombre(n):");
                    String eleccion = sc.next();
                    if (eleccion.equals("p")) {
                        System.out.println("Elija posición a borrar: ");
                        System.out.println(empleados);
                        int eleccionp = sc.nextInt();
                        empleados.remove(eleccionp);
                        System.out.println("Nombre elegido borrado. Lista actualizada:  \n " + empleados);
                        break;
                    } else if (eleccion.equals("n")) {
                        System.out.println("Elija nombre a borrar: ");
                        System.out.println(empleados);
                        String eleccionn = sc.next();
                        empleados.remove(eleccionn);
                        System.out.println("Nombre elegido borrado: \n  " + empleados);
                        break;
                    } else {
                        System.out.println("Respuesta inválida.");
                    }
                    break;
                case 4:
                    System.out.println("Compruebe si un nombre está en la lista.");
                    String nombrelista = sc.next();
                    System.out.println(empleados);
                    if (empleados.contains(nombrelista)) {
                        System.out.println("Nombre en la lista");
                    } else {
                        System.out.println("El nombre no está en la lista.");
                    }
                    break;
                case 5:
                    System.out.println(empleados);
                    break;
                case 6:
                    continuar = false;
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    opcion = "Número inválido.";
                    break;
            }
            System.out.println(opcion);
        }
        sc.close();
    }
}