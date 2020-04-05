package com.skilldistillery.jets;

public abstract class SpaceShip {
    private String model;
    private double speedInMph;
    private int range;
    private long price;
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public void fly() {
        System.out.println("Mode: " + this.getModel() + " Speed: " + this.getSpeed() + " Range: " + this.getRange() + " Will need fuel in " + getSpeed()/getRange() + " days.");

    }

    public void getSpeedInMach() {

    }


    // Constructor

    public SpaceShip(String model, Double speedInMph, int range, long price, String type) {
        this.model = model;
        this.price = price;
        this.range = range;
        this.speedInMph = speedInMph;
        this.type = type;
    }
    //Getters and Setters

    public String getType() {
        return type;
    }
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
        return
                "Model: " + model + "\n" +
                "Speed in MPH: " + speedInMph + "\n" +
                 "Range In Days: " + range + "\n" +
                 "price in Credits: " + price + "\n";
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
