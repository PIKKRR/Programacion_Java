package POO.Caballo;

public class uso_caballo {
    public static void main(String[] args) {
    
        caballo caballoUno = new caballo("Delito",  24);
        caballo caballoDos = new caballo("Azabache",  61);
        caballo caballoTres= new caballo("Luna", "Negro", 3, 10);
        
        System.out.println("Hola, me llamo " + caballoDos.getNombre());
        caballoDos.cabalga();
        caballoDos.relincha();
          
        System.out.println("Hola, yo soy " + caballoUno.getNombre());
        caballoUno.rumia();
        caballoUno.cabalga();

        caballoTres.setNombre("Noche2");
        System.out.println(caballoTres.getDatos());
      }
    }