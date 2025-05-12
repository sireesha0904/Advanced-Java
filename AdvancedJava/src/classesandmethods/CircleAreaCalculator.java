package classesandmethods;

class Circle{
	
	public static double CircleArea(double radius) {
		double area = Math.PI * radius * radius;
		return area;
	}
}
public class CircleAreaCalculator {

	public static void main(String[] args) {
		double res = Circle.CircleArea(5.5);
		
		System.out.println("Area of Circle is : "+res);
	}
}
