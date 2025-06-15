package Searching;

public class LinearSearch {

	public int linearSearch(int arr[], int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		LinearSearch lrs = new LinearSearch();
		int[] ar = {1, 5 ,4,6,2,7};
		System.out.println("Element 6 found at index : "+lrs.linearSearch(ar, 6));
	}
}
