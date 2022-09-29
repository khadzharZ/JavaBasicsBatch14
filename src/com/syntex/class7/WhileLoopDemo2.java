package com.syntex.class7;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		//print all numbers from 1 to 10

		
		int num=1;
		while(num<=10) {
			System.out.print(num);
			num++;
		}
		System.out.println("--------------");
		//print all numbers from 10-25
		int a=10;
		while (a<=25) {
			System.out.print(a+"  ");
			a++;
		}
		System.out.println("-------------");
		//print all numbers from 10-1
		int b=10;
		while(b>=1) {
			System.out.print(b);
			b--;
		}
		System.out.println("----------------");
		// print all numbers from 50 to 20
		int  h=50;
		while(h>=20) {
			System.out.print(h+" ");
			h--;
		}
		System.out.println(" ---------------------");
		//print all even numbers from 1 to 20
		int j= 1;
		while(j<=20) {
			if(j%2==0) {
			System.out.print(j);
			}
			j++;
		
	}
	

}
}
