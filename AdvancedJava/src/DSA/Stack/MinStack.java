package DSA.Stack;
import java.util.Stack;
public class MinStack {

	static Stack<Integer> mainStack = new Stack<>();
	static Stack<Integer> minStack = new Stack<>();
	
	public static void push(int x) {
		mainStack.push(x);
		if(minStack.isEmpty() || x <= minStack.peek()) {
			minStack.push(x);
		}
		else {
			minStack.push(Math.min(x, minStack.peek()));
		}
	}
	
	public static void pop() {
		 if (!mainStack.isEmpty()) {
	            mainStack.pop();
	            minStack.pop();
	        }
		
	}
	
	public static int getTop() {
		if(!minStack.isEmpty()) {
			return minStack.peek();
		}
		return -1;
	}
	
	public static  int getMin() {
		if(!minStack.isEmpty()) {
			minStack.peek();
		}
		return -1;
	}
	public static void main(String[] args) {
		push(4);
		push(2);
		push(5);
		push(1);
		
		System.out.println("Current Min: " + getMin());
		pop();
		   System.out.println("Current Min after pop: " + getMin());
	        System.out.println("Top Element: " + getTop()); 
	}
}
