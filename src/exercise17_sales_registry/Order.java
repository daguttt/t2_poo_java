package exercise17_sales_registry;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private ArrayList<Product> products;
    private double total;

    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
        this.total = 0;
    }

    public void addProduct(Product product, int quantity) {
        if (product.getStock() >= quantity) {
            products.add(product);
            total += product.getPrice() * quantity;
            product.reduceStock(quantity);
        } else {
            System.out.printf("Insufficient stock for %s%n", product.getName());
        }
    }

    public double getTotal() {
        return total;
    }

    public void displayOrderDetails() {
        System.out.printf("Order for: %s (%s)%n", customer.getName(), customer.getEmail());
        for (Product product : products) {
            System.out.printf("- %s $%.2f%n", product.getName(), product.getPrice());
        }
        System.out.printf("Total: $%.2f%n", total);
    }
}