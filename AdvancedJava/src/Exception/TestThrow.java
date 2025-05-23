package Exception;

public class TestThrow {
	public static void main(String[] args) {
		int age = 25;

		try {
			if (age < 18) {
				System.out.println("Minor... Below 18");
			} else {
				throw new ArithmeticException("Exception Message");
			}

			
		} catch (ArithmeticException e) {
			System.out.println("Caught Exception: " + e.getMessage());
		}
	}
}

