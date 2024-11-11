package POO.Empleados;
public class Tecnico extends Empleados {
    
    //Constructor por defecto

    public Tecnico(){
        super();
    }

    //Constructor por parámetros

    public Tecnico(String nombre){
        super(nombre);
    }


    //Sobreescribir método String
    @Override
    public String toString() {
        return "Técnico " + getNombre();
    }

}
