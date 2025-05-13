package com.pluralsight;

public class Vehicles {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        slowRide.setNumberOfPassengers(1);
        slowRide.setCargoCapacity(10);

        Car familyCar = new Car();
        familyCar.setColor("Blue");
        familyCar.setFuelCapacity(50);
        familyCar.setNumberOfPassengers(5);
        familyCar.setCargoCapacity(500);

        SemiTruck bigRig = new SemiTruck();
        bigRig.setColor("Black");
        bigRig.setFuelCapacity(300);
        bigRig.setNumberOfPassengers(2);
        bigRig.setCargoCapacity(20000);

        Hovercraft hover = new Hovercraft();
        hover.setColor("Green");
        hover.setFuelCapacity(100);
        hover.setNumberOfPassengers(4);
        hover.setCargoCapacity(800);

        System.out.println("Moped Color: " + slowRide.getColor());
        System.out.println("Car Fuel Capacity: " + familyCar.getFuelCapacity());
        System.out.println("SemiTruck Cargo Capacity: " + bigRig.getCargoCapacity());
        System.out.println("Hovercraft Passengers: " + hover.getNumberOfPassengers());
    }
}