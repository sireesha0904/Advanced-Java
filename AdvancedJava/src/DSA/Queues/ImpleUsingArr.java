package DSA.Queues;

public class ImpleUsingArr {

	int size;
	int[] queue;
	int rear = -1, front = -1;
	
	ImpleUsingArr(int size){
		this.size = size;
		queue= new int[size];
	}
	
	public void enqueue(int val) {
		if((rear + 1) % size == front) {
			System.out.print("Queue is Full");
			return;
		}
		if( front == -1 && rear == -1) {
			front = rear = 0;
		}
		else {
		rear = (rear + 1)	% size;
		}
		queue[rear] = val;
		System.out.println("Enqueue "+ val);
	}
	
	void display() {
		System.out.println("Queue Elements : ");
		int i = front;
		while(true) {
			System.out.print(queue[i]+" ");
			
			if(i == rear) {
				break;
			}
			i = (i+1)%size;
		}
	}
	public static void main(String[] args) {
		ImpleUsingArr q = new ImpleUsingArr(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.display();
	}
}
