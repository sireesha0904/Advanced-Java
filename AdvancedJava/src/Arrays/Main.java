package Arrays;

public class Main {

	public static void main(String[] args) {
		
		// Declaration 
		int arr[];
		
		//Allocation 
		arr = new int[5];
		
		// Initialization 
		
		arr[0] = 3;
		arr[1] = 4;
		arr[2] = 6;
		arr[3] = 9;
		arr[4] = 10;
		
		
		// Combination 
		
		String branch[] = {"CSE", "ECE", "EEE", "IT", "Civil"};
		
		// Updating value 
		arr[0]=5;
		
		//Accessing 
		System.out.println("Number at index 2 is : "+ arr[2]);
		System.out.println("Currently i am : "+ branch[0]);
		
		System.out.println("Number at index 2 is : "+ arr[0]);
	}
}
