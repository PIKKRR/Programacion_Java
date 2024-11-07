package POO.Vehiculos2;
import java.util.ArrayList;
import java.util.List;

public class MainVehiculos {
    public static void main(String[] args) {
        // Crear objetos tipo Vehiculo
        Vehiculo vehiculo1 = new Turismo("123ABC", "Toyota", "Corolla", "Rojo", 4, 150, 5);
        Vehiculo vehiculo2 = new Deportivo("456XYZ", "Ferrari", "458 Italia", "Negro", 2, 600, true);

        // Crear colecciones de objetos utilizando arrays y listas
        Vehiculo[] vehiculosArray = {vehiculo1, vehiculo2};

        List<Vehiculo> vehiculosList = new ArrayList<>();
        vehiculosList.add(vehiculo1);
        vehiculosList.add(vehiculo2);

        // Acceder a los elementos de las colecciones
        for (int i = 0; i < vehiculosArray.length; i++) {
         Vehiculo vehiculo = vehiculosArray[i];
         System.out.println("Matrícula: " + vehiculo.getMatricula());
         System.out.println("Marca: " + vehiculo.getMarca());
         System.out.println("Modelo: " + vehiculo.getModelo());
         System.out.println("Color: " + vehiculo.getColor());
         System.out.println("Número de puertas: " + vehiculo.getNumpuertas());
         System.out.println("Potencia: " + vehiculo.getPotencia());
         

            if (vehiculo instanceof Turismo) {
                Turismo turismo = (Turismo) vehiculo;
                System.out.println("Número de plazas: " + turismo.getPlazas());
            } else if (vehiculo instanceof Deportivo) {
                Deportivo deportivo = (Deportivo) vehiculo;
                System.out.println("Descapotable: " + deportivo.isDescapotable());
            }

            System.out.println();
        }
    }
}
