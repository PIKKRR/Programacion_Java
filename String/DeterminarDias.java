package String;
import java.util.Scanner;


/* Convierte días a meses, años y semanas. Muestra resultados con dos decimales.
Autor: Antonio Casamitjana 'PIKKRR' */ 

public class DeterminarDias {

    public static void main(String[] args) {
        
        double dias,meses,anos,semanas;
        Scanner sc= new Scanner(System.in);
        System.out.println("Dí un número para definir los días:");
        dias = sc.nextDouble();

        meses=dias/30;
        anos= meses/12;
        semanas= dias/7;
        String mesesdecimales = String.format("%.2f", meses);
        String anosdecimales = String.format("%.2f", anos);
        String semanasdecimales = String.format("%.2f", semanas);

        // Imprimir resultados
        System.out.println("Pues " + dias + " son " + mesesdecimales + " meses, " + anosdecimales + " años, " + semanasdecimales + " semanas");
        
        sc.close();
    }

}
