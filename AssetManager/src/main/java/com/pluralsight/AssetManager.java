package com.pluralsight;

import java.util.ArrayList;

public class AssetManager {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        // Adding Houses
        assets.add(new House("My House", "2020-05-13", 300000.0,
                "123 Main St, New York, NY", 1, 2000, 5000));
        assets.add(new House("Vacation Home", "2018-07-22", 250000.0,
                "456 Lakeview Dr, Upstate NY", 2, 1500, 4000));

        // Adding Vehicles
        assets.add(new Vehicle("Tom's Truck", "2019-03-15", 35000.0,
                "Ford F-150", 2019, 120000));
        assets.add(new Vehicle("My Car", "2021-06-10", 28000.0,
                "Toyota Camry", 2021, 30000));

        // Displaying Asset Details
        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.printf("Original Cost: $%.2f%n", asset.getOriginalCost());
            System.out.printf("Current Value: $%.2f%n", asset.getValue());

            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Year: " + vehicle.getYear());
                System.out.println("Make/Model: " + vehicle.getMakeModel());
            }

            System.out.println("-----------------------------------");
        }
    }
}
