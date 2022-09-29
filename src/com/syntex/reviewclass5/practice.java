package com.syntex.reviewclass5;

import java.lang.reflect.Array;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     double a[] = { 1.0, 2.0, 3.0 };
	     
	        // Traversing the array
	        for (int i = 0; i < 3; i++) {
	  
	            // Array.getDouble() method
	  
	            double x = Array.getDouble(a, i);
	            // Printing the values
	            System.out.print(x + " ");
	        }
	    }
	
	}


