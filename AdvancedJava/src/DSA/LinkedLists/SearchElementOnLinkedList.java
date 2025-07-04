package DSA.LinkedLists;
class SNode {
	int data;
	SNode next;
	
	SNode(int data){
		this.data = data;
		this.next = null;
	}
}
public class SearchElementOnLinkedList {

	static int searchElement(SNode head, int target) {
		SNode current = head;
		int index = 0;
		
		while(current != null) {
			if(current.data == target) {
				return index;
			}
			current = current.next;
			index++;
		}
		return -1;
	}
	  static void printList(SNode head) {
	        SNode current = head;
	        while (current != null) {
	            System.out.print(current.data + " → ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }
	public static void main(String[] args) {
		SNode head = new SNode(10);
		
		head.next = new SNode(20);
		head.next.next = new SNode(30);
		head.next.next.next = new SNode(40);
		
		printList(head);
		
		int target = 30;
		int result = searchElement(head, target);
		if(result != -1) {
			 System.out.println("Element " + target + " found at index: " + result);
		}
		else
            System.out.println("Element " + target + " not found in list.");
	}
}
