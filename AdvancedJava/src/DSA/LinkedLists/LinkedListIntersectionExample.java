package DSA.LinkedLists;

class IINodee {
	int data;
	IINodee next;
	
	IINodee(int data){
		this.data = data;
		this.next = null;
	}
}
public class LinkedListIntersectionExample {

	static IINodee intersectionNode(IINodee headA, IINodee headB) {
		IINodee ptrA = headA;
		IINodee ptrB = headB;
		
		while(ptrA != ptrB) {
			ptrA = (ptrA == null) ? headA : ptrA.next;
			ptrB = (ptrB == null) ? headB : ptrB.next;
		}
		return ptrA;
	}
	
	static void printList(String name , IINodee head) {
		System.out.print(name + " : ");
		IINodee curr = head;
		while(curr != null) {
			System.out.print(curr.data + "-> ");
			curr = curr.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		IINodee common = new IINodee(8);
		common.next = new IINodee(4);
		common.next.next = new IINodee(5);
		
		IINodee headA = new IINodee(4);
		headA.next = new IINodee(1);
		headA.next.next = common;
		
		IINodee headB = new IINodee(5);
		headB.next = new IINodee(6);
		headB.next.next = new IINodee(1);
		headB.next.next.next = common;
		
		printList("List A ", headA);
		printList("List B :" , headB);
		
		IINodee res = intersectionNode(headA, headB);
		if(res != null) {
			 System.out.println("Intersection at node: " + res.data);
		}
		else {
			 System.out.println(" No Intersection at node: ");
		}
	}
}
