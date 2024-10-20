//Inheritance allows a class (called the child or subclass) to inherit properties and methods from another class (called the parent or superclass). This promotes code reuse and establishes a relationship between classes.
package Inheritence;

//parent class
class College {
	String Collegename;
	int Studentid;
	String Address;
	
	public void MyCollege() {
		System.out.println("This is my College...");
	}
}
//child class ()
class Student extends College{
	String course;
	public void displayinfo() {
		System.out.println("College name : " + Collegename + " \nStudent id : " + Studentid + " \nStudent Address : " + Address + " \nCourse : " + course);
	}
}

//Main Class
public class MainInheritnece {

	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.Collegename = "CUTM";
		obj.Studentid = 146;
		obj.Address = "Paralakhemundi";
		obj.course = "CSE";
		
		obj.displayinfo();
		obj.MyCollege();
	}
}
