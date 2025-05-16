package Inheritance;

class Calc {
	
	public int add(int n1, int n2) {
		return n1+n2;
	}
	
	public int sub(int n1, int n2) {
		return n1 - n2;
	}
}

class AdvCal extends Calc{
	
	public int multi(int n1, int n2) {
		return n1 * n2;
	}
	
	public int div(int n1, int n2) {
		return n1/n2;
	}
	
}

class VeryAdvCal extends AdvCal {
	
	public double power(int n1, int n2) {
		return Math.pow(n1, n2);
	}
}


public class Demo {

	public static void main(String[] args) {
		
		VeryAdvCal c = new VeryAdvCal();
		
		int add = c.add(5, 7);
		int sub = c.sub(5, 3);
		int mult = c.multi(4,3);
		int div = c.div(8, 4);
		double pow = c.power(5,8);
		
		System.out.println(add + " "+ sub+ " "+ mult + " "+div + " "+ pow);
	}
}
