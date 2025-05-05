package Basics;
import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		Random random = new Random();
		
		int num = random.nextInt(1,10);
		System.out.println("Any Random Number between 1 to 10 : "+num);
	}
}
