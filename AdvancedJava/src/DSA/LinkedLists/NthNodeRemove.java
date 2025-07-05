package DSA.LinkedLists;
class NNode {
	int data;
	NNode next;
	
	NNode(int data){
		this.data = data;
		this.next = null;
	}
}

public class NthNodeRemove {

	static NNode endNodeRemove(NNode head, int n) {
		NNode dummy = new NNode(0);
		dummy = head;
		
		NNode first = dummy;
		NNode second = dummy;
		for(int i=0; i<=n; i++) {
			first = first.next;
		}
		
		while(first != null) {
			first = first.next;
			second = second.next;
		}
		second.next = second.next.next;
		
		NNode curr = head;
		while(curr != null) {
			System.out.println(curr.data + "->");
			curr = curr.next;
		}
		System.out.println("null");
		
		
		return dummy.next;
	}
	
	public static void main(String[] args) {
		
	}
}
