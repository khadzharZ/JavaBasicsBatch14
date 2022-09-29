package rapls;

public class Student {
	
	 String name;
	 int roll_no;

	public Student(String name, int roll_no) {
	
	this.name = name;
	this.roll_no = roll_no;
	}


	

	

	public static void main(String[] args) {
	Student s=new Student("John",2);
	System.out.println("Name is " +s.name+ " and roll number is "+s.roll_no);
	

	}

	}
