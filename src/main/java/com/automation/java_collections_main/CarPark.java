package com.automation.java_collections_main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class CarPark {

    private String CarParkName;
    private ArrayList<Car> carList;

    CarPark(String CarParkName) {
        this.CarParkName = CarParkName;
        this.carList = new ArrayList<>();
    }


    public void addCarToCarList(Car car) {
        carList.add(car);
    }


    public void calculateTheCostOfAllCars() {
        double poolPrice = 0.0;
        for (Car car : carList) {
            poolPrice += car.getPrice();
        }
        System.out.println("\n" + "Cost of TaxiTravel's cars: " + Math.round(poolPrice * 100) / 100.0 + "\n");

    }

    public void selectionToFuelConsumption() {
        System.out.println("Cars are sorted by fuel consumption :");
        Collections.sort(carList, Comparator.comparingDouble(Car::getFuelConsumption));
        System.out.println(carList.toString());

    }


    void selectCarBySpeedRange() {

        System.out.println("\n" + "Search for vehicles that match your speed criteria");

        System.out.println("What should be the minimum vehicle speed? ");
        int minVelocity = getVelocity();


        System.out.println("What value should not exceed the maximum vehicle speed? ");
        int maxVelocity = getVelocity();

        while (maxVelocity < minVelocity) {
            System.out.println("The value you specified is less than the minimum, \n" +
                    "Please specify another");
            maxVelocity = getVelocity();
        }

        System.out.println( "\n" + "Vehicles that can reach the speed range you specified:");
        for (Car car : carList) {
            if (car.getVelocity() >= minVelocity && car.getVelocity() <= maxVelocity) {
                System.out.printf("" + car);
            }
        }
    }
    private int getVelocity() {
            int currentVelocity;
          {
            while (true) {
                try {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    currentVelocity = Integer.parseInt(reader.readLine());
                    break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return currentVelocity;
        }
        }



    }




