package POO.Vectores;
import java.util.*;

public class VectorABC {
    Random random = new Random();
    private int[] vectorA;
    private int[] vectorB;
    private int[] vectorC;

    public void getVectorA() {
        vectorA = new int[20];
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = random.nextInt(20);
        }
        for (int i = 0; i < vectorA.length; i++) {
            System.out.print(vectorA[i] + " ");
        }
        System.out.println();

    }

    public void getVectorB() {
        vectorB = new int[20];
        for (int i = 0; i < vectorB.length; i++) {
            vectorB[i] = random.nextInt(20);
        }
        for (int i = 0; i < vectorB.length; i++) {
            System.out.print(vectorB[i] + " ");
        }
        System.out.println();
    }

    public void GetVectorC() {
        vectorC = new int[20];
        for (int i = 0; i < vectorA.length; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }
        for (int i = 0; i < vectorC.length; i++) {
            System.out.print(vectorC[i] + " ");
        }

    }

}
