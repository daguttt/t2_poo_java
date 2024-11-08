package exercise9_library;

public class Book {
  private String title;
  private String author;
  private boolean available;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
    this.available = true; // Al crear el libro, está disponible por defecto
  }

  // Getters y setters
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public boolean isAvailable() {
    return available;
  }

  public void setAvailable(boolean available) {
    this.available = available;
  }

  @Override
  public String toString() {
    return String.format("Title: %s | Author: %s | Available: %s", title, author, available);
  }
}
