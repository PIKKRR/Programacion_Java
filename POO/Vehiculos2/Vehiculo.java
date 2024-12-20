package POO.Vehiculos2;
public class Vehiculo {

    // Propiedades

    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private int Numpuertas;
    private double potencia;

    // Constructor

    public Vehiculo(String matricula, String marca, String modelo, String color, int Numpuertas, double potencia) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.Numpuertas = Numpuertas;
        this.potencia = potencia;

        //Métodos
    }
    public String getDatos() {
        return "Matrícula: " + matricula + "\nMarca: " + marca + "\nModelo: " + modelo + "\nColor: " + color + "\nPuertas: " + Numpuertas + "\nPotencia: " + potencia;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumpuertas() {
        return Numpuertas;
    }

    public void setNumpuertas(int numpuertas) {
        Numpuertas = numpuertas;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
}
