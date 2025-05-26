package CollectionEx;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterfaceEx {

	public static void main(String[] args) {
		
		Queue<Integer> que = new LinkedList<>();
		que.add(10);
		que.add(15);
		que.offer(20); // Add Element
		
		System.out.println(que);
		
		int removed = que.remove();
		System.out.println("Removed Element : "+removed);
		System.out.println("Elements in Queue : "+que);
		
		int remove = que.poll();
		System.out.println("Removed element from current Queue : "+remove);
		System.out.println(que);
		
		que.poll();
		System.out.println(que.peek());
		
		
		Queue<Integer> prior = new PriorityQueue<>();
		prior.add(12);
		prior.add(10);
		prior.add(15);
		prior.add(14);
		
		System.out.println("Elements in a Queue : "+prior);
		System.out.println(prior.poll());
		System.out.println(prior);
		System.out.print("Head Element is : "+prior.element()); // not remove
		System.out.println("Final Priority Queue is : "+prior);
	}
}
