package POO.Aula;


// Clase para representar un aula
class Aula {
    private int id;
    private int capacidadMaxima;
    private String materiaDestinada;
    private Profesor profesor;
    private Estudiante[] estudiantes;
    private int numEstudiantes;

    public Aula(int id, int capacidadMaxima, String materiaDestinada, Profesor profesor) {
        this.id = id;
        this.capacidadMaxima = capacidadMaxima;
        this.materiaDestinada = materiaDestinada;
        this.profesor = profesor;
        this.estudiantes = new Estudiante[capacidadMaxima];
        this.numEstudiantes = 0;
    }

    // Getters
    public int getId() {
        return id;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public String getMateriaDestinada() {
        return materiaDestinada;
    }

    // Método para verificar si se puede impartir clase en el aula
    public boolean puedeImpartirClase() {
        // El profesor debe estar disponible y dar la materia correspondiente
        return profesor.estaDisponible() && profesor.getMateria().equals(materiaDestinada) && (numEstudiantes > capacidadMaxima / 2);
    }

    // Método para agregar un estudiante al aula
    public void agregarEstudiante(Estudiante estudiante) {
        if (numEstudiantes < capacidadMaxima) {
            estudiantes[numEstudiantes++] = estudiante;
        }
    }

    // Método para calcular el número de estudiantes aprobados
    public int calcularNumAprobados() {
        int numAprobados = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null && estudiante.getCalificacion() >= 5) {
                numAprobados++;
            }
        }
        return numAprobados;
    }

    // Método para calcular el número de alumnas aprobadas
    public int calcularNumAprobadas() {
        int numAprobadas = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null && estudiante.getSexo() == 'F' && estudiante.getCalificacion() >= 5) {
                numAprobadas++;
            }
        }
        return numAprobadas;
    }
}