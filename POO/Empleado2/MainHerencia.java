package POO.Empleado2;
public class MainHerencia {
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Jose", "Couso", 30);
        Persona persona2 = new Persona("Javier", "López", 32);
        Persona persona3 = new Persona("Laura", "García", 23);
        Persona persona4 = new Persona("Inma", "Pérez", 43);

        Empleado empleado1 = new Empleado("Jose", "Couso", 30, 2000, 250);
        Empleado empleado2 = new Empleado("Javier", "López", 32, 2300, 150);
        Empleado empleado3 = new Empleado("Laura", "García", 23, 1900, 300);
        Empleado empleado4 = new Empleado("Inma", "Pérez", 43, 1400, 500);
        Empleado empleado5 = new Empleado("Jaime", "Manos", 41, 3000, 100);

        // Mostrar información de la persona1
        System.out.println("Persona 1: Nombre: " + persona1.getNombre() + ", Apellido: " + persona1.getApellido() + ", Edad: " + persona1.getEdad());
        System.out.println("Persona 2: Nombre: " + persona2.getNombre() + ", Apellido: " + persona2.getApellido() + ", Edad: " + persona2.getEdad());
        System.out.println("Persona 3: Nombre: " + persona3.getNombre() + ", Apellido: " + persona3.getApellido() + ", Edad: " + persona3.getEdad());
        System.out.println("Persona 4: Nombre: " + persona4.getNombre() + ", Apellido: " + persona4.getApellido() + ", Edad: " + persona4.getEdad());

        // Mostrar información de los empleados
        double totalCobradoEmpleado1 = empleado1.getTotalCobrado();
        System.out.println("Empleado 1: Total Cobrado: " + totalCobradoEmpleado1);
        double totalCobradoEmpleado2 = empleado2.getTotalCobrado();
        System.out.println("Empleado 2: Total Cobrado: " + totalCobradoEmpleado2);
        double totalCobradoEmpleado3 = empleado3.getTotalCobrado();
        System.out.println("Empleado 3: Total Cobrado: " + totalCobradoEmpleado3);
        double totalCobradoEmpleado4 = empleado4.getTotalCobrado();
        System.out.println("Empleado 4: Total Cobrado: " + totalCobradoEmpleado4);
        double totalCobradoEmpleado5 = empleado5.getTotalCobrado();
        System.out.println("Empleado 5: Total Cobrado: " + totalCobradoEmpleado5);
    }
}
