package DSA.Stringproblems;

public class Main {

	public static void main(String[] args) {
		String str = "Hello jAva";
		String str2 = new String("Hello Strings"); // stored in heap memory
		
		
		int leng = str.length();
		String substr = str.substring(1,5);
		String replace = str.replace("java", "Programming");
		
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(leng);
		System.out.println(substr);
		System.out.println(str.charAt(4));
		System.out.println(replace);
		
		
		System.out.println("\nPrint Each Character in a String");
		
		for(int i=0; i<leng; i++) {
			System.out.println(str.charAt(i));
		}
		
		
		String s = "SIREESHA";
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		System.out.println("\nReverse a String - " + sb);
		
		
		String s1 = "Hello";
		String s2 = "hello";
		
		System.out.println("\nCompare Two Strings - " + s1.equals(s2));
		System.out.println("\nCompare Two Strings - " + s1.equalsIgnoreCase(s2));
	}
}
