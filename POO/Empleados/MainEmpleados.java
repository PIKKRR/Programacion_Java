package POO.Empleados;
public class MainEmpleados {
    public static void main(String[] args) {
        
        //Creamos instancias de las clases

        Empleados empleado = new Empleados("Juan");
        Oficial oficial = new Oficial("Ana");
        Operario operario = new Operario("Carlos");
        Directivo directivo = new Directivo("Carlos");
        Tecnico tecnico = new Tecnico("Carlos");
        
        // Imprimir los detalles usando el método toString() de cada clase

        System.out.println(empleado);
        System.out.println(oficial);
        System.out.println(operario);
        System.out.println(directivo);
        System.out.println(tecnico);
    }
}
