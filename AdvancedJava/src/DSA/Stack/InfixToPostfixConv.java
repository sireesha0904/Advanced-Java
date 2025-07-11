package DSA.Stack;
import java.util.Stack;
public class InfixToPostfixConv {

	static boolean isOperand(char c) {
		return Character.isLetterOrDigit(c);
	}
	
	static int precendence(char c) {
		if(c == '^') return 3;
		if(c == '*' || c == '/') return 2;
		if(c == '+' || c == '-' ) return 1;
		return -1;
	}
	
	static String infixto(String exp) {
		StringBuilder result = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		
		for(char ch : exp.toCharArray()) {
			if(isOperand(ch)) {
				result.append(ch);
			}
			else if(ch == '(') {
				stack.push(ch);
			}
			else if(ch == ')') {
				while(!stack.isEmpty() && stack.peek() != '(') {
					result.append(stack.pop());
				}
				stack.pop();
			}
			else {
				while(!stack.isEmpty() && precendence(stack.peek()) >= precendence(ch)) {
					result.append(stack.pop());
				}
				stack.push(ch);
			}
		}
		while(!stack.isEmpty()) {
		result.append(stack.pop());
		}
		return result.toString();
	}
	public static void main(String[] args) {
		
		String exp = "A+B*C";
		 System.out.println("Infix: " + exp);
	     System.out.println("Postfix: " + infixto(exp)); 
	}
}
