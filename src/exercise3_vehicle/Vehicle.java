package exercise3_vehicle;

/**
 * Sistema Básico de Vehículos:
 * Crea una clase Vehiculo con atributos marca, modelo, y velocidadMaxima.
 * Implementa métodos para acelerar y frenar, modificando la velocidad actual, y
 * asegúrate de que no exceda la velocidad máxima ni sea negativa.
 */

public class Vehicle {
    protected String brand;
    protected String model;
    protected int currentSpeed;
    protected int maxSpeed;

    public Vehicle(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void accelerate() {
        boolean canAccelerate = this.currentSpeed + 10 <= this.maxSpeed;
        if (canAccelerate) {
            this.currentSpeed += 10;
        }
    }

    public void brake() {
        boolean canBrake = this.currentSpeed - 10 >= 0;
        if (canBrake) {
            this.currentSpeed -= 10;
        }
    }
}
