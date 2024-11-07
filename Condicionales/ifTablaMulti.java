package Condicionales;

/*
Desarrolla un programa que imprima las tablas de multiplicar del 1 al 10.
Autor: Jose P. Couso "Blayneraptor"
*/

public class ifTablaMulti {
    
    public static void main(String[] args) {
        
        for (int i=1;i<=10;i++){
            System.out.println("Tabla de multiplicar del " + i + ":");

            for (int a = 1; a <= 10; a++){
            int resultado=i*a;
            System.out.println(i + " por " + a + " es igual a : " + resultado);
            }
            System.out.println();
            }
            
        }
    }



