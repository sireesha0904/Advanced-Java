package DSA.LinkedLists;

class RoNode {
	int data;
	RoNode next;
	
	RoNode(int data){
		this.data = data;
	}
}
public class RotateLinkedList {

	static void printList(RoNode head) {
		RoNode curr = head;
		while(curr != null) {
			System.out.println(curr.data + "-> ");
			curr = curr.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		RoNode list = new RoNode(1);
		list.next = new RoNode(2);
		list.next.next = new RoNode(3);
		list.next.next.next = new RoNode(4);
		list.next.next.next.next = new RoNode(5);
		
		System.out.println("Original List : ");
		printList(list);
		
	}
}
