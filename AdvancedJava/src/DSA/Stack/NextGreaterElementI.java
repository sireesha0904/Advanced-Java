package DSA.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {
	static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<>();
		Stack<Integer> stack = new Stack<>();
		
		for(int n : nums2) {
			while(!stack.isEmpty() && n > stack.peek()) {
				map.put(stack.pop(), n);
			}
			stack.push(n);
		}
		
		while(!stack.isEmpty()) {
			
		}
	}
	
	public static void main(String[] args) {
		
	}
}
