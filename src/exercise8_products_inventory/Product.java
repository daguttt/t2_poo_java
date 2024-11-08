package exercise8_products_inventory;

public class Product {
  private String name;
  private double price;
  private String category;

  public Product(String name, double price, String category) {
    this.name = name;
    this.price = price;
    this.category = category;
  }

  // Getters
  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public String getCategory() {
    return category;
  }

  // Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  @Override
  public String toString() {
    return String.format("Name: %s | Price: %.2f | Category: %s", name, price, category);
  }
}
