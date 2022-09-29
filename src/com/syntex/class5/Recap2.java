package com.syntex.class5;

public class Recap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean allergy=true;
String allergyType="Pollen";

if(allergy) {
	System.out.println("Lets check what allergy you have");
	 
	if(allergyType.equals("Pollen")) 	{
			System.out.println("Try to stay indoors when trees are blooming");	
			}else if (allergyType.equals("Peanut")) {
		System.out.println("Please stay away from Penuts");
			}else if (allergyType.equals("Dairy")) {
		System.out.println("Stay away from dairy products");
	}else {
		System.out.println("We need to do test");
	}
	
}else {
	System.out.println("You are Lucky");
}
	}

}
