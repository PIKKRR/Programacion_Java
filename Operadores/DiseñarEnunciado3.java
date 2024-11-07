package Operadores;
import java.math.BigDecimal;

public class DiseñarEnunciado3 {

    /*
    Haz un programa en el que se calcule el resultado de una expresión matemática
    usando BigDecimal, eleva un número a una potencia y luego multiplica el resultado por otro número
    haciendo que sea un número con muchisimos decimales. 

    */
    @SuppressWarnings("deprecation")
    public static void main(String args[]) {
        // Declaración de variables BigDecimal
        BigDecimal e;
        BigDecimal factor;

        // Asignación de valor inicial a las variables e y factor con una precisión de 300 decimales
        e = new BigDecimal("1").setScale(300, BigDecimal.ROUND_DOWN);
        factor = new BigDecimal("1").setScale(300, BigDecimal.ROUND_DOWN);

        // Se obtiene la expresión del paréntesis de la fórmula
        factor = factor.divide(new BigDecimal(200), BigDecimal.ROUND_DOWN);
        factor = factor.add(new BigDecimal(1));

        // Se multiplica la expresión para obtener la potencia adecuada
        for (int i = 1; i < 200; i++) {
            e = e.multiply(factor);
        }

        // Imprime el resultado final de la expresión
        System.out.println(e);
    }
}
