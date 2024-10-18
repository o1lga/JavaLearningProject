package com.olgacosneanuqa.classesandobjects.autoservicetask;

public class ManageAutoService {

    public static void main(String[] args) {

        // Declararea si initializarea obiectelor folosind toate tipurile de constructori

        Car car0001 = new Car("Q5", "Audi", "Black");
        Car car0002 = new Car("508", "Peugeout", "Gray");

        System.out.println(car0002.make + " " + car0002.model + " " + car0002.color + " " + car0002.plateNumber);

        Car car0003 = new Car("BMW", "X5", "White", "BOS 01", 65458);
        Car car0004 = new Car("BMW", "X5", "White", "BOS 01", 45458);

        Tool tool0001 = new Tool("Hammer", 2);
        System.out.println("The name of the tool is " + tool0001.name + " and its weight is " + tool0001.weight);

        Garage garage001 = new Garage();
        System.out.println(garage001.name + "on address: " + garage001.address);
        garage001.name = "Auto-Detailing";
        System.out.println(garage001.name + "on address: " + garage001.address);
        garage001.address = "Stefan cel Mare 146";
        System.out.println(garage001.name + "on address: " + garage001.address);

        Worker worker001 = new Worker();
        System.out.println(worker001.name);
        worker001.name = "George";
        worker001.salary = 5;
        worker001.age = 18;
        System.out.println(worker001.name);
        System.out.println(worker001.age);
        System.out.println(garage001.name);

    }
}
