package Searching;

public class BinarySearch {

	public static int binarySearch(int arr[], int key) {
		int low =0; 
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = low + (high - low)/2;
			
			if(arr[mid] == key) {
				return mid;
			}
			else if(arr[mid]<key) {
				low = mid+1;
			}
			else {
				high = mid -1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] a = {2,4,5,9,8,10,12};
		int result = binarySearch(a,10);
		
		System.out.println("Element found at index: " + result);
		
//		if(result != -1) {
//			  System.out.println("Element found at index: " + result);
//		}
//		else 
//			  System.out.println("Element not found ");
	}
}
