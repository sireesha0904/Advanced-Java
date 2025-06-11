package DSA.Stringproblems;

class Solution {
	
	public boolean isConstruct(String ransomNote, String magazine) {
		
		int[] freq = new int[26];
		
		for(char ch : magazine.toCharArray()) {
			freq[ch - 'a']++;
		}
		
		for(char ch : ransomNote.toCharArray()) {
			freq[ch - 'a']--;
			if(freq[ch - 'a'] < 0) {
				return false;
			}
		}
		return true;
	}
}
public class RansomNoteCheck {

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.isConstruct("abc", "aaabc"));
		System.out.println(sol.isConstruct("aabc", "abbc"));
		System.out.println(sol.isConstruct("abc", "aaabc"));
		
		
	}
}
