//When two or more classes inherits a single class, it is known as hierarchical inheritance.

package Inheritance;


class Person {
	String name;
	String address;
	
	void displayInfo() {
		System.out.println("Name : "+name +"\n" + "Address : "+address);
	}
}

class Student1 extends Person {
	String course;
	
	void displayStud() {
		System.out.println("Course is : "+course);
	}
	
}

class Teacher extends Person {
	String subj;
	
	void displayTech() {
		System.out.println("Subject is : "+subj);
	}
}

public class Institution  {

	public static void main(String[] args ) {
		
	
	}
}
