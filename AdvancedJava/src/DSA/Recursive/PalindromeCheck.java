package DSA.Recursive;

public class PalindromeCheck {

	boolean isPalindrome(String str, int start , int end) {
		if(start >= end ) return true;
		if(str.charAt(start) != str.charAt(end)) return false;
		return isPalindrome(str, start + 1, end -1);
	}
	public static void main(String[] args) {
		PalindromeCheck pc = new PalindromeCheck();
		String s = "aam";
		boolean res = pc.isPalindrome(s, 0, s.length()-1);
		  if(res) {
			  System.out.println(s + " is a palindrome.");
		  }
		  else {
			  System.out.println(s + " is a not  palindrome.");
		  }
	}

}
