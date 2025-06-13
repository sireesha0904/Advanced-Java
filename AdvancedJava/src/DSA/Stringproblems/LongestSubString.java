package DSA.Stringproblems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

	public int Longestsubstring(String s) {
		Set<Character> set = new HashSet<>();
		int left =0;
		int maxLen = 0;
		
		for(int right = 0; right < s.length(); right++) {
			char ch = s.charAt(right);
			
			while(set.contains(ch)) {
				set.remove(left);
				left++;
			}
			set.add(ch);
			maxLen = Math.max(maxLen, right - left +1);
		}
		return maxLen;
	}
	public static void main(String[] args) {
		
		LongestSubString ls = new LongestSubString();
		String inp = "ababac";
		System.out.println("Maximum substring length : "+ls.Longestsubstring(inp));
		
	}
}
