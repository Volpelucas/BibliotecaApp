import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private boolean disponible;

    public Libro(String titulo, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}

class Usuario {
    private String nombre;
    private String id;
    private List<Libro> librosAlquilados;

    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.librosAlquilados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public List<Libro> getLibrosAlquilados() {
        return librosAlquilados;
    }

    public void alquilarLibro(Libro libro) {
        if (libro.isDisponible()) {
            librosAlquilados.add(libro);
            libro.setDisponible(false);
            System.out.println("Libro alquilado con éxito.");
        } else {
            System.out.println("El libro no está disponible para alquilar.");
        }
    }

    public void devolverLibro(Libro libro) {
        librosAlquilados.remove(libro);
        libro.setDisponible(true);
        System.out.println("Libro devuelto con éxito.");
    }
}

public class BibliotecaApp {
    private static Map<String, Libro> catalogo = new HashMap<>();
    private static List<Usuario> usuarios = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    agregarLibro();
                    break;
                case 2:
                    eliminarLibro();
                    break;
                case 3:
                    registrarUsuario();
                    break;
                case 4:
                    alquilarLibro();
                    break;
                case 5:
                    devolverLibro();
                    break;
                case 6:
                    buscarLibro();
                    break;
                case 7:
                    generarInforme();
                    break;
                case 8:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 8);
    }

    private static void mostrarMenu() {
        System.out.println("\n*** Biblioteca ***");
        System.out.println("1. Agregar Libro");
        System.out.println("2. Eliminar Libro");
        System.out.println("3. Registrar Usuario");
        System.out.println("4. Alquilar Libro");
        System.out.println("5. Devolver Libro");
        System.out.println("6. Buscar Libro");
        System.out.println("7. Generar Informe");
        System.out.println("8. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void agregarLibro() {
        System.out.println("\n*** Agregar Libro ***");
        // Lógica para agregar un libro al catálogo
    }

    private static void eliminarLibro() {
        System.out.println("\n*** Eliminar Libro ***");
        // Lógica para eliminar un libro del catálogo
    }

    private static void registrarUsuario() {
        System.out.println("\n*** Registrar Usuario ***");
        // Lógica para registrar a un usuario
    }

    private static void alquilarLibro() {
        System.out.println("\n*** Alquilar Libro ***");
        // Lógica para que un usuario alquile un libro
    }

    private static void devolverLibro() {
        System.out.println("\n*** Devolver Libro ***");
        // Lógica para que un usuario devuelva un libro
    }

    private static void buscarLibro() {
        System.out.println("\n*** Buscar Libro ***");
        // Lógica para buscar un libro por título, autor o género
    }

    private static void generarInforme() {
        System.out.println("\n*** Generar Informe ***");
        // Lógica para generar informes o estadísticas
    }
}
