package POO.AnimalMarino;
public class AnimalMarino {
    
    //Atributos

    private String nombre;
    private String habitat;
    private double peso;


    //Constructor

    public AnimalMarino(String nombre,String habitat,double peso){
        this.nombre=nombre;
        this.habitat=habitat;
        this.peso=peso;
    }
    

    public String getDescripcion(){
        
        return "Nombre: " + nombre + ", Habitat: " + habitat + ", Peso: " + peso + " kg";
    }

}
