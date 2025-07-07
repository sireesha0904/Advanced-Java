package DSA.LinkedLists;
class MergeNode {
	int data;
	MergeNode next;
	
	MergeNode(int data){
		this.data = data;
	}
}



public class MergeSortedLists {

	static void printList(String name, MergeNode list) {

		System.out.print(name + ": ");
		MergeNode curr = list;
		while(curr!=null) {
			System.out.print(curr.data + "-> ");
			curr = curr.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		MergeNode list1 = new MergeNode(1);
		list1.next = new MergeNode(3);
		list1.next.next = new MergeNode(5);
		
		MergeNode list2 = new MergeNode(2);
		list2.next = new MergeNode(4);
		list2.next.next = new MergeNode(6);
		
		printList("List 1 ", list1);
		printList("List 2 ", list2);
	}
}
