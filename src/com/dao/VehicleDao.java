package com.dao;

import com.model.Vehicle;

public class VehicleDao {
    public static Vehicle[] vehicleDB = new Vehicle[100];

    public static void create(Vehicle vehicle){
        vehicleDB[Vehicle.getCount()-1] = vehicle;
    }
    public static Vehicle[] getAll(){
        return vehicleDB;
    }
}
