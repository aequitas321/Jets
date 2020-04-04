package com.skilldistillery.jets;

public class TransportSpaceShips extends SpaceShip implements Haul {


    public TransportSpaceShips(String model, Double speedInMph, int range, long price){
        this.setModel(model);
        this.setPrice(price);
        this.setSpeed(speedInMph);
        this.setRange(range);
    }


    @Override
    public void fly() {

    }

    @Override
    public void getSpeedInMach() {

    }
}
