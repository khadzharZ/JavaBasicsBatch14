package com.syntex.class5;

public class Task2 {

	public static void main(String[] args) { 
		
//2. Write a program that will print whether it is a weekend or weekday. If any day from 1-5 → 
		//output “It is a weekday”, anyday from 6-7 → output “It is a weekend”, any other day
		//→ output “Invalid day”
		int day;
		day=3;
		if(day>=1 && day<5) {
			System.out.println("Its a week day");
			
		}else if (day==6 || day==7) {
	System.out.println("Its a weekend");
		}else {
			System.out.println("Invalid day ");
		}
	}

}
