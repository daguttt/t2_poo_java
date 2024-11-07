/**
 * Clase Libro y Método de Impresión:
 * Diseña una clase Libro con atributos titulo, autor, y numPaginas. Implementa un
 * método imprimirResumen() que muestre el título y el autor, y otro método que
 * determine si el libro tiene más de 300 páginas.
 */



public class Book {
    private String title;
    private String author;
    private int numPages;

    public Book(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
    }

    public void printSummary() {
        System.out.printf("""
                Resumen del libro:
                Titulo: %s
                Autor: %s
                Num. de paginas: %d""", title, author, numPages);
    }

    public boolean hasMoreThan300Pages() {
        return numPages > 300;
    }
}
