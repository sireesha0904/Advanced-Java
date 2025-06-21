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
		
		
		//Temporary array length for both parts 
		int[] L = new int[n1]; // left length
		int[] R = new int[n2]; // right length
		
		//copy values from arr to left and right;
		for(int i=0; i<n1; i++) {
			L[i] = arr[l+i];
		}
		for(int j=0; j<n2; j++) {
			R[j] = arr[m + 1 + j];
		}
		
		// merge two temp arrays into single arr[]
		
		int i =0, j =0, k=l;
		while(i < n1 && j < n2) {
			if(L[i] < R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		// handle leftovers 
		
		while(i<n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		
		while(j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	
	public static void main(String[] args) {
		
		 int[] arr = {6, 3, 9, 5, 2};
	        mergeSort(arr, 0, arr.length - 1);

	        for (int val : arr) {
	            System.out.print(val + " ");
	        }
	}

}
