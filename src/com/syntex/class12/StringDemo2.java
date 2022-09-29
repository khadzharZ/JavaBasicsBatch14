package com.syntex.class12;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String FirstName="Olena";
		String LastName="Dudka";
		System.out.println(FirstName +" " +LastName);
		System.out.println(FirstName.concat(" ").concat(LastName));
		String str=" ";
		/*
		 * IsEmpty () returns true if a String is empty this method will return false even if you have
		 * a space is a String variable however the isBlank method does not count the spaces 
		 */
		System.out.println(str.isEmpty());
		//System.out.println(str.isBlank());
	}

}
