package Clases_Abstractas.Planta;

public abstract class Planta {

    // Atributos
    private String nombre;
    private String tipoSuelo;

    // Constructor

    public Planta(String nombre, String tipoSuelo) {
        this.nombre = nombre;
        this.tipoSuelo = tipoSuelo;
    }

    // Método abstracto para el riego
    public abstract String sistemaRiego(String tipoPlanta);

    // Método para mostrar las propiedades de la planta
    public void getPropiedades() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo de suelo: " + tipoSuelo);
    }

}
