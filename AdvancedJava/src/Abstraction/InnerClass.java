package Abstraction;

class A {
	void run() {
		System.out.println("This is in A class");
	}
	class B {
		
		void run() {
			System.out.println("This is in B class");
		}
	}
}
public class InnerClass {

	public static void main(String[] args) {
		
		A obj = new A();
		obj.run();
		
		A.B ob = obj.new B();
		ob.run();
		                        
	}
}
