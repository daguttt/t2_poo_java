package exercise17_sales_registry;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private ArrayList<Product> inventory;

    public Store() {
        inventory = new ArrayList<>();
    }

    public void addProductToInventory(Product product) {
        inventory.add(product);
    }

    public void processOrder(Customer customer, List<Product> orderProducts) {
        Order order = new Order(customer);
        for (Product product : orderProducts) {
            order.addProduct(product, 1);
        }
        order.displayOrderDetails();
    }
}