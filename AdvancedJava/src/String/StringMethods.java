package String;

public class StringMethods {

	public static void main(String[] args) {
		
		String name = "Sireesha";
		
		int length = name.length();
		char letter = name.charAt(6);
		int indx = name.indexOf("e");
		
		System.out.println("Length is : " + length);
		System.out.println("Letter at index 6th : " + letter);
		System.out.println("Index of letter e is : "+indx);
		
	}
}
