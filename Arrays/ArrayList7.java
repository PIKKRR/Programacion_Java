package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

/*Diseña un programa que pide por pantalla 5 datos de tipo int, y se almacenan en un 
arraylist. Posteriormente se pregunta si se desean imprimir los datos, en caso 
afirmativo mostrar los datos por pantalla.
Autor: Jose P. Couso  "Blayneraptor"  */

public class ArrayList7 {
    
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> numeros=new ArrayList<Integer>();
    
    for (int i=0;i<5;i++){
        System.out.println("Introduce el número de la posición " + i);
        numeros.add(sc.nextInt());
    }

    System.out.println("¿Deseas imprimir los datos introducidos? s/n");
    String respuesta=sc.next();
   
    if (respuesta.equals("s")){
        System.out.println(numeros);
    } else if (respuesta.equals("n")){
        System.out.println("De acuerdo, hasta pronto");
    } else {
        System.out.println("Elija s/n, reinicie el programa");
    }sc.close();

    }
}


