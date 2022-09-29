package com.syntex.class4;

import java.util.Scanner;

public class ScannerClassReplit {

	public static void main(String[] args) {
		//Write  a program that takes user's first name and last name and prints in console
//Instruct the user to enter first name: "Please Enter First Name"
////Capture the first name
//Instruct the user to enter last name:"Please Enter Last Name" 
//Capture last name
//Print first name and last name

		   Scanner scanner=new Scanner(System.in);
		    System.out.println("Please enter your first name");
		    String Firstname=scanner.nextLine();
		    System.out.println("Please enter your Last name");
       String LastName=scanner.nextLine();
       System.out.println(Firstname+" "+LastName);    
       
       
       
       
       
       
       
	}

}
