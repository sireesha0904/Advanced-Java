package Sorting;

public class MergeSort {

	static void mergeSort(int[] arr, int l, int r) {
		
		if(l<r) {
			int m = l + (r - l)/2;
			
			mergeSort(arr, l, m);		
			mergeSort(arr, m + 1, r);
			
			merge(arr, l, m, r);
			}
	}
	
	static void merge(int[] arr, int l, int m, int r) {
		
		int n1 = m - l + 1;  // length of left sub array
		int n2 = r - m; // length of right sub array 
		
		
		//Temporary 
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for(int i=0; i<n1; i++) {
			L[i] = arr[l+i];
		}
		for(int j=0; j<n2; j++) {
			R[j] = arr[m + 1 + j];
		}
		
	}
	
	public static void main(String[] args) {
		

	}

}
