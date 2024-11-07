package Polimorfismos.Polimorfismo_Puro; 

class Figuras {
    //Método para calcular el área de una figura genérica
    public void area() {
      System.out.println("Encontrar área ");
    }

    //Método para calcular el área de un círculo
    public void area(int r) {
      System.out.println("Área del círculo = "+3.14*r*r);
    }

    //Método para calcular el área de un triángulo
    public void area(double b, double h) {
      System.out.println("Área del triángulo = "+0.5*b*h);
    }

    //Método para calcular el área de un rectángulo
    public void area(int l, int b) {
      System.out.println("Área del rectángulo = "+l*b);
    }
  }
