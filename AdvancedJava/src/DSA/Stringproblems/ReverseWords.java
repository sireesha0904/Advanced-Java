package DSA.Stringproblems;

public class ReverseWords {
public static String reversWords(String s) {
	
	String[] words =s.trim().split("\\s+");
	int start = 0, end = words.length-1;
	
	while(start < end) {
		String temp = words[start];
		words[start] = words[end];
		words[end] = temp;
		
		start++;
		end --;
	}
	
	return String.join(" ", words);
}
	
	public static void main(String[] args) {
		String input = " i love coding ";
		System.out.println(reversWords(input));
	}
}
