package Sorting;

public class Practice {
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			for(int j =0; j < n-i-1; j++) {
				
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {5,2,4,3,7,9,0};
		bubbleSort(arr);
		System.out.print("Sorted Array - ");
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}
}
