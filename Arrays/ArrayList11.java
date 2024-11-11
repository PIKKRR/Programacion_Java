package Arrays;
import java.util.*;

/* Realiza un programa donde almacenamos los nombres de animales, dichos nombres se 
almacenan en un Arraylist. Se piden valores hasta que se teclea la palabra SALIR.
Visualizar los valores, y el número de valores que se introducen.

Autor: Antonio Casamitjana 'PIKKRR'*/

public class ArrayList11 {

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
