package Polimorfismos.Polimorfismo_Puro;

class MainFiguras {
    public static void main(String[] args) {
        Figuras miFigura = new Figuras();  // Crear un objeto de la clase Figuras

        // Llamar al método area() para encontrar el área de una figura genérica
        miFigura.area();

        // Llamar al método area(int r) para encontrar el área de un círculo con radio 5
        miFigura.area(5);

        // Llamar al método area(double b, double h) para encontrar el área de un triángulo con base 6 y altura 1.2
        miFigura.area(6.0, 1.2);

        // Llamar al método area(int l, int b) para encontrar el área de un rectángulo con longitud 6 y ancho 2
        miFigura.area(6, 2);
      }
    }