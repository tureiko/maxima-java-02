package org.example;

public abstract  class Transport implements Repairable{


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
    public Transport(String name, int capacity, int speed, float costOfKm) {
        this.name = name;
        this.capacity = capacity;
        this.speed = speed;
        this.costOfKm = costOfKm;
    }
    private String name;
    private int capacity;
    private int speed;
    private float costOfKm;

    @Override
    public String toString() {
        return "Transport{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", speed=" + speed +
                ", costOfKm=" + costOfKm +
                '}';
    }

   abstract public float getPrice(City city);




}




