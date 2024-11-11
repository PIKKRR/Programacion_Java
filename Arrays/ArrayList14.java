package Arrays;
import java.util.*;

/* Diseña un programa que almacena n números aleatorios, positivos. Se pide:
- Imprimir todos los valores del arraylist
- Mostrar cual es el primer valor
- Mostrar el último valor
- Se pide por pantalla al usuario si desea almacenar algún valor, si teclea si, se almacena 
el valor tecleado en el arralist.

Autor: Antonio Casamitjana 'PIKKRR' */ 

public class ArrayList14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<Integer>();

        System.out.println("Introduce cuantos números aleatorios positivos quieres en el ArrayList: ");
        int numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            int numerorandom = random.nextInt(100);
            lista.add(numerorandom);
        }
        System.out.println(lista);

        System.out.println("El primer valor de la lista es : " + lista.get(0));
        System.out.println("El primer valor de la lista es : " + lista.get(lista.size() - 1));
        System.out.println("¿Desea introducir algún valor más? Teclee s/n");
        String eleccion = sc.next();
        if (eleccion.equals("s")) {
            System.out.println("Introduzca el nuevo valor: ");
            lista.add(sc.nextInt());
            System.out.println("Se muestra la lista con el valor nuevo añadido: " + lista);
        } else if (eleccion.equals("n")) {
            System.out.println("Saliendo del programa");
        } else {
            System.out.println("Opción inválida.");
        }
        sc.close();

    }
}
