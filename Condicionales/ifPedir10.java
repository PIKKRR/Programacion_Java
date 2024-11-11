package Condicionales;
import java.util.Scanner;

/*
Desarrolla un programa que solicite al usuario ingresar 10 números.
Luego, calcula y muestra la suma de los números positivos, la suma de los negativos,
y la cantidad de ceros ingresados.
Autor: Antonio Casamitjana 'PIKKRR'
*/

public class ifPedir10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double sumaPositivos=0;
        double contadorPositivos=0;
        double sumaNegativos=0;
        double contadorNegativos=0;
        int cantidadCeros=0;
        int[] lista = new int[10];
        for (int i=0;i<lista.length;i++){
           System.out.println("Introduce el número " + i);
            lista[i]=sc.nextInt();
        
        if (lista[i]>0){
            sumaPositivos+=lista[i];
            contadorPositivos++;
        } else if (lista[i]==0){
            cantidadCeros++;
        } else {
            sumaNegativos+=lista[i];
            contadorNegativos++;
        }

        }
        sc.close();
        System.out.println("La suma de positivos es: " + sumaPositivos/contadorPositivos);
        System.out.println("La suma de negativos es: " + sumaNegativos/contadorNegativos);
        System.out.println("La cantidad de ceros es: " + cantidadCeros);




    }
}
