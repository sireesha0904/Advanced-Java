package DSA.Stringproblems;

public class CountVowels {

	public static void main(String[] args) {
		String str = "Hello World";
		int vowels = 0, consonants  = 0;
		str = str.toLowerCase();
		
		for(int i =0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(Character.isLetter(ch)) {
				if("aeiou".indexOf(ch) != -1) {
					vowels++;
				} else {
					consonants ++;
				}
			}
		}
		System.out.println("Vowels: " + vowels + ", Consonants: " + consonants );
		
	}
}
