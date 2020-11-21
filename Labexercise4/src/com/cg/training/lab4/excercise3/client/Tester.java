package com.cg.training.lab4.excercise3.client;

import com.cg.training.lab4.excercise3.service.CD;

public class Tester {

	public static void main(String[] args) {

	
		CD cd = new CD(1001, "Haunting of the hill house", 1, 8, "Shirley Jackson", "Horror");
		cd.print();
		cd.checkOut();
		cd.print();
		
	}

}
