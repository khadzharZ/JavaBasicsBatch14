package com.syntex.class8;

import java.util.Scanner;

public class classTask2 {

	public static void main(String[] args) {
		// create a secret number and let user guess the secret number once the user guessed your secret number program says you won
		Scanner scanner = new Scanner(System.in);

		int secret= 1234;
		 int guess;
		     
       do{
		   System.out.println("Please guess a secret number");
		   guess=scanner.nextInt();
		   

		  
		  }while(guess!=secret);
       System.out.println("You won!");
 
		
	}

}
