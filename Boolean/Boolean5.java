package Boolean;

/*Haz un array que genere aleatoriamente las notas de 5 alumnos, luego verifica si cada alumno ha aprobado o
  suspendido el examen basándose en una puntuación mínima de 50.
  Finalmente muestra las notas y el resultado de aprobación o suspensión para cada alumno.
  
  Autor: Jose P. Couso  "Blayneraptor */

import java.util.*;

public class Boolean5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int[] lista = new int[5];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = rd.nextInt(0, 100);
        }

        for (int j = 0; j < lista.length; j++) {
            boolean aprobado = lista[j] >= 50;
            if (aprobado) {
                System.out.println(
                        "El alumno ha aprobado con una nota de " + lista[j] + ". Opción booleana: " + aprobado);
            } else {
                System.out.println(
                        "El alumno ha suspendido con una nota de " + lista[j] + ". Opción booleana: " + aprobado);
            }
        }
        System.out.println("Las notas son: ");
        for (int h = 0; h < lista.length; h++) {
            System.out.print(+lista[h] + " ");
        }
        sc.close();

    }
}
