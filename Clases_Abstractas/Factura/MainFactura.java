package Clases_Abstractas.Factura;

import java.util.Scanner;

public class MainFactura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el número de factura:");
        int nfactura = sc.nextInt();
        System.out.println("Ingrese el importe:");
        int importe = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la descripción:");
        String detalle = sc.nextLine();
        
        // Crear la instancia de Factura con los valores proporcionados
        Factura factura = new FacturaElectronica(nfactura, importe, 0, detalle, 0);
        
        // Calcular el IVA y el total final con IVA
        factura.getTotalFinalconIva();
        
        // Mostrar los datos de la factura
        factura.getMostrarDatos();
        sc.close();
    }
}