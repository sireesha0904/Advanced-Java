package classesandmethods;

class Employee {
	int id;
	String name;
	static String company = "TCS";
	
	
	Employee(int i, String n){
		this.id=i;
		this.name=n;
	}
	
	public void display() {
		System.out.println(id + " "+ name);
	}
	
	public static void comp() {
		System.out.println("Company name : "+company);
	}
}
public class StaticMethodExample {

	public static void main(String[] args) {
		Employee.comp();
		
		Employee e1 = new Employee(1, "Sireesha");
		Employee e2 = new Employee(1, "Gayatri");
		Employee e3 = new Employee(1, "Kishore");
		
		e1.display();
		e2.display();
		e3.display();
	}
}
