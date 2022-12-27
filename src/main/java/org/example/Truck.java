package org.example;

public class Truck extends Transport {
    public Truck(String name, int capacity, int speed, float costOfKm) {
        super(name, capacity, speed, costOfKm);
    }

    public Truck(){

    }
    public float getPrice(City city){
        float stoimost= (float) (getCostOfKm()* city.getDistance());
        return stoimost;
    }

    }
