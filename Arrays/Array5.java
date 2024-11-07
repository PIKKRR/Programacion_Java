package Arrays;
import java.util.Scanner;

/* Desarrolla un programa en Java que solicite al usuario ingresar 6 notas.
El programa debe calcular la nota media, imprimirla con dos decimales y luego
determinar si el estudiante aprobó o no, mostrando el resultado correspondiente
(aprobado con notable, bien, sobresaliente o suspendido).
 Autor: Jose P. Couso  "Blayneraptor"  */

public class Array5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int notas[] = new int[6];
        double media = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduce la nota " + (i + 1));
            notas[i] = sc.nextInt();
            media += notas[i];
        }

        media /= notas.length; 

        System.out.printf("Su nota media final es: %.2f" , media);
        System.out.println("");
        

        if (media >= 6.5 && media<=8.5) {
            System.out.println("Ha aprobado sacando un notable");
        } else if (media >= 5 && media<=6.5) {
            System.out.println("Ha aprobado sacando un bien"); 
        } else if (media >8.5){
            System.out.println("Ha aprobado sacando un sobresaliente");
        } else {
            System.out.println("Ha suspendido");
        }sc.close();
    }
}
