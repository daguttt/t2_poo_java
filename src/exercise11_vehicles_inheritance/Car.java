package exercise11_vehicles_inheritance;

import exercise3_vehicle.Vehicle;

public class Car extends Vehicle {

    private final int doorNumber;

    public Car(String brand, String model, int maxSpeed) {
        super(brand, model, maxSpeed);
        this.doorNumber = 4;
    }

    public Car(String brand, String model, int maxSpeed, int doorNumber) {
        super(brand, model, maxSpeed);
        this.doorNumber = doorNumber;
    }

    public void printCharacteristics() {
        System.out.println(this); // -> This will call the `toString()` method
    }

    @Override
    public String toString() {
        return String.format("Brand: %s | Model: %s | Max speed: %d | Doors: %d", brand, model, maxSpeed, doorNumber);
    }
}
