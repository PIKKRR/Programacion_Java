package POO.Empleados;
public class Oficial extends Empleados {
    
    //Constructor por defecto

    public Oficial(){
        super();
    }

    //Constructor por parámetros

    public Oficial(String nombre){
        super(nombre);
    }


    //Sobreescribir método String
    @Override
    public String toString() {
        return "Oficial " + getNombre();
    }

}
