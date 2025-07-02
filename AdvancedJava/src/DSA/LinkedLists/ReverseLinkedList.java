	package DSA.LinkedLists;
	
	class RNode {
		int data;
		RNode next;
		RNode(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	class ReversedLinkedList{
		
		static RNode listReversed(RNode head) {
			RNode prev = null;
			RNode curr = head;
			
			while(curr != null) {
				RNode next = curr.next;
				curr.next = prev;
				
				prev = curr;
				curr = next;
			}
			return prev;
		}
		
		static void printList(RNode head) {
			RNode temp = head;
			while(temp != null) {
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println("null");
		}
		
	}
	public class ReverseLinkedList {
		
		public static void main(String[] args) {
			RNode head = new RNode(10);
			head.next = new RNode(20);
			head.next.next = new RNode(30);
			
			System.out.println("Original List : ");
			ReversedLinkedList.printList(head);
			
			
			head = ReversedLinkedList.listReversed(head);
			System.out.println("\nReversed List : ");
			ReversedLinkedList.printList(head);
		}
	}
