package com.syntex.class10;

public class Twoarrayenhenced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] countries= {
				{"USA","Canada"},// 1 array index 0
				{"Peru","Brazil","Columbia","Ecuador"},// 2 array index 1
				{"Ethiopia","Egypt","Kenya"},
				{"Germany","Turkiye","Moldova","Ukraine"},
				{"Kazhakhstan","Afghanistan","Korea"},
		};
		for (String[] country:countries) {
			for(String c:country) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}

}
