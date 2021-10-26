package com.revature.model;

public class GrandParents {

	String lastName;
	String Address;
	int totalAge;
	int caloriesIntake;

	public GrandParents(String lastName, String Address, int totalAge) {
		this.lastName = lastName;
		this.Address = Address;
		this.totalAge = totalAge;
	}

	public int dailyWalks(int milesPerWalk) {
		return milesPerWalk;
	}

	public int caloriesIntakePerWeek(int caloriesIntake) {
		return this.caloriesIntake = caloriesIntake;
	}

}
