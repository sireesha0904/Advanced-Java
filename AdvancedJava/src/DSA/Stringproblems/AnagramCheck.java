package DSA.Stringproblems;

public class AnagramCheck {

	public static boolean isAnagram(String s, String t) {
		
		if(s.length() != t.length()) {
			return false;
		}
		
		int[] frequncy = new int[26];
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			frequncy[ch - 'a'] ++;
		}
		
		for(int i=0; i<s.length(); i++) {
			char ch = t.charAt(i);
			frequncy[ch - 'a'] --;
		}
		
		for(int count : frequncy) {
			if(count != 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		System.out.println(isAnagram("silent", "listen"));
		System.out.println(isAnagram("madam", "women"));
	}
}
