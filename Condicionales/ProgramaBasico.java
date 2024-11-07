package Condicionales;

import java.util.Scanner;

public class ProgramaBasico {

    public static void main(String[] args) {
        
        /*
Desarrolla un programa en Java que simule un sistema de autenticación básico. El programa debe solicitar al usuario que ingrese su nombre de usuario
y contraseña. Luego, verificará si el nombre de usuario es "admin" y la contraseña es "admin123". Si las credenciales son correctas
mostrará un mensaje de "Inicio de sesión exitoso", de lo contrario, mostrará un mensaje de "Credenciales incorrectas".
Autor: Jose P. Couso "Blayneraptor"
*/

        Scanner sc= new Scanner(System.in);
        System.out.print("Introduce el nombre de usuario del administrador: ");
        String nombre=sc.nextLine();
        System.out.print("Introduce la contraseña: ");
        String contrasena=sc.nextLine();

        if (nombre.equals("admin") && contrasena.equals("admin123")){
            System.out.println("Es correcto");
        } else {
            System.out.println("Es incorrecto");
        }sc.close();

    }
}
