package com.syntex.class10;

public class Example {

	public static void main(String[] args) {
		String[] week = {"Monday","Sunday","Tuesday","Thursday","Friday"};
		//if day is sunday -. it is fun day
		// otherwise-. it is a boring day
		for(String day:week) {
		if(day.equals("Sunday")) {
		System.out.println(day+" is a fun day");
		}else{
		System.out.println(day+" is a boring day");
		}
		}
		}
}


