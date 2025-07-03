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
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		
	}
}
