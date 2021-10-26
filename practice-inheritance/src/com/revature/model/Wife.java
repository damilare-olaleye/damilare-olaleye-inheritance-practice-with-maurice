package com.revature.model;

public class Wife extends GrandParents {
	
	int totalCaloriesIntake = 0;

	public Wife(String lastName, String Address, int totalAge) {
		super(lastName, Address, totalAge);
	}
	
	public int caloriesIntakePerWeek(int caloriesIntake) {
		for(int i = 0; i < caloriesIntake; i++) {
			totalCaloriesIntake += i;
		}
		return totalCaloriesIntake;
	}
	
	public void eyesColor(String color) {
		System.out.println("Blue");
	}
	
	public void height(String height) {
		System.out.println("6'7");
	}

}
