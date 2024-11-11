package Operadores;
import java.util.Scanner;

/* Calcula e imprime el precio total de un artículo añadiendo el IVA (21%).
Autor: Antonio Casamitjana 'PIKKRR' */ 

public class PrecioIva {
    
    public static void main(String[] args) {
        
        double importe,iva,precio;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el importe del artículo:");
        importe = sc.nextDouble();

        
        iva=importe*0.21;
        precio=iva+importe;

        System.out.println("El precio total añadiendo el IVA sería: " + precio);
        sc.close();




    }


}
