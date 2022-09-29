package com.syntex.class5;

import java.util.Scanner;

public class ScannerRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
 
       
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name");
		
		// to capture values we need to use different options
		String name=input.next();// Capturing string
		
		System.out.println("How old are you "+name);
		int age=input.nextInt(); //capturing int
System.out.println(name+" is "+age+" years old");
		
		System.out.println("How much money you have "+name);
		double money =input.nextDouble();
			System.out.println(name+" has $ "+money);
		
			System.out.println((name+" what is your grage"));
			char grade=input.next().charAt(0);
			System.out.println(name+" has grade "+grade);
		System.out.println("End");
	}

}
