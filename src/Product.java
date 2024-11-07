public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void increaseStock(int amount) {
        stock += amount;
    }

    public void decreaseStock(int amount) {
        stock -= amount;
    }

    public int getStock() {
        return stock;
    }
}
