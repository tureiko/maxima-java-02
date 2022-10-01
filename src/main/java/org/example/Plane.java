package org.example;

public class Plane extends Transport{
    public Plane(String name, int capacity, int speed, float costOfKm) {
        super(name, capacity, speed, costOfKm);
    }
    public  float getPrice(City city){

        float stoimost= getCostOfKm()* city.getDistanceKm();
        if (city.isHasAirport())return stoimost;else return 0;


    }

}
