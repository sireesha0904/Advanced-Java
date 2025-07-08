package DSA.LinkedLists;

class RoNode {
	int data;
	RoNode next;
	
	RoNode(int data){
		this.data = data;
	}
}
public class RotateLinkedList {

	static RoNode rotateList(RoNode head, int k) {
		
		int length = 1;
		RoNode tail = head;
		
		while(tail.next != null) {
			tail = tail.next;
			length++;
		}
		
		k = k%length;
		if(k==0) return head;
		
		int stepsToTail = (length - k);
		RoNode newTail = head;
		for(int i=1;i<stepsToTail; i++) {
			newTail = newTail.next;
		}
		
		RoNode newHead = newTail.next;
		newTail.next = null;
		tail.next = head;
		
		return newHead;
	}
	static void printList(RoNode head) {
		RoNode curr = head;
		while(curr != null) {
			System.out.print(curr.data + "-> ");
			curr = curr.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		
		RoNode list = new RoNode(1);
		list.next = new RoNode(2);
		list.next.next = new RoNode(3);
		list.next.next.next = new RoNode(4);
		list.next.next.next.next = new RoNode(5);
		
		System.out.println("Original List : ");
		printList(list);
		
		int k = 2;
		RoNode res  = rotateList(list,k);
		System.out.println("Rotated List : ");
		printList(res);
		
	}
}
