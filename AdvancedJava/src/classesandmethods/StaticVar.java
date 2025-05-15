package classesandmethods;

class Student {
	int id;
	String name;
	static String college = "Centurion";
	
	Student(int i, String n){
		this.id =i;
		this.name = n;
	}
	
	public void display() {
		System.out.println(id + " "+ name + " "+ college);
	}
	
}
public class StaticVar {

	public static void main(String[] args) {
		
		Student.college = "CUTM";
		
		Student s1 = new Student(1, "Sireesha");
		Student s2 = new Student(2, "Modi");
		
		s1.display();
		s2.display();
		
		
	}
}
