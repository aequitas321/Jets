package com.skilldistillery.jets;

import java.util.List;
import java.util.Scanner;

public class SpaceShipApp {
	Scanner kb = new Scanner(System.in);

	// New DeathStar instance
	DeathStar command = new DeathStar();

	// Spaceship
	List<SpaceShip> fleet = command.createDeathStarList();

	public static void main(String[] args) {
		SpaceShipApp run = new SpaceShipApp();
		run.printMenu();

	}

	public void printMenu() {
		System.out.println("───────────────────────────");
		System.out.println("\tMenu");
		System.out.println("┍-------------------------------------------┑");
		System.out.println("| 1) - List Fleet                           |");
		System.out.println("| 2) - Fly all Spaceships                   |");
		System.out.println("| 3) - View the fastest Spaceship           |");
		System.out.println("| 4) - View Spaceship with the longest range|");
		System.out.println("| 5) - Load all Transport Ships             |");
		System.out.println("| 6) - Space Battle!                        |");
		System.out.println("| 7) - Add your own Spaceship               |");
		System.out.println("| 8) - Remove a Spaceship from the Fleet    |");
		System.out.println("| 9) - Quit Application                     |");
		System.out.println("┗-------------------------------------------┙");
		System.out.print("choice: ");

		switch (kb.next()) {
		case "1":
			command.listFleet();
			break;
		case "2":
			command.flyAll();
			break;
		case "3":
			System.out.println(command.fastestSpaceship());
			break;
		case "4":
			System.out.println(command.longestRange());
			break;
		case "5":
			

		}
	}

}
