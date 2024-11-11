import java.util.Scanner;
/*
Desarrolla un programa que solicite al usuario introducir números para llenar una matriz de 4x4,
y luego imprima la matriz resultante.
Autor: Antonio Casamitjana 'PIKKRR' */ 


public class Matrices6 {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int lista[][]= new int [4][4];

        for (int i=0;i<lista.length;i++){
            for (int j=0;j<lista.length;j++){
                System.out.println("Introduce el número en la fila " + i + " y de la columna " + j);
                lista[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<lista.length;i++){
            for (int j=0;j<lista.length;j++){
                System.out.print(lista[i][j] + " ");
            }
            System.out.println();
        
        } sc.close();
    }
}