package Clases_Abstractas.Planta;

public class PlantaExterior extends Planta {
    public PlantaExterior(String nombre, String tipoSuelo) {
        super(nombre, tipoSuelo);
    }

    @Override
    public String sistemaRiego(String tipoPlanta) {
        if (tipoPlanta.equalsIgnoreCase("exterior")) {
            return "Riego por goteo";
        } else {
            return "Riego permanente";
        }
    }
}
