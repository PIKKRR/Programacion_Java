package Operadores;
import java.util.Scanner;

/* Calcula el costo de una llamada en base a los minutos hablados.
Autor: Antonio Casamitjana 'PIKKRR' */ 

public class CosteLlamada {

    public static void main(String[] args) {
        double minutos,euros;
        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe los minutos que has estado en llamada:");
        minutos=sc.nextDouble();

        euros=minutos*0.34;

        System.out.println("El coste de la llamada sería: " + euros + " euros.");
    sc.close(); 



    }
    
}
