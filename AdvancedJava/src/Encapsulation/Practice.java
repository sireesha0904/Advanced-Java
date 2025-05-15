package Encapsulation;

class Human {
	
	private String name = "Sireesha";
	private int age = 21;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
}
public class Practice {

	public static void main(String[] args) {
		Human obj = new Human();
		
		System.out.println(obj.getName() + " "+ obj.getAge());
	}
}
