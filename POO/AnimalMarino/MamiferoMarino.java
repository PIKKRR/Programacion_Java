package POO.AnimalMarino;
class MamiferoMarino extends AnimalMarino {
    private int numeroAletas;

    // Constructor
    public MamiferoMarino(String nombre, String habitat, double peso, int numeroAletas) {
        super(nombre, habitat, peso);
        this.numeroAletas = numeroAletas;
    }

    // Método para obtener la descripción del mamífero marino
    @Override
    public String getDescripcion() {
        return super.getDescripcion() + ", Número de Aletas: " + numeroAletas;
    }
}