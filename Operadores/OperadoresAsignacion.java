package Operadores;
import java.util.Scanner;


/* Muestra las variaciones de saldo desde el 15 de septiembre hasta el 14 de diciembre:

17 de septiembre: +27.50 euros
19 de septiembre: x2
26 de septiembre: /2
1 de noviembre: +250.38 euros
12 de noviembre: -55.37 euros
29 de noviembre: +1200.96 euros
11 de diciembre: -85.23 euros
Autor: Jose P. Couso "Blayneraptor" */

public class OperadoresAsignacion{

    public static void main(String[] args) {
        
        double saldo = 100.50;
        Scanner sc = new Scanner(System.in);
        System.out.println("Te muestro tu saldo del 15 de septiembre y sus variaciones hasta el día de hoy: " + "\n" + "Saldo: " + saldo + " euros");
        System.out.println("Ve pulsando enter para continuar:");
        sc.nextLine();
        saldo=saldo+27.50;
        System.out.println("El 17 de septiembre recibiste un abono de 27,50 euros." + "\n" + "Saldo:" + saldo + " euros");
        sc.nextLine();
        saldo=saldo*2;
        System.out.println("El 19 de septiembre recibiste una duplicación de tus ingresos." + "\n" + "Saldo:" + saldo + " euros");
        sc.nextLine();
        saldo=saldo/2;
        System.out.println("El 26 de septiembre pagas al fontanero la mitad de tu saldo." + "\n" + "Saldo:" + saldo + " euros");
        sc.nextLine();
        saldo=saldo+250.38;
        System.out.println("El 1 de noviembre recibiste un ingreso a tu cuenta de 250,38 euros." + "\n" + "Saldo:" + saldo + " euros");
        sc.nextLine();
        saldo=saldo-55.37;
        System.out.println("El 12 de noviembre pagas la compra semanal, 55,37 euros." + "\n" + "Saldo:" + saldo + " euros");
        sc.nextLine();
        saldo=saldo+1200.96;
        System.out.println("El 29 de noviembre recibiste la nómina mensual, 1200,96 euros." + "\n" + "Saldo:" + saldo + " euros");
        sc.nextLine();
        saldo=saldo-85.23;
        System.out.println("El 11 de diciembre pagas la cena con tus amigos, 85,23 euros." + "\n" + "Saldo:" + saldo + " euros");
        sc.nextLine();

        System.out.println("A día de hoy 14 de diciembre tienes " + saldo + " euros en la cuenta.");
        sc.close();

    }

}