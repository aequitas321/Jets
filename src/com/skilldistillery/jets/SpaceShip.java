package com.skilldistillery.jets;

public abstract class SpaceShip {
    private String model;
    private double speedInMph;
    private int range;
    private long price;

    protected SpaceShip() {
    }

//    protected SpaceShip() {
//    }

    public abstract void fly();
    public abstract void getSpeedInMach();


// Constructor
    public SpaceShip(String model, Double speedInMph, int range, long price) {

    }

//Getters and Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeed() {
        return speedInMph;
    }

    public void setSpeed(double speedInMph) {
        this.speedInMph = speedInMph;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public long getPrice() {
        return price;
    }


    public String toString() {
        return "SpaceShip{" +
                "model='" + model + '\'' +
                ", speed=" + speedInMph +
                ", range=" + range +
                ", price=" + price +
                '}';
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
