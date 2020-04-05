package com.skilldistillery.jets;

public class FighterSpaceShips extends SpaceShip implements Attack {


    
    public void fly() {
    	super.fly();
        System.out.println(" Attacing the Rebel scum");
    }

    @Override
    public void getSpeedInMach() {

    }

    public FighterSpaceShips(String model, Double speedInMph, int range, long price){
    	super(model, speedInMph, range, price);
        
        
        

    }
}
        