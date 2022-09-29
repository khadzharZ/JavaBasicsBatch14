package com.syntex.class2;

public class VariableCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//1 way to create a variable
		byte b=10; //create a variable and assign value
				
				//2 way to create a variable
				int i ; // create a variable
				i=100; // assign value

				// we need to create a variable only once
				//then we can use as many times we want/ need
				
				//3rd way 
				// create a variable=declare a variable
				int num1,  num2,  num3;
				
				num1=100; //assign value or initialize variable
				num2=200; // assign the value
				num3=300;
				
				// int num1=100; error -> duplicate variable 
				System.out.println(num2);
				//? Can i change a value of a variable???
				num2=2000; //reassign the value
				
				System.out.println(num2);
				
				// 1 variable can hold only one value at one time per line
	}

}
