package POO.AnimalMarino;
public class Pez extends AnimalMarino {

    // Atributos
    private String tipo;

    // Constructor
    public Pez(String nombre, String habitat, double peso, String tipo) {
        super(nombre, habitat, peso);
        this.tipo = tipo;
    }

    // Método para obtener la descripción del pez
    public String getDescripcion() {
        return super.getDescripcion() + ", Tipo: " + tipo;
    }
}

