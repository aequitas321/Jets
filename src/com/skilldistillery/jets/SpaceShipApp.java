package com.skilldistillery.jets;

import java.util.Scanner;

public class SpaceShipApp {
    Scanner kb = new Scanner(System.in);

    // New DeathStar instance
    DeathStar command = new DeathStar();



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
        String userChoice = kb.nextLine();
        switch (userChoice) {
            case "1":
                command.listFleet();
                break;
            case "2":
                command.flyAll();
                break;
            case "3":
                System.out.println("The fastest ship is " + command.fastestSpaceship());
                break;
            case "4":
                System.out.println("The ship with the longest fuel range is " + command.longestRange());
                break;
            case "5":
                command.loadingCargo();
                break;
            case "6":
                command.engageEnemy();
                break;
            case "7":
                command.addSpaceShip();
                break;
            case "8":
                command.removeSpaceShip();
                break;
            case "9":
                System.exit(0);

            default:
                break;
        }
        printMenu();
    }
}


