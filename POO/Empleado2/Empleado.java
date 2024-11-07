package POO.Empleado2;
public class Empleado extends Persona {
    
    // Atributos
    private double sueldo;
    private double comision;

    // Constructor
    public Empleado(String nombre, String apellido, int edad, double sueldo, double comision) {
        super(nombre, apellido, edad);
        this.sueldo = sueldo;
        this.comision = comision;
    }

    // Setters y Getters
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getComision() {
        return comision;
    }

    // Método para calcular el total cobrado
    public double getTotalCobrado() {
        if (sueldo > 0 && comision > 0) {
            return sueldo + comision;
        }
        return 0;
    }
}