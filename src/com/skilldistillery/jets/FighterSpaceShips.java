package com.skilldistillery.jets;

public class FighterSpaceShips extends SpaceShip implements Attack {


    @Override
    public void fly() {
        System.out.println();
    }

    @Override
    public void getSpeedInMach() {

    }

    public FighterSpaceShips(String model, Double speedInMph, int range, long price){

        this.setModel(model);
        this.setSpeed(speedInMph);
        this.setRange(range);
        this.setPrice(price);

    }
}
