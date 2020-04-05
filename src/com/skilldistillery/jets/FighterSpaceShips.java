package com.skilldistillery.jets;

public class FighterSpaceShips extends SpaceShip implements Attack {




    public FighterSpaceShips(String model, Double speedInMph, int range, long price, String type){
    	super(model, speedInMph, range, price, type);


    }


    @Override
    public void engage() {
        System.out.println(this.getModel() + " Starting attack on Umbra");
    }
}
        