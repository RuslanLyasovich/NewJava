package com.automation.java_collections_main;

public class SedanCar extends Car{
    SedanCar(int carID, String brand, String model, double fuelConsumption, int velocity, int maxCarryingWeight, int maxPassengers, int doors, double price) {
        super(carID, brand, model, fuelConsumption, velocity, maxCarryingWeight, maxPassengers, doors, price);
        this.maxPassengers = 4;
        this.doors = 4;
    }
}
