package DSA.LinkedLists;

class DNode {
	int data;
	DNode next;
	
	DNode(int data){
		this.data = data;
		this.next = null;
	}
}
public class DetectCycle {

	static boolean cycleDitect(DNode head) {
		DNode slow = head , fast = head;
		
		if (head == null || head.next == null) return false;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(fast == slow) {
				return true;
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		DNode head = new DNode(1);
		head.next = new DNode(2);
		head.next.next = new DNode(3);
		head.next.next.next = new DNode(4);
		
		
		head.next.next.next = head.next;
		
		System.out.println("Has Cycle " + cycleDitect(head));
	}
}
