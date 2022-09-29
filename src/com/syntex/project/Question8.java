package com.syntex.project;

public class Question8 {

	public static void main(String[] args) {
		// 8. Write a Java Program to print the first 10 numbers of Fibonacci series.
		int totalNumbers = 10; 

        int[] fib = new int[totalNumbers];


        fib[0] = 0;
        fib[1] = 1;


        for(int i=2; i < totalNumbers; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
 
        System.out.println("Fibonacci Series to " + totalNumbers);
        for (int i = 0; i < totalNumbers; i++) {
            System.out.print(fib[i] + " ");
        }
   }


	}


