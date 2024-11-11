package POO.Aula;
public class MainAula {
    public static void main(String[] args) {
        // Creamos un profesor de matemáticas
        Profesor profesorMatematicas = new Profesor("Juan", 35, 'M', "matemáticas");

        // Creamos un aula de matemáticas con capacidad para 30 estudiantes
        Aula aulaMatematicas = new Aula(1, 30, "matemáticas", profesorMatematicas);

        // Agregamos estudiantes al aula de matemáticas
        for (int i = 0; i < 30; i++) {
            Estudiante estudiante = new Estudiante("Estudiante" + (i + 1), 18 + i % 5, i % 2 == 0 ? 'M' : 'F');
            aulaMatematicas.agregarEstudiante(estudiante);
        }

        // Verificamos si se puede impartir clase en el aula de matemáticas
        if (aulaMatematicas.puedeImpartirClase()) {
            System.out.println("Se puede impartir clase en el aula de matemáticas.");
            System.out.println("Número de estudiantes aprobados: " + aulaMatematicas.calcularNumAprobados());
            System.out.println("Número de alumnas aprobadas: " + aulaMatematicas.calcularNumAprobadas());
        } else {
            System.out.println("No se puede impartir clase en el aula de matemáticas.");
        }

        // Creamos un profesor de filosofía
        Profesor profesorFilosofia = new Profesor("María", 40, 'F', "filosofía");

        // Creamos un aula de filosofía con capacidad para 25 estudiantes
        Aula aulaFilosofia = new Aula(2, 25, "filosofía", profesorFilosofia);

        // Agregamos estudiantes al aula de filosofía
        for (int i = 0; i < 25; i++) {
            Estudiante estudiante = new Estudiante("Estudiante" + (i + 1), 20 + i % 5, i % 2 == 0 ? 'M' : 'F');
            aulaFilosofia.agregarEstudiante(estudiante);
        }

        // Verificamos si se puede impartir clase en el aula de filosofía
        if (aulaFilosofia.puedeImpartirClase()) {
            System.out.println("\nSe puede impartir clase en el aula de filosofía.");
            System.out.println("Número de estudiantes aprobados: " + aulaFilosofia.calcularNumAprobados());
            System.out.println("Número de alumnas aprobadas: " + aulaFilosofia.calcularNumAprobadas());
        } else {
            System.out.println("\nNo se puede impartir clase en el aula de filosofía.");
        }

        // Creamos un profesor de física
        Profesor profesorFisica = new Profesor("Carlos", 30, 'M', "física");

        // Creamos un aula de física con capacidad para 20 estudiantes
        Aula aulaFisica = new Aula(3, 20, "física", profesorFisica);

        // Agregamos estudiantes al aula de física
        for (int i = 0; i < 20; i++) {
            Estudiante estudiante = new Estudiante("Estudiante" + (i + 1), 19 + i % 5, i % 2 == 0 ? 'M' : 'F');
            aulaFisica.agregarEstudiante(estudiante);
        }

        // Verificamos si se puede impartir clase en el aula de física
        if (aulaFisica.puedeImpartirClase()) {
            System.out.println("\nSe puede impartir clase en el aula de física.");
            System.out.println("Número de estudiantes aprobados: " + aulaFisica.calcularNumAprobados());
            System.out.println("Número de alumnas aprobadas: " + aulaFisica.calcularNumAprobadas());
        } else {
            System.out.println("\nNo se puede impartir clase en el aula de física.");
        }
    }
}
