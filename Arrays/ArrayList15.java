package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

/* . Crea un programa en Java para gestionar una lista de nombres de asignaturas utilizando un 
ArrayList. El programa permitirá agregar nuevas asignaturas, mostrar la lista de asignaturas y 
buscar asignaturas por su nombre.

Autor: Antonio Casamitjana 'PIKKRR' */ 

public class ArrayList15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<String>();

        int numero;
        do {
            System.out.println(
                    "Elija una opción: \n1-Agregar asignatura. \n2-Mostrar lista de asignaturas. \n3-Buscar asignatura por su nombre. \n4-Salir");
            numero = sc.nextInt();

            switch (numero) {
                case 1:
                    System.out.println("Añadir asignatura, escribe \"fin\" para terminar.");
                    String asignatura;
                    do {
                        asignatura = sc.next();
                        if (!asignatura.equals("fin")) {
                            lista.add(asignatura);
                        }
                        System.out.println(lista);
                    } while (!asignatura.equals("fin"));

                    break;

                case 2:
                    System.out.println("Mostrar lista de asignaturas.");
                    System.out.println(lista);
                    break;

                case 3:
                    System.out.println("Buscar asignatura por su nombre.");
                    System.out.println("Introduzca el nombre de la asignatura.");
                    String nombreAsignatura = sc.next();
                    if (lista.contains(nombreAsignatura)) {
                        System.out.println("La asignatura introducida aparece en la lista.");
                    } else {
                        System.out.println("La asignatura introducida no aparece en la lista.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (numero != 4);

        sc.close();
    }
}
