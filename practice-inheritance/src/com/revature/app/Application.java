package com.revature.app;

import com.revature.model.Daughter;
import com.revature.model.Husband;
import com.revature.model.Son;
import com.revature.model.Wife;

public class Application {

	public static void main(String[] args) {
		
		Husband firstKid = new Daughter("Vanessa", "1234 N West Rd", 22);
		Wife secondKid = new Son("Kane", "5678 Kings Rd", 25);
		
		System.out.println(firstKid.caloriesIntakePerWeek(10000));
		System.out.println(secondKid.caloriesIntakePerWeek(24000));
		
		System.out.println(firstKid.dailyWalks(3));
		System.out.println();
		
		
	
	}

}
