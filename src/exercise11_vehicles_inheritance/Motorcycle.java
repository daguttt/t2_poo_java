package exercise11_vehicles_inheritance;

import exercise3_vehicle.Vehicle;

public class Motorcycle extends Vehicle {
    /**
     * Reference: <a href="https://www.pontgrup.com/blog/tipos-de-cascos-de-moto/#casco-off-road">Tipos de cascos</a>
     */
    public enum HelmetType {
        CLASSIC,
        INTEGRAL,
        COLLAPSIBLE
    }

    private final HelmetType helmetType;

    public Motorcycle(String brand, String model, int maxSpeed, HelmetType helmetType) {
        super(brand, model, maxSpeed);
        this.helmetType = helmetType;
    }

    public void printCharacteristics() {
        System.out.println(this); // -> This will call the `toString()` method
    }

    @Override
    public String toString() {
        return String.format("Brand: %s | Model: %s | Max speed: %d | Helmet type: %s", brand, model, maxSpeed, helmetType);
    }
}
