package DSA.Stack;

public class Stack {

	int top;
	int arr[];
	
	Stack(int size){
		arr = new int[size];
		top = -1;
	}
	
	// push operation
	void push(int x) {
		if(top == arr.length - 1) {
			System.out.println("Stack overflow, cannot add element" + x);
		}
		else {
			top++;
			arr[top] = x;
			System.out.println("Pushed : "+x);
		}
	}
	
	//pop elements 
	int pop() {
		if(top == -1) {
			System.out.println("Stack underflow, cannot remove element ");
			return -1;
		}
		else {
			int val = arr[top];
			top --;
			 System.out.println("Popped: " + val);
			 return val;
		}
	
	}
	
	//peek element 
	int peek() {
		if(top == -1) {
			System.out.println("Stack is empty.");
        return -1;
	}
        
		else {
			return arr[top];
		}
		
	}
	
	boolean isEmpty() {
		return top == -1;
	}
	void display() {
		if(top == -1) {
			System.out.println("Stack is empty.");
		} else {
			 System.out.print("Stack elements: ");
			 for(int i=0; i<=top;i++) {
				 System.out.print(arr[i] + " ");
			 }
			 System.out.println();
		}
	}
	public static void main(String[] args) {
		Stack s = new Stack(5);
		s.push(10);
		s.push(20);
		s.push(30);
		s.display();
		
		s.pop();
		s.display();
		
		System.out.println("Top element is : "+s.peek());
		s.pop();
		s.display();
		s.pop();
		s.pop();
		s.display();
		 System.out.println("Is stack empty? " + s.isEmpty());
	}
}
