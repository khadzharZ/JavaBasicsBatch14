package com.syntex.class2;

public class HomeworkAreaAndPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a=6.4;
		double b=2.4;
		double add=(a+b);
		double sub=(a-b);
		double mult=(a*b);
		double div=(a/b); 
		System.out.println("The sum of "+a+" and "+b+" is equal to "+add);
		System.out.println("The subtruct of "+a+" and "+b+" is equal to "+sub);
		System.out.println("The multiplication of "+a+" and "+b+" is equal to "+mult);
		System.out.println("The division of "+a+" and "+b+" is equal to "+div);
		System.out.println("-------------------------------------------------------------------");
	
		double d=3.9;
		double square=(d*d);
		System.out.println("The square of the "+d+" is "+square);
		System.out.println("--------------------------------------------------------------------");
		
		int width=5;
		int height=8;
		int perimeter=(width+height)*2;
		int area=(width*height);
		
		System.out.println("The perimeter of a rectangle with width "+width+" and "+height+" is equal to "+perimeter+" and the area is "+area);

	}

}
