package Math;

/* Implementa un programa que utilice las funciones matemáticas de la clase Math
para calcular diferentes operaciones y mostrar los resultados.
Autor: Jose P. Couso "Blayneraptor" */

public class DiseñarEnunciado2 {

    public static void main( String args[] ) {

        //Introduce funciones Math para indicar el resultado con los siguientes valores: 
        //Se escribe el tipo de dato de las variables sin declarar 
        int x;
        double rand,y,z;
        float max;
        rand = Math.random();  //Número aleatorio con el rango de un double
        x = Math.abs( -123 );   //El valor absoluto de ese número
        y = Math.round( 123.567 );  //El número redondeado
        z = Math.pow( 2,4 );    //Un número elevado a otro número
        max = Math.max( (float)1e10,(float)3e9 );  //Indicar cual de los números es mayor
        
        System.out.println("Este es un número random: " + rand ); 
        System.out.println("Este es el valor absoluto del número -123: "+ x );
        System.out.println("Este es el redondeo del número 123,567: " + y );
        System.out.println("Este es el número 2 elevado a 4: " + z );
        System.out.println("Este indica cual es el número máximo entre 1 elevado a 10 o 3 elevado a 9: " + max );
        }


}
