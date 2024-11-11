package POO.Persona2;
import java.util.*;

public class MetodosPersona {

    public void cargarDatos(PersonaAtrib persona) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre:");
        persona.setNombre(sc.nextLine());
        System.out.println("Introduce el apellido:");
        persona.setApellido(sc.nextLine());
        System.out.println("Introduce la calle:");
        persona.setCalle(sc.nextLine());
        System.out.println("Introduce el teléfono:");
        persona.setTelefono(sc.nextInt());
        sc.nextLine(); 
        System.out.println("Introduce las aficiones:");
        persona.setAficiones(sc.nextLine());
        sc.close();
    }


    public void mostrarDatos(PersonaAtrib persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Calle: " + persona.getCalle());
        System.out.println("Teléfono: " + persona.getTelefono());
        System.out.println("Aficiones: " + persona.getAficiones());
    }

    public void cambiarDatos(PersonaAtrib persona) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nuevo nombre:");
        persona.setNombre(sc.nextLine());
        System.out.println("Introduce el nuevo apellido:");
        persona.setApellido(sc.nextLine());
        System.out.println("Introduce la nueva calle:");
        persona.setCalle(sc.nextLine());
        System.out.println("Introduce el nuevo teléfono:");
        persona.setTelefono(sc.nextInt());
        sc.nextLine(); 
        System.out.println("Introduce las nuevas aficiones:");
        persona.setAficiones(sc.nextLine());
        sc.close();
    }
}
