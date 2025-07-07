package DSA.LinkedLists;
class MergeNode {
	int data;
	MergeNode next;
	
	MergeNode(int data){
		this.data = data;
	}
}



public class MergeSortedLists {

	static MergeNode mergeTwoLists(MergeNode list1, MergeNode list2) {
		MergeNode dummy = new MergeNode(0);
		MergeNode tail = dummy;
		
		while(list1 != null && list2 != null) {
			if(list1.data < list2.data) {
				tail.next = list1;
				list1 = list1.next;
			}
			else {
				tail = tail.next;
				list2 = list2.next;
			}
		}
		return dummy.next;
	}
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
		
		MergeNode res = mergeTwoLists(list1, list2);
		System.out.println("Merge sorted two lists "+res);
	}
}
