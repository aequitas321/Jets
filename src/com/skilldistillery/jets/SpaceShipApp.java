package com.skilldistillery.jets;

public class SpaceShipApp {

	public static void main(String[] args) {
		FighterSpaceShips xWing = new FighterSpaceShips("X-Wing", (double) 900, 4, 300_000_000);
		System.out.println(xWing.toString());
		TransportSpaceShips falcon = new TransportSpaceShips("Selenium Falcon", 6.0, 3, 1_000_000_000);
		System.out.println(falcon.toString());
	}

}
