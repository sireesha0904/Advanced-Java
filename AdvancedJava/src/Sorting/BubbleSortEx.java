package Sorting;

public class BubbleSortEx {

	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j < n-i-1; j++) {
				
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1] = temp;
				}
			}
		} 
	}
	public static void main(String[] args) {
	
		int[] a = {5,1,2,4};
		System.out.print("Original Array - ");
		for(int num : a) {
			System.out.print(num + " ");
		}
		
		bubbleSort(a);
		
		System.out.print("\nSorted Array - ");
		for(int num : a) {
			System.out.print(num + " ");
		}
		
	}
}
