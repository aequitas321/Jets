package com.skilldistillery.jets;

import java.util.List;

public class SpaceShipApp {

	public static void main(String[] args) {
		DeathStar command = new DeathStar();
		List<SpaceShip> fleet = command.createDeathStarList();
		
		for (SpaceShip spaceShip : fleet) {
			System.out.println(spaceShip);
			
		}
		

	}

}
