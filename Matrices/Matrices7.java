import java.util.Scanner;

public class Matrices7 {

    /*
       Diseña un programa en Java que pide por pantalla una palabra de x caracteres.
       Se debe crear una matriz con el mismo número de celdas que letras tiene la
       palabra.
       Consideraciones:
      • Cada letra se debe almacenar en una celda.
      • Se debe comprobar si hay algún valor repetido en alguna celda.

      Autor: Jose P. Couso "Blayneraptor"
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una palabra para crear una matriz con su longitud: ");
        String palabra = sc.nextLine();
        char matriz[] = new char[palabra.length()];
        int repetida = 0;
        System.out.println("La matriz que has creado es: ");
        for (int i = 0; i < palabra.length(); i++) {
            matriz[i] = palabra.charAt(i);
            System.out.print((matriz[i]) + " ");
        }
        sc.close();

        for (int i = 0; i < matriz.length; i++) {
            char letraActual = matriz[i];
            for (int j = 0; j < i; j++) {
                if (matriz[j] == letraActual) {
                    repetida++;
                    break;
                }
            }
        }
        System.out.println(" ");
        System.out.println("Hay un total de " + repetida + " celda/s repetidas.");
    }
}
