package com.automation.java_collections_main;

public class Car {

        private int carID;
        private String brand;
        private String model;
        private double fuelConsumption;
        private int velocity;
        private int maxCarryingWeight;
        private int maxPassengers;
        private double price;

    Car (int carID, String brand, String model, double fuelConsumption, int velocity, int maxCarryingWeight, int maxPassengers, double price) {
        this.carID = carID;
        this.brand = brand;
        this.model = model;
        this.fuelConsumption = fuelConsumption;
        this.velocity = velocity;
        this.maxCarryingWeight = maxCarryingWeight;
        this.maxPassengers = maxPassengers;
        this.price = price;
    }


    public int getCarID() {
        return carID;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getMaxCarryingWeight() {
        return maxCarryingWeight;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  "\n" +
                "carID : " + carID +
                ", brand : " + brand + "" +
                ", model : " + model + "" +
                ", fuelConsumption : " + fuelConsumption + "" +
                ", velocity : " + velocity + "" +
                ", maxCarryingWeight : " + maxCarryingWeight + "" +
                ", maxPassengers : " + maxPassengers + "" +
                ", price : " + price + "" + "\n";
    }
}


