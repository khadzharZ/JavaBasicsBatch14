package com.syntex.class4;

public class NestedCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int time=5;
		String day="Monday";
		/*
		 * it is called outer if condition if it is true then only inner condition will be checked if it is
		 * false nothing from inner if condition will be executed it is like the main door
		 * if main door is closed we cant enter the building
		 */
				
		if(day.equals("Monday")){ // as String is a non primitive we cant use==sign we have to use .equals method
		
			if(time>7) {
				
				System.out.println("Lets fo to office"); 
			}
			if(time<6) {
				System.out.println("Lets sleep more");
			}
		}
				

	}

}
