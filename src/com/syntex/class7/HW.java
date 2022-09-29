package com.syntex.class7;

import java.util.Scanner;

public class HW {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    System.out.println("Please enter your country");
    String country= input .nextLine();
    String language;

    switch(country) {
    case "Turkey":
        language="Turkish";
        break;

    case "Russia":
        language="Russian";
        break;

    case "USA":
        language="English";
        break;

    case "Azerbaijan":
        language="Azerbaijani";
        break;
    default:
        language="Invalid";
        break;

    }
    System.out.println(" your are from " + country + " and your native language is "+ language);

}


}

