package MultiThreading;

class A extends Thread{
	
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.println("Inside Class A");
		}
		
	}
}

class B extends Thread{
    public void run() {
    	for(int i=0; i<=5; i++) {
			System.out.println("Inside Class B");
		}
	}
}
public class Demo {

	public static void main(String[] args) {
		
		A t1 = new A();
		B t2 = new B();
		
		t2.setPriority(3);
		t1.setPriority(4);
		
		t1.start();
		t2.start();
		
	}
}
