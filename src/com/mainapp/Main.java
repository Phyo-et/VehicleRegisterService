package com.mainapp;

import com.model.Vehicle;
import com.service.CarRegisterService;
import com.service.MotorcycleRegisterService;
import com.service.TruckRegisterService;
import com.service.VehicleRegisterService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static VehicleRegisterService service = null;

    public static void main(String[] args) throws IOException {

            getVehicleInfo();

        for (int i = 0; i< Vehicle.getCount(); i++){
            service.vehicles[i].displayInfo();
            System.out.println("\n");
        }
    }

    private static void getVehicleInfo() throws IOException{
        String flag=null;
            do{
                System.out.print("Enter the Type of Vehicle (Car ,MotorCycle,Truck) : ");
                String type= br.readLine();
                if(type.equalsIgnoreCase("car")){
                    service = new CarRegisterService();
                } else if (type.equalsIgnoreCase("truck")){
                    service = new TruckRegisterService();
                }else if (type.equalsIgnoreCase("Motorcycle")){
                    service = new MotorcycleRegisterService();
                }
                service.register();
                System.out.print("Do u want to add more Vehicles? (Yes/No)");
                flag = br.readLine();
            }while(flag.equalsIgnoreCase("yes"));


    }
}