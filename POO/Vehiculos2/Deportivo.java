package POO.Vehiculos2;
public class Deportivo extends Vehiculo{
    
    // Propiedades
    private boolean descapotable;

    public Deportivo(String matricula, String marca, String modelo, String color, int numPuertas, double potencia, boolean descapotable) {
        super(matricula, marca, modelo, color, numPuertas, potencia);
        this.descapotable = descapotable;
    }

    // Getter y setter para descapotable
    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }
}
