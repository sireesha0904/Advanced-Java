package Searching;

public class Occurrence {

	public static int firstOcc(int[] arr, int key) {
		int low =0;
		int high= arr.length-1;
		int first = -1;
		
		while(low<=high) {
			int mid = low+(high - low)/2;
			
			if(arr[mid]==key) {
				first = mid;
				high = mid-1;
			}
			else if(arr[mid]<key) {
				low=mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return first;
	}
	
	public static int lastOcc(int[] arr, int key) {
		int low =0;
		int high= arr.length-1;
		int last = -1;
		
		while(low<=high) {
			int mid = low+(high - low)/2;
			
			if(arr[mid]==key) {
				last = mid;
				low=mid+1;
			}
			else if(arr[mid]<key) {
				low=mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return last;
	}
	public static void main(String[] args) {
		int[] a = {2,4,10,10,10,18,20};
		int first = firstOcc(a,10);
		int last = lastOcc(a,10);
		
		System.out.println("first Occurrence of element is "+first+"Last Occurrence of element is "+last);
	}
}
