package Arrays;
import java.util.ArrayList;

/*. Diseña un programa en Java que crea un arraylist, que contiene los nombres de 4 
personas. Mostrar los datos del array al completo
Autor: Antonio Casamitjana 'PIKKRR' */ 

public class ArrayList6 {

    public static void main(String[] args) {

        ArrayList<String> nombres= new ArrayList<String>();

        nombres.add("Marta");
        nombres.add("Javier");
        nombres.add("Aitor");
        nombres.add("Samuel");

        System.out.println("Los nombres de las personas del arraylist son: " + nombres);


    }
}