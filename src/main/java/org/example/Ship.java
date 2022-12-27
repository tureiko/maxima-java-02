package org.example;

public class Ship extends Transport{

    public Ship(String name, int capacity, int speed, float costOfKm) {
        super(name, capacity, speed, costOfKm);
    }

    public Ship() {
      // super();
    }

    @Override

        // public float getPrice() {
   public float getPrice(City city){
        float stoimost;
        if (city.isOnWater()) {return stoimost= (float) (getCostOfKm()* city.getDistance());}
        else{return 0;}

    }




}
