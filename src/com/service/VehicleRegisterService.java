package com.service;

import com.model.Car;
import com.model.Motorcycle;
import com.model.Truck;
import com.model.Vehicle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VehicleRegisterService {
    public static Vehicle[] vehicles= new Vehicle[100];
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private String brand;
    private int model;

    public void register() throws IOException {
        getCommonInfo();
        Vehicle vehicle = getSpecificInfo();
        vehicles[Vehicle.getCount()-1]=vehicle;

    }

    public void getCommonInfo() throws IOException {
        System.out.print("Enter the Brand of Verhicle : ");
        this.brand= br.readLine();
        System.out.print("Enter the model number of Verhicle : ");
        this.model= Integer.parseInt(br.readLine());
    }
    public Vehicle getSpecificInfo() throws IOException {
        return null;
    }
    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
