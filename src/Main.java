public class Main {
    public static void main(String[] args) {
        // Exercise 1: Clase Producto
        Product product = new Product("Laptop", 1000.0, 10);
        System.out.printf("Product stock before changes: %d", product.getStock());
        product.increaseStock(5);
        System.out.printf("Product stock after increase: %d", product.getStock());
        product.decreaseStock(3);
        System.out.printf("Product stock after decrease: %d", product.getStock());
        System.out.println(product.getStock());
        System.out.println("\n");

        // Exercise 2: Clase Libro
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180);
        book.printSummary();
        System.out.println("Has more than 300 pages: " + book.hasMoreThan300Pages());
        System.out.println("\n");

        // Exercise 3: Clase Vehículo
        Vehicle vehicle = new Vehicle("Ford", "Mustang", 150);
        System.out.println("Current speed: " + vehicle.getCurrentSpeed());
        vehicle.accelerate();
        System.out.println("Current speed: " + vehicle.getCurrentSpeed());
        vehicle.brake();
        System.out.println("Current speed: " + vehicle.getCurrentSpeed());

        // Exercise 4: Clase Persona
        Person person1 = new Person("Daniel", 21, "Male");
        Person person2 = new Person("William", 25, "Male");
        Person.compareAge(person1, person2);

        // Exercise 5: Clase Cuenta Bancaria
        BankAccount bankAccount = new BankAccount(123456, "John Doe");
        bankAccount.printBalance();
        bankAccount.deposit(500.0);
        bankAccount.withdraw(200.0);
        bankAccount.printBalance();
        bankAccount.printTransactions();
    }
}
