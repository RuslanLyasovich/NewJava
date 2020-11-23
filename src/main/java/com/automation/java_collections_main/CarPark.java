package com.automation.java_collections_main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class CarPark {

    private String carParkName;
    private ArrayList<Car> carCollection;

    CarPark(String carParkName) {
        this.carParkName = carParkName;
        this.carCollection = new ArrayList<>();
    }


    public void addCar(Car car) {
        carCollection.add(car);
    }


    public void calculateCostOfAllCars() {
        double poolPrice = 0.0;
        for (Car car : carCollection) {
            poolPrice += car.getPrice();
        }
        System.out.println("\n" + "Cost of TaxiTravel's cars: " + Math.round(poolPrice * 100) / 100.0 + "\n");

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




