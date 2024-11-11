package POO.Persona;
public class Direccion {

    // Propiedades de la clase

    public String calle;
    public int numero;
    public int piso;
    public int codigopostal;
    public String provincia;

    // Creamos métodos para mostrar datos
    public void imprimir() {

        System.out.println("Calle: " + calle);
        System.out.println("Número: " + numero);
        System.out.println("Piso: " + piso);
        System.out.println("Código postal: " + codigopostal);
        System.out.println("Provincia: " + provincia);

    }

}
