package Boolean;

/* Haz un ejercicio en el que tengas unas variables int a,b,c y haz uso de los operadores <,>,=  || y ! 
con un resultado booleano. 
    Autor: Jose P. Couso  "Blayneraptor"  
*/

public class Boolean3 {
    
        public static void main(String[] args) {
            int a = 10;
            int b = 20;
            int c = 15;
    
            boolean resultado1 = a < b; // resultado1 es verdadero
            boolean resultado2 = c > a && c < b; // resultado2 es verdadero
            boolean resultado3 = b >= c || a <= c; // resultado3 es verdadero
            boolean resultado4 = !(a == b); // resultado4 es verdadero
    
            System.out.println("resultado 1: " + resultado1);
            System.out.println("resultado 2: " + resultado2);
            System.out.println("resultado 3: " + resultado3);
            System.out.println("resultado 4: " + resultado4);
        }
    }

