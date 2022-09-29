package com.syntax.class6;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// matching cases must of same data type as a variable
		// no duplicate case in switch
		char choice='K';
		String answer;
		
		switch (choice) {
		
		case 'Y' :
			answer="Yes";
			break;
		case 'N':
			answer="No";
		case 'M':
			answer="Maybe";
			break;
		default:
			answer="Unknown";
			break;
		}
 System.out.println(answer);
	}

}
