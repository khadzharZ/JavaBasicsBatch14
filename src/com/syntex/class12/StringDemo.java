package com.syntex.class12;

public class StringDemo {

	public static void main(String[] args) {
		// Proper way of creating an object
		String str=new String("Java");
		//Simpler and shorter way provided by Java creators to make out life a little easier
		String name="Asma Alfadhli The Great";	// only works for string and wrapper classes
/*
 * Counts the number of characters in a string including the space
 */
		System.out.println(str.length());
		System.out.println(name.length());
		if(name.length()>15) {
			System.out.println("Name cant be more than 15 characters ");
		}
		
		
	}

}
 