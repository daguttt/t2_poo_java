package exercise15_vehicles_maintenance;

import exercise3_vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Fleet {
    private final List<Vehicle> vehicles;

    public Fleet() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void registerMaintenance(int mileageLimit) {
        vehicles.stream()
                .filter(vehicle -> vehicle.getMileage() >= mileageLimit)
                .forEach(Vehicle::performMaintenance);
    }
}