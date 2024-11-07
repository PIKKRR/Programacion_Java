package POO.Empleados;
public class Directivo extends Empleados {
    
    //Constructor por defecto

    public Directivo(){
        super();
    }

    //Constructor por parámetros

    public Directivo(String nombre){
        super(nombre);
    }


    //Sobreescribir método String
    @Override
    public String toString() {
        return "Directivo " + getNombre();
    }

}
