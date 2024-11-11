package POO.Biblioteca;

public class Libro  {
    
    public String titulo;
    public String autor;
    public int anopublicacion;
    public String genero;
    public int numpag;


    //Constructor

    public Libro (String titulo, String autor, int anopublicacion, String genero, int numpag){
        this.titulo=titulo;
        this.autor=autor;
        this.anopublicacion=anopublicacion;
        this.genero=genero;
        this.numpag=numpag;

    }

    public void imprimir(){

        System.out.println("El título del libro es: " + titulo);
        System.out.println("El autor del libro es: " + autor);
        System.out.println("El año de publicación del libro es: " + anopublicacion);
        System.out.println("El género del libro es: " + genero);
        System.out.println("El número de páginas del libro es: " + numpag);

    }

} 
