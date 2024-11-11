package POO.Persona;
public class Cliente {
    public String nombre;
    public String apellido;
    public int telefono;
    public String email;

    public void imprimir() {
        System.out.println("Nombre:" + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Email: " + email);
    }

    // Constructor personalizado
    public Cliente(String nombre, String apellido, int telefono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }
}