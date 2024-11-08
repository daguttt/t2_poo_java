package exercise8_products_inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Inventory {
  private final List<Product> products;

  public Inventory() {
    this.products = new ArrayList<>();
  }

  public void addProduct(Product product) {
    products.add(product);
  }

  public boolean removeProduct(String name) {
    return products.removeIf(product -> product.getName().equals(name));
  }

  public List<Product> findByCategory(String category) {
    return products.stream()
        .filter(product -> product.getCategory().equalsIgnoreCase(category))
        .collect(Collectors.toList());
  }

  public double calculateTotalValue() {
    return products.stream()
        .mapToDouble(Product::getPrice)
        .sum();
  }

  public Product findByName(String name) {
    return products.stream()
        .filter(product -> product.getName().equalsIgnoreCase(name))
        .findFirst()
        .orElse(null);
  }
}
