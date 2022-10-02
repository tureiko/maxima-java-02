package org.example;

public class Ship extends Transport{

    public Ship(String name, int capacity, int speed, float costOfKm) {
        super(name, capacity, speed, costOfKm);
    }

    @Override
    public float getPrice(City city) {
         super.getPrice(city);
         if (city.isOnWater())return super.getPrice(city);else return 0;




    }


}
