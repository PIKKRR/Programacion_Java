package Condicionales;
import java.util.Scanner;

/* Desarrolla un programa que calcule el descuento del 2% en una venta si el
importe supera los 100 euros. Imprime el total a pagar.
Autor: Antonio Casamitjana 'PIKKRR' */


public class VentaDescuento {
 
    public static void main (String[]args){

        double venta,descuento,total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el importe del producto en euros: ");
        venta=sc.nextDouble();
        descuento=0.02*venta;

        if (venta>=100) {
            total=venta-descuento;
            System.out.println("Enhorabuena, el producto tiene un 2% de descuento aplicado, serían:" + total + " euros");
        } else {
            total=venta;
            System.out.println("El producto no tiene ningún descuento, serían:" + total + " euros");

        }
        sc.close();
    }
}




