package com.service;

import com.model.Car;
import com.model.Vehicle;

import java.io.IOException;

public class CarRegisterService extends VehicleRegisterService{
    @Override
    public Vehicle getSpecificInfo()throws IOException {
        System.out.print("Enter the number of Doors :  ");
        int doors = Integer.parseInt(br.readLine());


        Car car = new Car(getBrand(),getModel(),doors);
        return car;
    }
}
