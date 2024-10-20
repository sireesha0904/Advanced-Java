//static vs public
package classesandmethods;

public class Main {

	static void Mystatic() {
		System.out.println("This is a Static.."); //static method
	}
	
	public void Mypublic() {
		System.out.println("This is a Public..."); //public method
	}
	
	public static void main(String[] args) {
		Mystatic(); //call the static method
		
		Main obj = new Main(); // object for main 
		obj.Mypublic(); // call the public method 
	}
}
