package DSA.Stack;

import java.util.Arrays;
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
			map.put(stack.pop(), -1);
		}
		
		int len = nums1.length;
		int[] res = new int[len];
		for(int i=0; i<len; i++) {
			res[i] = map.get(nums1[i]);
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] nums1 = {4,1,2};
		int[] nums2 = {1,3,4,2};
		int[] res = nextGreaterElement(nums1, nums2);
		  System.out.println("Next Greater Elements: " + Arrays.toString(res));
	}
}
