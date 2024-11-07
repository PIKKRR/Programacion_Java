package Bucles;
import java.util.Random;
import java.util.Scanner;

/*
Crea un programa que genere una cantidad especificada de números aleatorios entre
0 y 100, y los muestre al usuario.
Autor: Jose P. Couso "Blayneraptor"
*/

public class GenerarAleatorios {
    public static void main(String[] args) {
    
        
        Scanner sc = new Scanner(System.in);
        Random rand=new Random();
        System.out.println("¿Cuantos números aleatorios quieres mostrar?");
        int numero=sc.nextInt();
        

        for (int i=1;i<=numero;i++){
            int numerosrandom=rand.nextInt(100);

            System.out.println("Número random generado: " + numerosrandom);

        }
        sc.close();
    }
}
