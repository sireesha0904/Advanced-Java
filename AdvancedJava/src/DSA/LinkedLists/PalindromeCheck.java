package DSA.LinkedLists;

class PNode {
	int data;
	PNode next;
	
	PNode(int data){
		this.data = data;
		this.next = null;
	}
}
public class PalindromeCheck {

	static PNode reverse(PNode head) {
		PNode prev = null;
		PNode current = head;
		
		while(current != null) {
			PNode next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
	
	static boolean checkPalindrome(PNode head) {
		
		if(head == null || head.next == null) {
			return true;
		}
		
		
		PNode slow = head, fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		PNode secondHalf = reverse(slow);
		
		PNode firstHalf = head;
		
		while(secondHalf != null) {
			if(firstHalf.data != secondHalf.data) {
				return false;
			}
			firstHalf = firstHalf.next;
			secondHalf = secondHalf.next;
			
		}
	
		return true;
	}
	public static void main(String[] args) {
		
		PNode head = new PNode(1);
		head.next = new PNode(2);
		head.next.next = new PNode(2);
		head.next.next.next = new PNode(1);
		
		boolean res = checkPalindrome(head);
		System.out.println(res);
		
	}
}
