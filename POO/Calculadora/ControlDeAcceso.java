package POO.Calculadora;
import java.util.*;

public class ControlDeAcceso {
    Scanner sc = new Scanner(System.in);
    
    public void getImprimir(){
        System.out.println("Introduce un número");
        int num1=sc.nextInt();
        System.out.println("El número introducido es " + num1);
    }

    public void getSuma(){
        System.out.println("Ingresa dos números para sumar:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int suma=num1+num2;
        System.out.println("El resultado de la suma de " + num1 + " y " + num2 + " es " + suma);
    }
     
    public void getResta(){
        System.out.println("Ingresa dos números para restar:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int resta=num1-num2;
        System.out.println("El resultado de la resta de " + num1 + " y " + num2 + " es " + resta);
    }

    public void getMultiplicar(){
        System.out.println("Ingresa dos números para multiplicarlos:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int multiplicacion=num1*num2;
        System.out.println("El resultado de la multiplicación de " + num1 + " y " + num2 + " es " + multiplicacion);
    }
    public void getDividir(){
        System.out.println("Ingresa dos números para dividirlos:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        double division=num1/num2;
        System.out.println("El resultado de la división de " + num1 + " y " + num2 + " es " + division);
    }
    
    public void getSalir(){
        System.out.println("Saliendo del programa.");
    }
}
