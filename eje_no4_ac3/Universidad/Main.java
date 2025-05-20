public class Main {
    public static void main(String[] args) {
        // Crear un estudiante
        Estudiante estudiante = new Estudiante("Ana Torres", "Calle 123", "Ingeniería Informática", 3);
        System.out.println("Estudiante:");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Dirección: " + estudiante.getDireccion());
        System.out.println("Carrera: " + estudiante.getCarrera());
        System.out.println("Semestre: " + estudiante.getSemestre());

        // Crear un profesor
        Profesor profesor = new Profesor("Dr. Juan Pérez", "Avenida 456", "Ciencias Exactas", "Titular");
        System.out.println("\nProfesor:");
        System.out.println("Nombre: " + profesor.getNombre());
        System.out.println("Dirección: " + profesor.getDireccion());
        System.out.println("Departamento: " + profesor.getDepartamento());
        System.out.println("Categoría: " + profesor.getCategoria());
    }
}
