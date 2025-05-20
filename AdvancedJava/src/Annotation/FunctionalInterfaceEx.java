package Annotation;

@FunctionalInterface
interface One {
//	void show(int i); // contain only one method
//	void run();
	int add(int i, int j);
	
}

class Two implements One {
	public int add(int i, int j) {
		return i+j;
	}
	
}
public class FunctionalInterfaceEx {

	public static void main(String[] args) {
		One a = ( i, j)->  // Lambda expressions
		{
			return i+j;
		};
		
		int res = a.add(5,8);
		System.out.println(res);
	}
}
