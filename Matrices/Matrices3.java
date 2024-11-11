import java.util.Scanner;
/*
Desarrolla un programa que sume dos matrices cuadradas del mismo tamaño. El usuario proporciona el tamaño (n)
de las matrices y los valores para cada una de las dos matrices. El programa muestra las matrices ingresadas
y luego muestra el resultado de la suma de las dos matrices.
Autor: Antonio Casamitjana 'PIKKRR' */ 

public class Matrices3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Introduce el tamaño de las matrices (n): ");
        int n = scanner.nextInt();

       
        int[][] matriz1 = new int[n][n];
        int[][] matriz2 = new int[n][n];
        int[][] resultado = new int[n][n];

       
        System.out.println("Introduce los valores para la primera matriz:");
        llenarMatriz(scanner, matriz1);

        System.out.println("Introduce los valores para la segunda matriz:");
        llenarMatriz(scanner, matriz2);

       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        System.out.println("Matriz 1:");
        mostrarMatriz(matriz1);
        System.out.println("Matriz 2:");
        mostrarMatriz(matriz2);

       
        System.out.println("Resultado de la suma:");
        mostrarMatriz(resultado);
    }
    public static void llenarMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
