package POO.Empleados;
public class Empleados {
    
    //Atributos

    private String nombre;


    //Constructor por defecto

    public Empleados(){
        this.nombre="Jose";
    }

    //Constructor con parámetros
    
    public Empleados(String nombre) {
        this.nombre = nombre;
    }

    //Getters

    public String getNombre() {
        return this.nombre;
    }

    public String toString(){
        return "Empleado " + nombre;
    }

    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    


}


   