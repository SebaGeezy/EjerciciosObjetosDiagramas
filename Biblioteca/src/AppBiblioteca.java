import java.util.Scanner;

import com.biblioteca.mantener.*;

public class AppBiblioteca {
    private Libro libro;
    public static void main(String[] args) throws Exception {
        AppBiblioteca biblioteca = new AppBiblioteca();
        biblioteca.cargar();
        biblioteca.imprimir();
    }
    
    public void cargar() {
        Scanner sc = new Scanner(System.in);
        libro = new Libro();
        System.out.println("Ingrese el codigo del libro: ");
        libro.setCodigo(sc.nextInt());
        System.out.println("Ingrese el nombre del libro: ");
        libro.setNombre(sc.nextLine());
        sc.nextLine();
        System.out.println("Ingrese la edicion del libro: ");
        libro.setEdicion(sc.nextInt());
        System.out.println("Ingrese el año de publicación del libro: ");
        libro.setAñoPublicacion(sc.nextInt());

        Autor autor = new Autor();
        System.out.println("Ingrese el codigo del autor: ");
        autor.setCodigo(sc.nextInt());
        System.out.println("Ingrese el nombre del libro: ");
        autor.setNombre(sc.next());
        sc.nextLine();

        libro.setAutor(autor);

    }

    public void imprimir() {
        System.out.println(libro);
    }

}