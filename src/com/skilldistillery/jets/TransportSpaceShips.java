package com.skilldistillery.jets;

public class TransportSpaceShips extends SpaceShip implements Haul {

    public TransportSpaceShips(String model, Double speedInMph, int range, long price, String type){
       super(model, speedInMph, range, price, type);
    }






    @Override
    public void load() {
        System.out.println(this.getModel() +" Loading cargo area");
    }


}
