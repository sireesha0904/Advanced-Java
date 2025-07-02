package DSA.LinkedLists;

class Node {
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

class ReversedLinkedList{
	static Node listReversed(Node head) {
		Node prev = null;
		Node curr = head;
		
		while(curr != head) {
			Node next = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = next;
		}
		return prev;
	}
	
	static void printList(Node head) {
		Node temp = head;
		while(temp != head) {
			System.out.print(temp.data + "->");
		}
		System.out.println("null");
	}
	
}
public class ReverseLinkedList {
	
	public static void main(String[] args) {
		
	}
}
