package POO.Rectangulo;
public class Rectangulo {

    private double longitud;
    private double ancho;

    public Rectangulo(double longitud, double ancho) {
        this.longitud = longitud;
        this.ancho = ancho;
    }

    public double calcularArea() {
        return longitud * ancho;
    }

    public double calcularPerimetro() {
        return 2 * (longitud + ancho);
    }

    public double getLongitud() {
        return longitud;
    }

    public double getAncho() {
        return ancho;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
}
