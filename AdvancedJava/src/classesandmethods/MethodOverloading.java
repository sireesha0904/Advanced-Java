package classesandmethods;

class Calcu {
	
	public int add(int a, int b) {
		return a+b;
	}
	public double add(double c, double d) {
		return c +d;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		Calcu obj = new Calcu();
		int r1 = obj.add(5,6);
		double r2 = obj.add(2.5, 5.2);
		
		System.out.println("Addition of two integer numbers : "+r1);
		System.out.println("Addition of two Float numbers : "+r2);
		
	}
}
