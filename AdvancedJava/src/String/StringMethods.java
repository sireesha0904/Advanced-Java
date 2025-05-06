package String;

public class StringMethods {

	public static void main(String[] args) {
		
		String name = "sireesha";
		
		int length = name.length();
		char letter = name.charAt(6);
		int indx = name.indexOf("e");
		int last_idx = name.lastIndexOf("s");
		
//		name = name.toUpperCase();
//		name = name.toLowerCase();
//		name = name.trim();
		name = name.replace("s", "a");
		
		
		System.out.println("Length is : " + length);
		System.out.println("Letter at index 6th : " + letter);
		System.out.println("Index of letter e is : "+indx);
		System.out.println("Last Index of letter s is : "+last_idx);
		System.out.println(name);
		
	}
}
