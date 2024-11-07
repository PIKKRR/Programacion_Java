package Condicionales;
import java.util.Scanner;
/*
Desarrolla un programa que solicite al usuario ingresar las notas de 6 alumnos.
Luego, determina cuántos alumnos aprobaron (nota mayor o igual a 5),
cuántos suspendieron (nota menor a 4) y cuántos están en condición (nota entre 4 y 5).
Autor: Jose P. Couso "Blayneraptor"
*/

public class ifNotas {
    
    public static void main(String[] args) {
        
        double[] notas = new double[6];
        int aprobados=0;
        int suspensos=0;
        int condicionados=0;
        Scanner sc= new Scanner(System.in);

        for (int i=0;i<6;i++){
            System.out.println("Introduce la nota del alumno " + (i+1));
            notas[i]=sc.nextDouble();
            if (notas[i]>=5) {
            aprobados++;
            } else if (notas[i]<4){
            suspensos++;
            } else {
            condicionados++;
            }
        }
        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos suspensos: " + suspensos);
        System.out.println("Alumnos condicionados: " + condicionados);
        sc.close();
    }
}
