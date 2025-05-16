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
	
		Person p = new Person();
		p.name = "Modi Sireesha";
		p.address = "Uppalada";
		
		p.displayInfo();
		
		Student1 s = new Student1();
		s.course = "Computer Science Engineering ";
		
		s.displayStud();
		
		System.out.println();
		
		Teacher t = new Teacher();
		t.subj = "Mathmatices";
		p.name = "Likhee";
		p.address = "Vizag";
		p.displayInfo();
		t.displayTech();
		
	
	}
}
