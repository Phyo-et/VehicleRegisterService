package com.service;

import com.model.Car;
import com.model.Truck;
import com.model.Vehicle;

import java.io.IOException;

public class TruckRegisterService extends VehicleRegisterService{
    @Override
    public Vehicle getSpecificInfo()throws IOException {
        System.out.print("Enter the kilogram of payLoadCapacity :  ");
        double payLoadCapacity = Double.parseDouble(br.readLine());


        Truck truck = new Truck(this.getBrand(),this.getModel(),payLoadCapacity);
        return truck;
    }
}
