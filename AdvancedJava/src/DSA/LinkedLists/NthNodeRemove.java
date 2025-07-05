package DSA.LinkedLists;
class NNode {
	int data;
	NNode next;
	
	NNode(int data){
		this.data = data;
		this.next = null;
	}
}

public class NthNodeRemove {

	static NNode endNodeRemove(NNode head, int n) {
		NNode dummy = new NNode(0);
		dummy = head;
		
		NNode first = dummy;
		NNode second = dummy;
		for(int i=0; i<=n; i++) {
			first = first.next;
		}
		
		while(first != null) {
			first = first.next;
			second = second.next;
		}
		second.next = second.next.next;

		return dummy.next;
	}
	
	static void printList(NNode head) {
	    NNode curr = head;
	    while (curr != null) {
	        System.out.print(curr.data + "->");
	        curr = curr.next;
	    }
	    System.out.println("null");
	}
	
	public static void main(String[] args) {
		NNode head = new NNode(1);
		head.next = new NNode(2);
		head.next.next = new NNode(3);
		head.next.next.next.next = new NNode(4);
		
		printList(head);
		System.out.println("Original List : ");
	}
}
