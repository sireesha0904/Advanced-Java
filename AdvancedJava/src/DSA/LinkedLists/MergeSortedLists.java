package DSA.LinkedLists;
class Node {
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
	}
}



public class MergeSortedLists {

	static void printList(String name, Node list) {

		System.out.println(name + ":");
		Node curr = list;
		while(list!=null) {
			System.out.println(curr.data + "-> ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Node list1 = new Node(1);
		list1.next = new Node(3);
		list1.next.next = new Node(5);
		
		Node list2 = new Node(2);
		list2.next = new Node(4);
		list2.next.next = new Node(6);
		
		printList("List 1 ", list1);
		printList("List 2 ", list2);
	}
}
