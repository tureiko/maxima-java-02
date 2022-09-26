package org.example;

public class Transport {
    public Transport() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getCostOfKm() {
        return costOfKm;
    }

    public void setCostOfKm(float costOfKm) {
        this.costOfKm = costOfKm;
    }

    private String name="фургон";
    private int capacity=500;
    private int speed=90;
    private float costOfKm=3.2f;

    public  float getPrice(int city){

        float stoimost= getCostOfKm()*100;
        //System.out.println(stoimost);


        return stoimost;
    }

}




