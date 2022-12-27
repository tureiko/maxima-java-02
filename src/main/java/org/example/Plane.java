package org.example;

public class Plane extends Transport{
    public Plane(String name, int capacity, int speed, float costOfKm) {
        super(name, capacity, speed, costOfKm);
    }

    public Plane() {

    }

    public float getPrice(City city){
        float stoimost;
        if (city.isHasAirport()) {return stoimost= (float) (getCostOfKm()* city.getDistance());}
        else{return 0;}

    }

}
