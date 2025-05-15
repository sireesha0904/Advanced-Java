package classesandmethods;

class Employee {
	int id;
	String name;
	String role;
	static String company = "TCS";
	
	
	Employee(int i, String n, String r){
		this.id=i;
		this.name=n;
		this.role=r;
	}
	
	public void display() {
		System.out.println(id + " "+ name+" "+role);
	}
	
	public static void comp() {
		System.out.println("Company name : "+company);
	}
}
public class StaticMethodExample {

	public static void main(String[] args) {
		Employee.comp();
		
		Employee e1 = new Employee(1, "Sireesha", "Software Developer");
		Employee e2 = new Employee(1, "Gayatri", "Data Analysis");
		Employee e3 = new Employee(1, "Kishore", "AI");
		
		e1.display();
		e2.display();
		e3.display();
	}
}
