package com.syntex.class8;

public class nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1; i<3; i++) {
	System.out.println("Hello"); //outer loop controls inner loop 
	for(int j=1; j>=3; j++) {
		System.out.println("Bye");// inner loop depends on outer loop
	}
}
System.out.println("-----------------------");
for(int i=0; i<=2; i++) {
	for(int j=1; j<4; j++) {
		System.out.println(i+" "+j);
	}
}
	}

}
