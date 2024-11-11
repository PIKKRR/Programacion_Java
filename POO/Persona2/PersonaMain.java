package POO.Persona2;
import java.util.Scanner;

public class PersonaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MetodosPersona metodospersona = new MetodosPersona();
        PersonaAtrib persona = new PersonaAtrib();

        metodospersona.cargarDatos(persona);
        metodospersona.mostrarDatos(persona);
        
        sc.close(); 
    }
}
