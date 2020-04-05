package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DeathStar {
	private List<SpaceShip> spaceShips = new ArrayList<>();

	private void readSpaceShips(String Fleet) {
		try (BufferedReader bufIn = new BufferedReader(new FileReader(Fleet))) {

			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] spaceShipRecord = line.split(", ");
				String spaceShipType = spaceShipRecord[0];
				String spaceShipModel = spaceShipRecord[1];
				double spaceShipSpeed = Double.parseDouble(spaceShipRecord[2]);
				int spaceShipRange = Integer.parseInt(spaceShipRecord[3]);
				Long spaceShipPrice = Long.parseLong(spaceShipRecord[4]);

				if (spaceShipType.equals("fighter")) {
					FighterSpaceShips newFighterSpaceShip = new FighterSpaceShips(spaceShipModel, spaceShipSpeed,
							spaceShipRange, spaceShipPrice);
					spaceShips.add(newFighterSpaceShip);
				}

				if (spaceShipType.equals("transport")) {
					TransportSpaceShips newTransportSpaceShip = new TransportSpaceShips(spaceShipModel, spaceShipSpeed,
							spaceShipRange, spaceShipPrice);
					spaceShips.add(newTransportSpaceShip);
				}

				if (spaceShipType.equals("impl")) {
					SpaceShipImpl newImplSpaceShip = new SpaceShipImpl(spaceShipModel, spaceShipSpeed, spaceShipRange,
							spaceShipPrice);
					spaceShips.add(newImplSpaceShip);
				}

			}

		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public SpaceShip fastestSpaceship() {
		createDeathStarList();
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

	public void setSpaceShips(List<SpaceShip> spaceShips) {
		this.spaceShips = spaceShips;
	}

	public void flyAll() {
		createDeathStarList();
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
		createDeathStarList();
		double checkRange = 0;
		SpaceShip longestRangeShip = null;
		for (SpaceShip spaceShip : spaceShips) {
			if (spaceShip.getRange() > checkRange) {
				checkRange = spaceShip.getRange();
				longestRangeShip = spaceShip;
			} else {
				continue;
			}

		}
		return longestRangeShip;
	}
}
