package POO.Persona;
public class PrimerosPasosII {
    public static void main(String[] args) {

        // Creamos un objeto del tipo Direccion
        Direccion midomicilio = new Direccion();
        midomicilio.calle = "Atocha";
        midomicilio.codigopostal = 29400;
        midomicilio.numero = 41;
        midomicilio.piso = 2;
        midomicilio.provincia = "Madrid";

        midomicilio.imprimir();

        System.out.println(" <---------------------------------------------------------->");

        // Creamos objetos de tipo Cliente y llamamos al constructor personalizado
        Cliente datosCliente = new Cliente("Jose", "Couso", 9999999, "dsoaijdsao@gmail.com");
        datosCliente.imprimir();

        Cliente cliente1 = new Cliente("Juan", "Perez", 1239432, "Juan@gmailcom");
        cliente1.imprimir();

        System.out.println(" <---------------------------------------------------------->");

        // Creamos otro objeto del tipo Direccion
        Direccion midomicilio2 = new Direccion();
        midomicilio2.calle = "Delicias";
        midomicilio2.codigopostal = 28024;
        midomicilio2.numero = 20;
        midomicilio2.piso = 1;
        midomicilio2.provincia = "Madrid";

        midomicilio2.imprimir();
    }
}