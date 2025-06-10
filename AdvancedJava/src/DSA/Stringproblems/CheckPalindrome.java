package DSA.Stringproblems;

class Palindrome{
	public static boolean isPalindrome(String s) {
		int left = 0; 
		int right = s.length()-1;
		while(left < right) {
			
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left ++;
			right --;
		}
		return true;
	}
}
public class CheckPalindrome {

	
	public static void main(String[] args) {
		System.out.println("Sireesha is a palindrome - "+ Palindrome.isPalindrome("Sireesha"));
		System.out.println("madam is a palindrome - "+ Palindrome.isPalindrome("madam"));
		System.out.println("racecar is a palindrome - "+ Palindrome.isPalindrome("racecar"));
		
	}
}
