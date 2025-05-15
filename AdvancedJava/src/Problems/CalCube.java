package Problems;

class Calculate {
	
	static int cube(int c) {
		return c*c*c;
	}
}
public class CalCube {

	public static void main(String[] args) {
		int res = Calculate.cube(6);
		
		System.out.println(res);
	}
}
