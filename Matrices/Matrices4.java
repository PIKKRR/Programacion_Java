import java.util.Scanner;
/*
Desarrolla un programa que permita realizar diversas operaciones con una matriz cuadrada de tamaño 4x4.
El programa permite llenar la matriz, sumar una fila, sumar una columna, sumar la diagonal principal,
sumar la diagonal inversa y calcular la media de todos los valores de la matriz.
Autor: Antonio Casamitjana 'PIKKRR' */ 

public class Matrices4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        boolean matrizLlena = false;

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Rellenar TODA la matriz de números");
            System.out.println("2. Suma de una fila");
            System.out.println("3. Suma de una columna");
            System.out.println("4. Sumar la diagonal principal");
            System.out.println("5. Sumar la diagonal inversa");
            System.out.println("6. La media de todos los valores de la matriz");
            System.out.println("7. Salir");

            System.out.print("\nSeleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    matrizLlena = true;
                    llenarMatriz(scanner, matriz);
                    break;
                case 2:
                    if (!matrizLlena) {
                        System.out.println("Debes rellenar la matriz primero.");
                        break;
                    }
                    sumarFila(scanner, matriz);
                    break;
                case 3:
                    if (!matrizLlena) {
                        System.out.println("Debes rellenar la matriz primero.");
                        break;
                    }
                    sumarColumna(scanner, matriz);
                    break;
                case 4:
                    if (!matrizLlena) {
                        System.out.println("Debes rellenar la matriz primero.");
                        break;
                    }
                    sumarDiagonalPrincipal(matriz);
                    break;
                case 5:
                    if (!matrizLlena) {
                        System.out.println("Debes rellenar la matriz primero.");
                        break;
                    }
                    sumarDiagonalInversa(matriz);
                    break;
                case 6:
                    if (!matrizLlena) {
                        System.out.println("Debes rellenar la matriz primero.");
                        break;
                    }
                    calcularMedia(matriz);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    public static void llenarMatriz(Scanner scanner, int[][] matriz) {
        System.out.println("Rellene la matriz con números enteros:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriz rellenada correctamente.");
    }

    public static void sumarFila(Scanner scanner, int[][] matriz) {
        System.out.print("Ingrese el número de fila a sumar (0-3): ");
        int fila = scanner.nextInt();

        if (fila < 0 || fila >= matriz.length) {
            System.out.println("Número de fila no válido.");
            return;
        }

        int suma = 0;
        for (int i = 0; i < matriz[fila].length; i++) {
            suma += matriz[fila][i];
        }

        System.out.println("La suma de la fila " + fila + " es: " + suma);
    }

    public static void sumarColumna(Scanner scanner, int[][] matriz) {
        System.out.print("Ingrese el número de columna a sumar (0-3): ");
        int columna = scanner.nextInt();

        if (columna < 0 || columna >= matriz[0].length) {
            System.out.println("Número de columna no válido.");
            return;
        }

        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna];
        }

        System.out.println("La suma de la columna " + columna + " es: " + suma);
    }

    public static void sumarDiagonalPrincipal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }

        System.out.println("La suma de la diagonal principal es: " + suma);
    }

    public static void sumarDiagonalInversa(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][matriz.length - 1 - i];
        }

        System.out.println("La suma de la diagonal inversa es: " + suma);
    }

    public static void calcularMedia(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }

        double media = (double) suma / (matriz.length * matriz[0].length);
        System.out.println("La media de todos los valores de la matriz es: " + media);
    }
}
