package Arrays;
public class ArrayMulti {
    
/* Desarrolla un programa en Java que inicialice una matriz tridimensional de
cadenas de texto con dimensiones 3x3x3. Luego, llena la matriz con cadenas
que representen la posición de cada elemento en la matriz y muestra cada
elemento.
 Autor: Jose P. Couso  "Blayneraptor" */


    public static void main(String[] args) {
        
       

        String lista[][][]= new String[3][3][3];

        for (int i=0;i<3;i++){
            
            for (int j=0;j<3;j++){
                
                for (int c=0;c<3;c++){
                    lista[i][j][c]="Fila " + i + " Columna cero " + j + " Columna uno " + c ;
                    System.out.println(lista[i][j][c]);
                }
                
            }
            System.out.println("Fin de fila " + i + " -------------------------");
        }


    }
}
