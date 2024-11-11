package POO.Rectangulo;
import java.util.Scanner;

public class MainRectangulo {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5, 10);
        Scanner sc = new Scanner(System.in);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());

        System.out.println("Introduce la longitud nueva:");
        rectangulo.setLongitud(sc.nextInt());
        System.out.println("Introduce el ancho nuevo:");
        rectangulo.setAncho(sc.nextInt());

        System.out.println("Nuevo área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Nuevo perímetro del rectángulo: " + rectangulo.calcularPerimetro());
        sc.close();
    }
}