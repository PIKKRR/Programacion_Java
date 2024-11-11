package Boolean;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

/*Escribe un programa en Java que pida al usuario su fecha de nacimiento (dd/mm/aaaa) y calcule si es mayor de edad (18 años o más).
  El programa debe mostrar un mensaje que indique si la persona es mayor de edad o no. 
  Autor: Antonio Casamitjana 'PIKKRR' */ 

public class Boolean4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca su fecha de nacimiento (dd/mm/aaaa): ");
        String fechaNacimientoStr = scanner.nextLine();

        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento = null;
        try {
            fechaNacimiento = sdf.parse(fechaNacimientoStr);
        } catch (Exception e) {
            System.out.println("Error al convertir la fecha de nacimiento.");
            e.printStackTrace();
            scanner.close();
            return;
        }

        long milisegundosEnUnAnio = 31557600000L;
        long diferenciaMilisegundos = System.currentTimeMillis() - fechaNacimiento.getTime();
        int edad = (int) (diferenciaMilisegundos / milisegundosEnUnAnio);

        
        if (edad >= 18) {
            System.out.println("Usted es mayor de edad.");
        } else {
            System.out.println("Usted es menor de edad.");
        }scanner.close();
        
    }
}


