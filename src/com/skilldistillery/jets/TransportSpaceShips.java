package com.skilldistillery.jets;

public class TransportSpaceShips extends SpaceShip implements Haul {


    public TransportSpaceShips(String model, Double speedInMph, int range, long price){
       super(model, speedInMph, range, price);
    }


    @Override
    public void fly() {

    }

    @Override
    public void getSpeedInMach() {

    }
}
