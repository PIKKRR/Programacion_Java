package POO.Empleado;
import java.util.*;




//En este ejercicio hacemos combinado el Uso_Empleado y la clase Empleado

public class Uso_Empleado {
    
    public static void main(String[] args) {
        
        Empleado empleado1= new Empleado("Jose Couso", 85000, 1994, 1, 24);
        Empleado empleado2= new Empleado("Maria Perez", 40000, 1993, 2, 20);
        Empleado empleado3= new Empleado("Francisco Garcia", 80000, 1995, 5, 3);

        empleado1.setSubeSueldo(5);
        empleado2.setSubeSueldo(5);
        empleado3.setSubeSueldo(5);

        System.out.println("Nombre: " + empleado1.getNombre() + " Sueldo: " + empleado1.getSueldo() + " Fecha contrato: " + empleado1.getaltaContrato());
        System.out.println("Nombre: " + empleado2.getNombre() + " Sueldo: " + empleado2.getSueldo() + " Fecha contrato: " + empleado2.getaltaContrato());
        System.out.println("Nombre: " + empleado3.getNombre() + " Sueldo: " + empleado3.getSueldo() + " Fecha contrato: " + empleado3.getaltaContrato());

    }

}

//<------------------------------------------------------------------------------------------>

class Empleado{

    //Creamos constructor
    public Empleado (String nombre, double sueldo, int anio, int mes, int dia){

        this.nombre=nombre;
        this.sueldo=sueldo;
        GregorianCalendar calendario= new GregorianCalendar(anio,mes-1,dia);
        altaContrato=calendario.getTime();

    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;


    //Getters

    public String getNombre(){

        return nombre;
    }

    public double getSueldo(){

        return sueldo;
    }

    public Date getaltaContrato(){

        return altaContrato;
    }

    //Setters metodos

    public void setSubeSueldo(double porcentaje){

        double aumento=sueldo*porcentaje/100;
        sueldo+=aumento;

    }

}
