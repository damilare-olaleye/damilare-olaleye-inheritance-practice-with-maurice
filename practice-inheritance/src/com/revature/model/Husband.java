package com.revature.model;

public class Husband extends GrandParents{
	int totalDailyWalks = 0 ;

	public Husband(String lastName, String Address, int totalAge) {
		super(lastName, Address, totalAge);
	}

	public int dailyWalks(int milesPerWalk) {
		for (int i = 0; i <= milesPerWalk; i++ ) {
			totalDailyWalks += i;
		}
		return totalDailyWalks;
	}
	
}
