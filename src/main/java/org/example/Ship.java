package org.example;

public class Ship extends Transport{

    public Ship(String name, int capacity, int speed, float costOfKm) {
        super(name, capacity, speed, costOfKm);
    }
    public float getPrice(City city){

        float stoimost= getCostOfKm()* city.getDistanceKm();
       if (city.isOnWater())return stoimost;else return 0;



    }

}
