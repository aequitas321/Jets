package com.skilldistillery.jets;

public abstract class SpaceShip {
    private String model;
    private double speedInMph;
    private int range;
    private long price;

//    protected SpaceShip() {
//    }

//    protected SpaceShip() {
//    }

    public void fly() {
    	System.out.println("Taking off from the DeathStar");
    	
    }
    public void getSpeedInMach() {
    	                       
    }


// Constructor
    public SpaceShip(String model, Double speedInMph, int range, long price) {
    	this.model = model;
    	this.price = price;
    	this.range = range;
    	this.speedInMph = speedInMph;
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
                "model = '" + model + '\'' +
                ", speed in MPH = " + speedInMph +
                ", range in days = " + range +
                ", price in Credits = " + price +
                '}';
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
