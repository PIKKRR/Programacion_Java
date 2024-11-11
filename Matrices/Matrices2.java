import java.util.Scanner;
import java.util.Random;

/*
Desarrolla un programa que genere una matriz aleatoria de enteros. El usuario proporciona el número de filas
y columnas de la matriz. Luego, el programa llena la matriz con números aleatorios del 0 al 10 y la muestra por pantalla.
Autor: Antonio Casamitjana 'PIKKRR' */ 


public class Matrices2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Introduce el número de filas: ");
        int filas = sc.nextInt();
        
        System.out.println("Introduce el número de columnas: ");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(11); 
            }
        }
        System.out.println("Matriz generada:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }sc.close();
    }
}