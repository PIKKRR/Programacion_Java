package POO.Vehiculos;

import javax.swing.*;

public class Uso_Coche {

    public static void main(String[] args) {

        Coche micoche = new Coche();

        micoche.setColor(JOptionPane.showInputDialog("Introduce color"));

        System.out.println(micoche.getDatosGenerales());

        System.out.println(micoche.getColor());

        micoche.setAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));

        System.out.println(micoche.getAsientos());

        micoche.setClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));

        micoche.setMotor(JOptionPane.showInputDialog("¿Cuánta cilindrada tiene?"));

        System.out.println("El coche tiene una cilindrada de " + micoche.getMotor() + " centímetros cúbicos.");

        System.out.println(micoche.getClimatizador());

        System.out.println(micoche.getPesoCoche());

        System.out.println("El precio final del coche es : " + micoche.getPrecioCoche());
    }

}
