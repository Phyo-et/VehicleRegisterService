package com.service;

import com.model.Motorcycle;
import com.model.Vehicle;

import java.io.IOException;

public class MotorcycleRegisterService extends VehicleRegisterService{

    @Override
    public Vehicle getSpecificInfo()throws IOException {
        System.out.print("Motorcycle has sidecar (yes/no):  ");
        String hasSidecar = br.readLine();


        Motorcycle motorcycle= new Motorcycle(this.getBrand(),this.getModel(),hasSidecar);
        return motorcycle;
    }
}
