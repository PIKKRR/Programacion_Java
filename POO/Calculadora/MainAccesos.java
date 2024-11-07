package POO.Calculadora;
import java.util.*;

public class MainAccesos {
    public static void main(String[] args) {

        ControlDeAcceso acceso = new ControlDeAcceso();
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige una opción: \n 1-Sumar \n 2-Restar \n 3-Multiplicar \n 4-Dividir \n 5-Pedir número \n 6-Salir");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                acceso.getSuma();
                break;
            case 2:
                acceso.getResta();
                break;
            case 3:
                acceso.getMultiplicar();
                break;
            case 4:
                acceso.getDividir();
                break;
            case 5:
                acceso.getImprimir();
                break;
            case 6:
                acceso.getSalir();
                break;

            default:
                break;
        }

        sc.close();

    }

}
