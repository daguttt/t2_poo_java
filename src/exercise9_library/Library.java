package exercise9_library;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {
  private final List<Book> books;

  public Library() {
    this.books = new ArrayList<>();
  }

  public void addBook(Book book) {
    books.add(book);
  }

  public boolean lendBook(String title) {
    Optional<Book> foundBook = books.stream()
        .filter(book -> book.getTitle().equals(title) && !book.isAvailable())
        .findFirst();

    if (foundBook.isPresent()) {
      foundBook.get().setAvailable(false);
      return true;
    }
    return false;
  }

  public boolean returnBook(String title) {
    Optional<Book> foundBook = books.stream()
        .filter(book -> book.getTitle().equals(title) && !book.isAvailable())
        .findFirst();

    if (foundBook.isPresent()) {
      foundBook.get().setAvailable(true);
      return true;
    }
    return false;
  }

  public void printAvailableBooks() {
    books.stream()
        .filter(Book::isAvailable)
        .forEach(System.out::println);
  }
}
