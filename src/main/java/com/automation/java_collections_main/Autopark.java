package com.automation.java_collections_main;


// Задание. Создать консольное приложение, удовлетворяющее следующим требованиям:
// Каждый класс должен иметь отражающее смысл название и информативный состав.
// Использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
// Наследование должно применяться только тогда, когда это имеет смысл.
// При кодировании должны быть использованы соглашения об оформлении кода java code convention.
// Классы должны быть грамотно разложены по пакетам
// Консольное меню должно быть минимальным.
// Для хранения параметров инициализации можно использовать файлы.


// Таксопарк.
// Определить иерархию легковых автомобилей.
// Создать таксопарк.
// Подсчитать стоимость автопарка.
// Провести сортировку автомобилей парка по расходу топлива.
// Найти автомобиль в компании, соответствующий заданному диапазону параметров скорости.

public class Autopark {

    public static void main(String[] args) {




        CarPark TaxiTravel = new CarPark("TaxiTravel"); // Создать таксопарк.

        TaxiTravel.addCarToCarList(new Car(1, "Mercedes", "Sprinter", 14.4, 120, 1900, 25, 16000));
        TaxiTravel.addCarToCarList(new Car(2, "Hundai", "Accept", 8.2, 160, 800, 4, 9000));
        TaxiTravel.addCarToCarList(new Car(3, "BMW", "3-series", 7.1, 190, 750, 4, 10200));
        TaxiTravel.addCarToCarList(new Car(4, "LADA", "Priora", 9.2, 140, 750, 4, 8000));
        TaxiTravel.addCarToCarList(new Car(5, "Honda", "Civic", 7.5, 192, 800, 5, 11200));
        TaxiTravel.addCarToCarList(new Car(6, "Audi", "A6", 8, 170, 810, 5, 7900.10));
        TaxiTravel.addCarToCarList(new Car(7, "Ferrari", "California T", 10.5, 316, 987, 2, 295000));


        TaxiTravel.calculateTheCostOfAllCars(); // Подсчитать стоимость автопарка.
        TaxiTravel.selectionToFuelConsumption(); // Провести сортировку автомобилей парка по расходу топлива.
        TaxiTravel.selectCarBySpeedRange(); // Найти автомобиль в компании, соответствующий заданному диапазону параметров скорости.
                                            // Определить иерархию легковых автомобилей.


    }
}


