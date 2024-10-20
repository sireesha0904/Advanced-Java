//Example for Constructor : A constructor is a special type of method in a class that has no return type. It is called when an object is created, and it is used to initialize the object's state (i.e., its attributes).

package classesandmethods;

public class Constructor {

	String Studentname; //attributes or fields 
	int id;
	String course;
	
	//constructor (Constructor Name Must Match the Class Name:)
	public Constructor(String Studentname, int id, String course) {
		this.Studentname = Studentname;
		this.id = id;
		this.course = course;
	}
	
	//regular method 
	
	public void displayInfo() {
		System.out.println("Student name is : " + Studentname + " Id is : " + id + " Course is : " + course );
	}
	
	public static void main(String[] arg) {
		
		Constructor obj = new Constructor("Modi Sireesha", 146 , "CSE");
		obj.displayInfo();
	}
}
