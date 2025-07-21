package DSA.Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

	static void rev(Queue<Integer> que) {
		Stack<Integer> stack = new Stack<>();
		while(!que.isEmpty()) {
			stack.push(que.remove());
		}
		while(!stack.isEmpty()) {
			que.add(stack.pop());
		}
	}
	
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		System.out.println("Original Queue : " + q);
		rev(q);
		System.out.println("Reversed Queue : " + q);
	}
}
