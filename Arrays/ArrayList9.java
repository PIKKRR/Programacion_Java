package Arrays;
import java.util.*;

/* Realizar un programa donde se almacenan los nombres de diferentes animales. Se 
piden nombres por pantalla hastaque se introduce la palabra salir
Se deben visualizar todos los valores introducidos y el número de valores que se 
introduce

Autor: Antonio Casamitjana 'PIKKRR' */ 

public class ArrayList9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> animales = new ArrayList<String>();

        do {
            System.out.println(
                    "Introduce el nombre de un animal, escribe salir para terminar el programa y mostrar el contenido");
            animales.add(sc.nextLine());

        } while (!animales.contains("salir"));
        animales.remove(animales.size() - 1);
        System.out.println("Has salido del programa");
        System.out.println("Has introducido una cantidad de " + animales.size() + " animales.");
        System.out.println("Te muestro los animales que has introducido: " + animales);

        sc.close();
    }
}
