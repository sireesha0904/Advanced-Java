package DSA.Stack;
import java.util.Stack;

public class ReverseString {
public static String reverse(String s) {
	Stack<Character> stack = new Stack<>();
	
	for(char ch : s.toCharArray()) {
		stack.push(ch);
	}
	
	StringBuilder rev = new StringBuilder();
	while(!stack.isEmpty()) {
		rev.append(stack.pop());
	}
	
	return rev.toString();
}
	public static void main(String[] args) {
		String s = "siri";
		System.out.println("Original String : "+s);
		System.out.println("Reverse String " + reverse(s));
	}
}

