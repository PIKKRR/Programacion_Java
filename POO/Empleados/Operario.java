package POO.Empleados;
public class Operario extends Empleados {
    
    //Constructor por defecto

    public Operario(){
        super();
    }

    //Constructor por parámetros

    public Operario(String nombre){
        super(nombre);
    }


    //Sobreescribir método String
    @Override
    public String toString() {
        return "Operario " + getNombre();
    }

}
