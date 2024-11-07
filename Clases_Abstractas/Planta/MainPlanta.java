package Clases_Abstractas.Planta;
import java.util.Scanner;

public class MainPlanta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Planta planta = new PlantaExterior("Rosa","Arcilloso");

        //Mostramos propiedades de la planta
        planta.getPropiedades();

        //Introducimos datos
        System.out.print("Escriba el tipo de planta(interior, exterior, frutal): ");
        String tipoPlanta=sc.nextLine();
        String sistemaRiego=planta.sistemaRiego(tipoPlanta);
        System.out.println("El sistema de riego para esta planta es: " + sistemaRiego);
        sc.close();
    }
}
