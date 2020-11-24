package com.automation.java_collections_main;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class CarPark {

    private String carParkName;
    private static ArrayList<Car> carCollection;


    CarPark(String carParkName) {
        this.carParkName = carParkName;
        carCollection = new ArrayList<>();
    }


    public void addCar(Car car) {
        carCollection.add(car);
    }


    public void calculateCostOfAllCars() {
        double poolPrice = 0.0;
        for (Car car : carCollection) {
            poolPrice += car.getPrice();
        }
        System.out.println("\n" + "Cost of TaxiTravel's cars: " + Math.round(poolPrice) + "\n");

    }

    public void sortToFuelConsumption() {
        System.out.println("Cars are sorted by fuel consumption :");
        Collections.sort(carCollection, Comparator.comparingDouble(Car::getFuelConsumption));
        System.out.println(carCollection.toString());

    }


    void selectCarBySpeedRange(int minVelocity, int maxVelocity) {
        System.out.println( "\n" + "Cars with a speed range from " + minVelocity + "to " + maxVelocity+ ":");
        for (Car car : carCollection) {
            if (car.getVelocity() >= minVelocity && car.getVelocity() <= maxVelocity) {
                System.out.printf("" + car);
            }
        }
    }
}




