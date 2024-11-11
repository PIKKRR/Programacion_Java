package Boolean;

import java.util.ArrayList;
import java.util.Scanner;

/*  Escribe un programa que simule un sistema de acceso a una red social. El programa debe solicitar al usuario que ingrese su nombre de usuario y contraseña.
    Luego, verifica si el nombre de usuario y la contraseña ingresados coincidenbcon los almacenados en el sistema.
    Si coinciden, el programa debe imprimir "Bienvenido", de lo contrario debe repetir los datos.
Autor: Antonio Casamitjana 'PIKKRR' */ 

public class Boolean2 {

    public static void main(String[] args) {

  


        Scanner sc = new Scanner(System.in);
        ArrayList<String[]> usuarios = new ArrayList<>();
        boolean acceso = false;
        System.out.print("Introduce el nombre de usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Introduce la contraseña: ");
        String contrasena = sc.nextLine();

        String[] nuevoUsuario = { usuario, contrasena };
        usuarios.add(nuevoUsuario);
        System.out.println("Usuario registrado correctamente.");

        System.out.println("Nombre: " + nuevoUsuario[0] + " Contraseña: " + nuevoUsuario[1]);

        do {
            System.out.print("Introduce el nombre de usuario: ");
            String nombreUsuario = sc.nextLine();
            System.out.print("Introduce la contraseña: ");
            String contraseña = sc.nextLine();

            if (nombreUsuario.equals(nuevoUsuario[0]) && contraseña.equals(nuevoUsuario[1])) {
                System.out.println("Usuario y contraseña correctos.");
                acceso = true;
                break;
            } else {
                System.out.println("Usuario o contraseña incorrectos.");
            }
        } while (!acceso);
        sc.close();

        System.out.println("Bienvenido " + nuevoUsuario[0]);

    }
}
