package POO.Biblioteca;

public class Main {
    
    public static void main(String[] args) {
        
        Libro libro = new Libro("Heroes de la guerra", "Fernando Vega" , 1993, "Dramático" , 565);

        Bibliotecario bibliotecario= new Bibliotecario("Juan",42,"Jefe de biblioteca");

       libro.imprimir();

       bibliotecario.prestar(libro);

       System.out.println("Libros prestados por el bibliotecario " + bibliotecario.nombre + ":");
       for (Libro libroPrestado : bibliotecario.librosPrestados){
        System.out.println(libroPrestado.titulo);
       }
       

    }
}

