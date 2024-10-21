//It refers to the bundling of data (fields or variables) and the methods (functions) that operate on the data into a single unit, or class. 

package Encapsulation;

class StudentDetails {
	
	private String name;  //private fields (hiding data)
	private int id;
	private String course;
	
	//getter and setter methods
	public String getName() {
		return name;	
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCourse() {
		return course;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
}


public class Student {

	public static void main(String[] args) {
		StudentDetails st = new StudentDetails(); //object
		// Using setters to assign values
		
		st.setName("Modi Sireesha");
		st.setId(146);
		st.setCourse("CSE");
		
		System.out.println("Student name is : " + st.getName() + " \nStudent id : " + st.getId() + "\nStudent Course : " + st.getCourse());
		
	}
}
