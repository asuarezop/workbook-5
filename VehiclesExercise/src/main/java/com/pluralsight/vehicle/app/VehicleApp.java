package com.pluralsight.vehicle.app;

import com.pluralsight.vehicle.Car;
import com.pluralsight.vehicle.Hovercraft;
import com.pluralsight.vehicle.Moped;
import com.pluralsight.vehicle.SemiTruck;

public class VehicleApp {
    public static void main(String[] args) {
        Moped vespa = new Moped();
        vespa.setColor("Red");
        vespa.setFuelCapacity(30);

        Hovercraft spaceRim = new Hovercraft();
        spaceRim.setColor("Silver");
        spaceRim.setFuelCapacity(50);
        spaceRim.setNumOfPassengers(6);

        SemiTruck oldBeatUpTruck = new SemiTruck();
        oldBeatUpTruck.setColor("Green");
        oldBeatUpTruck.setCargoCapacity(300);
        oldBeatUpTruck.setFuelCapacity(60);

        Car hondaAccord = new Car();
        hondaAccord.setColor("Light Blue");
        hondaAccord.setFuelCapacity(85);
    }
}
