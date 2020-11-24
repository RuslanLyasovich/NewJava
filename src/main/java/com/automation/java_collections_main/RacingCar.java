package com.automation.java_collections_main;

public class RacingCar extends SportCar{

    private boolean turbine = true;

    RacingCar(int carID, String brand, String model, double fuelConsumption, int velocity, int maxCarryingWeight, int maxPassengers, int doors, double price, boolean accelerator, boolean turbine) {
        super(carID, brand, model, fuelConsumption, velocity, maxCarryingWeight, maxPassengers, doors, price, accelerator);
    }
}
