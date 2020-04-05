package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeathStar {
	private List<SpaceShip> spaceShips = new ArrayList<>();
	private  String[] spaceShipRecord = null;


// CONSTRUCTOR
	public DeathStar(){
		createDeathStarList();
	}


// METHODS TO CALL IN APP
	private void readSpaceShips(String Fleet) {
		try (BufferedReader bufIn = new BufferedReader(new FileReader(Fleet))) {

			String line;
			while ((line = bufIn.readLine()) != null) {
				spaceShipRecord = line.split(", ");
				String spaceShipType = spaceShipRecord[0];
				String spaceShipModel = spaceShipRecord[1];
				double spaceShipSpeed = Double.parseDouble(spaceShipRecord[2]);
				int spaceShipRange = Integer.parseInt(spaceShipRecord[3]);
				Long spaceShipPrice = Long.parseLong(spaceShipRecord[4]);

				if (spaceShipType.equals("fighter")) {
					FighterSpaceShips newFighterSpaceShip = new FighterSpaceShips(spaceShipModel, spaceShipSpeed,
							spaceShipRange, spaceShipPrice, spaceShipType);
					spaceShips.add(newFighterSpaceShip);
				}

				if (spaceShipType.equals("transport")) {
					TransportSpaceShips newTransportSpaceShip = new TransportSpaceShips(spaceShipModel, spaceShipSpeed,
							spaceShipRange, spaceShipPrice, spaceShipType);
					spaceShips.add(newTransportSpaceShip);
				}

				if (spaceShipType.equals("impl")) {
					SpaceShipImpl newImplSpaceShip = new SpaceShipImpl(spaceShipModel, spaceShipSpeed, spaceShipRange,
							spaceShipPrice,spaceShipType);
					spaceShips.add(newImplSpaceShip);
				}

			}

		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public SpaceShip fastestSpaceship() {
//		createDeathStarList();
		double checkSpeed = 0;
		SpaceShip fastestShip = null;
		for (SpaceShip spaceShip : spaceShips) {
			if (spaceShip.getSpeed() > checkSpeed) {
				checkSpeed = spaceShip.getSpeed();
				fastestShip = spaceShip;
			} else {
				continue;
			}

		}
		return fastestShip;
	}

	public List<SpaceShip> createDeathStarList() {
		readSpaceShips("Fleet.txt");
		return spaceShips;
	}

	public List<SpaceShip> getSpaceShips() {
		return spaceShips;
	}

	public void flyAll() {
//		createDeathStarList();
		for (SpaceShip spaceShip : spaceShips) {
			spaceShip.fly();
		}
	}

	public void listFleet() {
		for (SpaceShip spaceShip : spaceShips) {
			System.out.println(spaceShip);
		}
		
	}
	
	public SpaceShip longestRange() {
//		createDeathStarList();
		double checkRange = 0;
		SpaceShip longestRangeShip = null;
		for (SpaceShip spaceShip : spaceShips) {
			if (spaceShip.getRange() > checkRange) {
				checkRange = spaceShip.getRange();
				longestRangeShip = spaceShip;
			}

		}
		return longestRangeShip;
	}

	public void loadingCargo(){
		for (SpaceShip spaceShip:spaceShips) {
			if(spaceShip instanceof TransportSpaceShips){
				((TransportSpaceShips) spaceShip).load();
			}
		}
	}

	public void engageEnemy(){
		for (SpaceShip spaceShip:spaceShips) {
			if (spaceShip instanceof FighterSpaceShips){
				((FighterSpaceShips) spaceShip).engage();
			}
		}
	}

	public void addSpaceShip(){
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the model of your SpaceShip?");
		String model = kb.nextLine();

		System.out.println("What is the top speed of your SpaceShip?");
			double speed = kb.nextDouble();

		System.out.println("How far can your SpaceShip go without refueling?");
			int range = kb.nextInt();

		System.out.println("What is the price of your SpaceShip?");
		long price = kb.nextLong();

		spaceShips.add(new SpaceShipImpl(model, speed, range, price,"impl"));
	}

	public void removeSpaceShip(){
		int i = 1;
		System.out.println("Which SpaceShip would you like to remove?");

		for (SpaceShip spaceShip:spaceShips) {
			System.out.println(i + ") " + spaceShip.toString());
			i++;
		}

		Scanner kb = new Scanner(System.in);
		System.out.print("Choice: ");
		try{
			spaceShips.remove(kb.nextInt() - 1);
			listFleet();
		} catch (Exception e){
			System.out.println("Invalid input, Please try again");
			removeSpaceShip();
		}

		}
	}

