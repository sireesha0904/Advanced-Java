package Encapsulation;


class StudentDetailsUsingConstructor {
	// private fields (data hiding)
	private String name;
	private int id;
	private String course;
	
	//constructor 
	public StudentDetailsUsingConstructor(String name, int id, String course) {
		this.name = name;
		this.id = id;
		this.course = course;
		
	}
	// getter and setter methods
	
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
	
	public void displayInfo() {
		System.out.println("Student name is : " + getName() + "\nStudent Id : " + getId() + "\nStudent Course : " + getCourse());
	}
}


public class Student2 {

	public static void main(String[] arg) {
		// Create a StudentDetailsUsingConstructor object using the constructor
		StudentDetailsUsingConstructor st = new StudentDetailsUsingConstructor("Modi Sireesha", 146, "CSE");
		st.displayInfo();
		
		//Updated data using setter methods
		
		st.setCourse("Software Domain");
		st.setName("Sireesha");
		
		System.out.println("Updated Name : " + st.getName());
		System.out.println("Updated Course : " + st.getCourse());
	}
}
