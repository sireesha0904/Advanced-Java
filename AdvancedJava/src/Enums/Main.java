package Enums;

enum Status {
	Running, Pending, Failed, Success;
}
public class Main {

	public static void main(String[] args) {
		Status s = Status.Success;
		
		System.out.println(s.getClass().getSuperclass());
		System.out.println(s.toString());
		System.out.println(Status.valueOf("Running"));
		
		
		switch(s) {
		case Running:
			System.out.println("All Good");
			break;
			
		case Pending:
			System.out.println("Please wait..");
			break;
			
		case Failed:
			System.out.println("Try Again...");
			break;
			
			default:
			System.out.println("Done..");
			break;
		}
		
	}
}
