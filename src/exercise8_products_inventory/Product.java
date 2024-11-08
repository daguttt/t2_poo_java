package exercise8_products_inventory;

public class Product {
  private String name;
  private double price;
  private String category;
  private int stock;

  public Product(String name, double price, String category) {
    this(name, price, category, 0);
  }

  public Product(String name, double price, String category, int stock) {
    this.name = name;
    this.price = price;
    this.category = category;
    this.stock = stock;
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

  public int getStock() {
    return stock;
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

  public void setStock(int stock) {
    this.stock = stock;
  }

  @Override
  public String toString() {
    return String.format("Name: %s | Price: %.2f | Category: %s | Stock: %d", name, price, category, stock);
  }
}
