package Arrays;

/*Haz un array que genere aleatoriamente las notas de 10 alumnos, luego verifica si cada alumno ha aprobado o
  suspendido el examen basándose en una puntuación mínima de 50.
  Finalmente muestra las notas y el resultado de aprobación o suspensión para cada alumno.
  
Autor: Antonio Casamitjana 'PIKKRR' */

import java.util.*;

public class Array7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int[] lista = new int[10];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = rd.nextInt(0, 100);
        }

        for (int j = 0; j < lista.length; j++) {
            if (lista[j] >= 50) {
                System.out.println("El alumno ha aprobado con una nota de " + lista[j]);
            } else {
                System.out.println("El alumno ha suspendido con una nota de " + lista[j]);
            }
        }
        System.out.println("Las notas son: ");
        for (int h = 0; h < lista.length; h++) {
            System.out.print(+lista[h] + " ");
        }
        sc.close();

    }
}
