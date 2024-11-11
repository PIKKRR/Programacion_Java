package POO.Vehiculos2;
public class Turismo extends Vehiculo {
    
    // Propiedades

    private int plazas;

    // Constructor

    public Turismo(String matricula, String marca, String modelo, String color, int numPuertas, double potencia, int plazas) {
        super(matricula, marca, modelo, color, numPuertas, potencia);
        this.plazas = plazas;
    }

    // Getters y setters para las plazas

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
}
