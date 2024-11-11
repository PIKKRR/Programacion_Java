package POO.Persona2;
    public class PersonaAtrib {

        // Atributos de persona

        private String nombre;
        private String apellido;
        private String calle;
        private int telefono;
        private String aficiones;

        // Setters

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public void setCalle(String calle) {
            this.calle = calle;
        }

        public void setTelefono(int telefono) {
            this.telefono = telefono;
        }

        public void setAficiones(String aficiones) {
            this.aficiones = aficiones;
        }

        // Getters

        public String getNombre() {
            return this.nombre;
        }

        public String getApellido() {
            return this.apellido;
        }

        public String getCalle() {
            return this.calle;
        }

        public int getTelefono() {
            return this.telefono;
        }

        public String getAficiones() {
            return this.aficiones;
        }
    }
