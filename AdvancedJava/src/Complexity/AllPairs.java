package Complexity;

public class AllPairs {
	
	public static void pairs(int[] arr) {
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.println("(" + arr[i] + ", " + arr[j] + ")");
			}
		}
	}
	public static void main(String[] args) {
		
		
		int arr[] = {1,3,4};
		AllPairs.pairs(arr);
	}
}
