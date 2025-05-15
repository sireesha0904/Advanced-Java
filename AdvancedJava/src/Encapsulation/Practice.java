package Encapsulation;

class Human {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int a) {
		age=a;
	}
}
public class Practice {

	public static void main(String[] args) {
		Human obj = new Human();
		obj.setName("Modi Sireesha");
		obj.setAge(21);
		
		System.out.println(obj.getName() + " "+ obj.getAge());
	}
}
