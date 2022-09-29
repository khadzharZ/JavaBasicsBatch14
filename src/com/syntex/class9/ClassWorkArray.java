package com.syntex.class9;

public class ClassWorkArray {
	public static void main(String[] args) {
		
	 
	char [] grades=new char[6];
    grades[0]='A';
    grades[1]='B';
    grades[2]='C';
    grades[3]='D';
    grades[4]='E';
    grades[5]='F';
  
    System.out.println(grades[1]);

    char [] grade= {'A','B','C','D','E','F'};
    System.out.println(grade[1]);

    String [] names=new String[3];
    names[0]="Humera";
    names[1]="Khadzhar";
    names[2]="Mihan";

    System.out.println(names[1]);

    String [] name= {"Humera","Khadzhar","Mihan",};
    System.out.println(name[1]);

    String [] word= {"Java","Saturday","Day","Coding","is"};
    System.out.println(word[1]+" "+word[4]+" "+word[0]+" "+word[3]+" "+word[2]);
}
}
