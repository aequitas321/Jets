package com.skilldistillery.jets;

public class FighterSpaceShips extends SpaceShip implements Attack {

    public void fly() {
    	super.fly();
        System.out.println(" Attacking the Rebel scum");
    }

    @Override
    public void getSpeedInMach() {

    }

    public FighterSpaceShips(String model, Double speedInMph, int range, long price, String type){
    	super(model, speedInMph, range, price, type);


    }


    @Override
    public void engage() {
        System.out.println(this.getModel() + " Starting attack on Umbra");
    }
}
        