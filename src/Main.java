// import exercise1_product.Product;
// import exercise2_book.Book;
// import exercise3_vehicle.Vehicle;
// import exercise4_person.Person;
// import exercise5_bank_account.BankAccount;
// import exercise6_contacts_manager.Contact;
// import exercise6_contacts_manager.ContactsManager;
// import exercise8_products_inventory.Inventory;
// import exercise8_products_inventory.Product;

import exercise8_products_inventory.Inventory;
import exercise8_products_inventory.Product;
import exercise9_library.Book;
import exercise9_library.Library;

public class Main {
    public static void main(String[] args) {
        // Exercise 1: Clase Producto
        // Product product = new Product("Laptop", 1000.0, 10);
        // System.out.printf("Product stock before changes: %d", product.getStock());
        // product.increaseStock(5);
        // System.out.printf("Product stock after increase: %d", product.getStock());
        // product.decreaseStock(3);
        // System.out.printf("Product stock after decrease: %d", product.getStock());
        // System.out.println(product.getStock());
        // System.out.println("\n");

        // // Exercise 2: Clase Libro
        // Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);
        // book.printSummary();
        // System.out.println("Has more than 300 pages: " + book.hasMoreThan300Pages());
        // System.out.println("\n");

        // // Exercise 3: Clase Vehículo
        // Vehicle vehicle = new Vehicle("Ford", "Mustang", 150);
        // System.out.println("Current speed: " + vehicle.getCurrentSpeed());
        // vehicle.accelerate();
        // System.out.println("Current speed: " + vehicle.getCurrentSpeed());
        // vehicle.brake();
        // System.out.println("Current speed: " + vehicle.getCurrentSpeed());

        // // Exercise 4: Clase Persona
        // Person person1 = new Person("Daniel", 21, "Male");
        // Person person2 = new Person("William", 25, "Male");
        // Person.compareAge(person1, person2);

        // // Exercise 5: Clase Cuenta Bancaria
        // BankAccount bankAccount = new BankAccount(123456, "John Doe");
        // bankAccount.printBalance();
        // bankAccount.deposit(500.0);
        // bankAccount.withdraw(200.0);
        // bankAccount.printBalance();
        // bankAccount.printTransactions();

        // // Exercise 6: Sistema de Agenda de Contactos
        // ContactsManager contactsManager = new ContactsManager();
        // contactsManager.addContact(new Contact("John Doe", "1234567890",
        // "john.doe@example.com"));
        // if (contactsManager.searchContact("John Doe").isPresent()) {
        // System.out.println("Contact found");
        // } else {
        // System.out.println("Contact not found");
        // }
        // contactsManager.printContacts();

        // // Exercise 7: Gestión de notas de estudiantes
        // Student student = new Student("John Doe");
        // student.addGrade(85.0);
        // student.addGrade(90.0);
        // student.addGrade(78.5);
        // student.addGrade(32.0);
        // student.addGrade(48.5);
        // student.addGrade(25.0);
        // student.addGrade(100.0);
        // System.out.printf("Student name: %s\n", student.getName());
        // System.out.printf("Student average: %.2f\n", student.calculateAverage());
        // System.out.printf("Student approved: %s\n", student.approved());

        // // Exercise 8: Gestión de inventario de productos
        // Inventory inventory = new Inventory();

        // inventory.addProduct(new Product("Laptop", 999.99, "Electronics"));
        // inventory.addProduct(new Product("Smartphone", 599.99, "Electronics"));
        // inventory.addProduct(new Product("Book", 19.99, "Books"));

        // List<Product> electronicProducts = inventory.findByCategory("Electronics");
        // System.out.printf("""

        // Products in Electronics category:

        // %s
        // """, String.join("\n",
        // electronicProducts.stream().map(Product::toString).toList()));

        // double totalValue = inventory.calculateTotalValue();
        // System.out.println();
        // System.out.println("Total value of inventory: " + totalValue);

        // Exercise 9: Sistema de Biblioteca
        Library library = new Library();

        library.addBook(new Book("Don Quijote", "Miguel de Cervantes"));
        library.addBook(new Book("Cien años de soledad", "Gabriel García Márquez"));

        boolean lentBook = library.lendBook("Don Quijote");
        if (lentBook)
            System.out.println("Libro prestado con éxito");
        else
            System.out.println("No se pudo prestar el libro");

        library.printAvailableBooks();

        boolean returnedBook = library.returnBook("Don Quijote");
        if (returnedBook)
            System.out.println("Libro devuelto con éxito");
        else
            System.out.println("No se pudo devolver el libro");

        // Exercise 16: Inventory Management
        Inventory inventory = new Inventory();

        inventory.addProduct(new Product("Laptop", 999.99, "Electronics", 10));
        inventory.addProduct(new Product("Smartphone", 599.99, "Electronics", 15));
        inventory.addProduct(new Product("Book", 19.99, "Books", 50));

        inventory.sellProduct("Laptop", 2);
        inventory.findByName("Laptop")
                .ifPresent(product -> System.out.println("Laptop stock after selling 2: " + product.getStock()));

        boolean isProductRemoved = inventory.deleteProduct("Book");
        System.out.println("Book was " + (isProductRemoved ? "successfully removed" : "not found"));

    }
}
