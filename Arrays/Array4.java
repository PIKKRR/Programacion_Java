package Arrays;
import java.util.Scanner;

/* Desarrolla un programa en Java que inicialice un array de enteros con los números
del 1 al 57 en orden ascendente. El programa debe imprimir si cada número en el
array es par o impar, así como contar el número total de celdas pares e impares.
Finalmente, debe mostrar el total de celdas pares e impares.
Autor: Antonio Casamitjana 'PIKKRR'  */

public class Array4 {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int lista[]=new int[58];
        int numeroceldaspar=0;
        int numeroceldasimpar=0;
        for (int i=1;i<lista.length;i++){
            lista[i]=i;
            if (lista[i]%2==0){
                System.out.println("El número " + lista[i] + " es par");
                
                numeroceldaspar++;
            } else {
                System.out.println("El número " + lista[i] + " es impar");
                
                numeroceldasimpar++;
            }
            
        }sc.close();
          
        System.out.println("El número de celdas pares es " + numeroceldaspar);
        System.out.println("El número de celdas impares es " + numeroceldasimpar);

    }
}
