package DSA.Stack;

class Node {
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
public class StackLL {

	Node top = null;
	
	void push(int x) {
		Node newNode = new Node(x);
		newNode.next = top;
		top = newNode;
		System.out.println("Pushed : "+x);
	}
	
	int pop() {
		if(top == null) {
			System.out.print("Stack Underflow");
			return -1;
		}
		else {
			int val = top.data;
			top = top.next;
			System.out.println("Popped : "+val);
			return val;
		}
		
	}
	void display() {
		Node temp = top;
		while(temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {
		StackLL s = new StackLL();
		
		s.push(10);
		s.push(20);
		s.display();
		
		s.pop();
		s.display();
	}
	
}
