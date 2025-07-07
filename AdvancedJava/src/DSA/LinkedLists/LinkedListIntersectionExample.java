package DSA.LinkedLists;

class INode {
	int data;
	INode next;
	
	INode(int data){
		this.data = data;
		this.next = null;
	}
}
public class LinkedListIntersectionExample {

	static INode intersectionNode(INode headA, INode headB) {
		INode ptrA = headA;
		INode ptrB = headB;
		
		while(ptrA != ptrB) {
			ptrA = (ptrA == null) ? headA : ptrA.next;
			ptrB = (ptrB == null) ? headB : ptrB.next;
		}
		return ptrA;
	}
	public static void main(String[] args) {
		INode common = new INode(8);
		common.next = new INode(4);
		common.next.next = new INode(5);
		
		INode headA = new INode(4);
		headA.next = new INode(1);
		headA.next.next = common;
		
		INode head
	}
}
