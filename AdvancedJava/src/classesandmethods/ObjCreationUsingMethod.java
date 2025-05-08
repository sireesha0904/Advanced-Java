package classesandmethods;

class Students{
	int id;
	String name;
	String dept;
	int age;
	
	
	public void insertData(int i, String n, String d, int a) {
		id = i;
		name = n;
		dept = d;
		age = a;
		
		}
	
	void display() {
		System.out.println("Hello " + name + " Your Id is " +id + " Department is " + dept + " and Age is : " + age);
	}
	
	}


public class ObjCreationUsingMethod {

	public static void main(String[] args) {
		Students s1 = new Students();
		Students s2 = new Students();
		
		s1.insertData(1, "Sireesha", "CSE", 21);
		s2.insertData(1, "Lilly", "CSE", 20);
		
		s1.display();
		s2.display();
	}
}
