// import exercise1_product.Product;
// import exercise2_book.Book;
// import exercise3_vehicle.Vehicle;
// import exercise4_person.Person;
// import exercise5_bank_account.BankAccount;
// import exercise6_contacts_manager.Contact;
// import exercise6_contacts_manager.ContactsManager;
// import exercise8_products_inventory.Inventory;
// import exercise8_products_inventory.Product;
//import exercise14_payments.CardPayment;
//import exercise14_payments.CashPayment;
//import exercise14_payments.Payment;

//import exercise15_vehicles_maintenance.Fleet;
//import exercise3_vehicle.Vehicle;
//import exercise10_employee.Employee;
//import exercise17_sales_registry.Customer;
//import exercise17_sales_registry.Product;
//import exercise17_sales_registry.Store;
//import exercise18_time_tracking.HoursControl;
//import exercise19_booking_flights_system.Booking;
//import exercise19_booking_flights_system.Flight;
//import exercise19_booking_flights_system.Passenger;
import exercise20_bank.Bank;
import exercise20_bank.BankAccount;

import java.util.List;
import java.util.Optional;

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
        // BankAccount bankAccount = new BankAccount("123456", "John Doe");
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

//        // Exercise 9: Sistema de Biblioteca
//        Library library = new Library();
//
//        library.addBook(new Book("Don Quijote", "Miguel de Cervantes"));
//        library.addBook(new Book("Cien años de soledad", "Gabriel García Márquez"));
//
//        boolean lentBook = library.lendBook("Don Quijote");
//        if (lentBook)
//            System.out.println("Libro prestado con éxito");
//        else
//            System.out.println("No se pudo prestar el libro");
//
//        library.printAvailableBooks();
//
//        boolean returnedBook = library.returnBook("Don Quijote");
//        if (returnedBook)
//            System.out.println("Libro devuelto con éxito");
//        else
//            System.out.println("No se pudo devolver el libro");

//        // Exercise 10: Gestión bonos de empleados
//        Employee daniel = new Employee("Daniel Rodriguez", 30000.0, 5);
//
//        System.out.println("Información del empleado :");
//        System.out.println(daniel);
//
//        System.out.printf("""
//                Detalles del bono:
//
//                Salario base: $%,.2f
//                Bono anual: $%,.2f
//                Salario total con bono: $%,.2f
//                """, daniel.getBaseSalary(), daniel.calculateAnnualBonus(), daniel.getTotalSalaryWithBonus());

//        // Exercise 11: Gestión de vehículos
//         Car car = new Car("Ford", "Mustang", 150);
//         car.printCharacteristics();
//
//        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 209, Motorcycle.HelmetType.INTEGRAL);
//        motorcycle.printCharacteristics();

//        // Exercise 12: Video game
//        Warrior warrior = new Warrior("Gimli", 100);
//
//        Wizard wizard = new Wizard("Merlin", 100);
//        wizard.attack(warrior);
//
//        warrior.attack(wizard);

//        // Exercise 13: Zoo
//        Dog dog = new Dog("Rex");
//        dog.makeNoise();
//
//        Cat cat = new Cat("Garfield");
//        cat.makeNoise();
//
//        Bird bird = new Bird("Parrot");
//        bird.makeNoise();

//        // Exercise 14: Payments
//        Payment cardPayment = new CardPayment();
//        cardPayment.pay(3_425d);
//
//        Payment cashPayment = new CashPayment();
//        cashPayment.pay(2_332d);

//        // Exercise 15: Cars Maintenance
//        Fleet fleet = new Fleet();
//        fleet.addVehicle(new Vehicle("Toyota", "Corolla", 15000));
//        fleet.addVehicle(new Vehicle("Ford", "Focus", 25000));
//        fleet.addVehicle(new Vehicle("Honda", "Civic", 5000));
//
//        int mileageLimit = 10000;
//        fleet.registerMaintenance(mileageLimit);

//        // Exercise 16: Inventory Management
//        Inventory inventory = new Inventory();
//
//        inventory.addProduct(new Product("Laptop", 999.99, "Electronics", 10));
//        inventory.addProduct(new Product("Smartphone", 599.99, "Electronics", 15));
//        inventory.addProduct(new Product("Book", 19.99, "Books", 50));
//
//        inventory.sellProduct("Laptop", 2);
//        inventory.findByName("Laptop")
//                .ifPresent(product -> System.out.println("Laptop stock after selling 2: " + product.getStock()));
//
//        boolean isProductRemoved = inventory.deleteProduct("Book");
//        System.out.println("Book was " + (isProductRemoved ? "successfully removed" : "not found"));

//        // Exercise 17: Sales Registry
//        Store store = new Store();
//
//        // Adding products to store inventory
//        Product p1 = new Product("Laptop", 999.99, 5);
//        Product p2 = new Product("Phone", 499.99, 10);
//        Product p3 = new Product("Tablet", 299.99, 8);
//
//        store.addProductToInventory(p1);
//        store.addProductToInventory(p2);
//        store.addProductToInventory(p3);
//
//        Customer customer = new Customer("Alice", "alice@example.com");
//        List<Product> orderProducts = List.of(p1, p2);
//
//        store.processOrder(customer, orderProducts);

//        // Exercise 18
//        Employee employee = new Employee("John Doe", 50_000.0, 3);
//        employee.recordHours(45);
//        double weeklySalary = HoursControl.calculateWeeklySalary(employee);
//        System.out.printf("Weekly salary for %s: $%,.2f%n", employee.getName(), weeklySalary);

//        // Exercise 19:  Booking Flight System
//        Flight flight = new Flight("AI202", 5);
//
//        Passenger passenger1 = new Passenger("Alice Smith", "A123456");
//        Passenger passenger2 = new Passenger("Bob Brown", "B789101");
//
//        Optional<Booking> booking1 = flight.bookSeat(passenger1);
//        Optional<Booking> booking2 = flight.bookSeat(passenger2);
//
//        booking1.ifPresent(booking -> flight.cancelBooking(booking1.get()));

        // Exercise 20: Bank
        Bank bank = new Bank();

        BankAccount account1 = new BankAccount("12345", 500.0);
        BankAccount account2 = new BankAccount("67890", 1000.0);

        account2.printBalance();
        System.out.println();

        bank.addAccount(account1);
        bank.addAccount(account2);

        account1.deposit(200.0);
        bank.transfer("12345", "67890", 150.0);
        bank.transfer("12345", "67890", 700.0); // Should fail due to insufficient funds

        System.out.println("\nTransaction history for account 12345:");
        for (String transaction : account1.getTransactionHistory()) {
            System.out.println(transaction);
        }

        System.out.println("\nTransaction history for account 67890:");
        for (String transaction : account2.getTransactionHistory()) {
            System.out.println(transaction);
        }

        System.out.println();
        account2.printBalance();
    }
}
