package POO.Vector;
import java.util.*;

public class Vector {

    private int[] vector;

    public void getVectorDerecho() {
        Random random = new Random();
        vector = new int[10]; // Utilizamos el campo de clase vector

        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(10);
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    public void getVectorDelreves() {

        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.print(vector[i] + " ");
        }

    }

}
