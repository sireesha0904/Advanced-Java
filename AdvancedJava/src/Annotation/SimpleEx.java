package Annotation;

class A {
	
	public void showData() {
		System.out.println("This is in A Class...");
	}
}

class B extends A{
	@Override
//	public void showDataa() {
//		System.out.println("This is in B Class...");
//	}
	
	public void showData() {
		System.out.println("This is in B Class...");
	}
}
public class SimpleEx {

	public static void main(String[] args) {
		A obj = new B();
		obj.showData();
		
		A ob = new A();
		ob.showData();
	}
	
}
