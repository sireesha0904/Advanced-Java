package DSA.LinkedLists;

class INode{
	int data;
	INode next;
	
	INode(int data){
		this.data = data;
		this.next = null;
	}
}
public class InsertAtBeginningExistingList {

	static INode insertNode(INode head, int value) {
		INode newNode = new INode(value);
		newNode.next = head;
		return newNode;
		
	}
	static void printList(INode head) {
		INode curr = head;
		while(curr != null) {
			System.out.print(curr.data + " -> ");
			curr = curr.next;
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		INode head = new INode(10);
		head.next = new INode(20);
		head.next.next = new INode(30);
		
		System.out.println("Original List is ");
		printList(head);
		
		head = insertNode(head, 5);
		System.out.println("\nNew List is ");
		printList(head);
	}
}
