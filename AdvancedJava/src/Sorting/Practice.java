package Sorting;

import java.util.Arrays;

public class Practice {
	static void countingSort(int[] arr) {
		int n = arr.length;
		int max = Arrays.stream(arr).max().getAsInt();
		
		int count[] = new int[max + 1];
		int output[] = new int[n];
		
		for(int a : arr) {
			count[a]++;
		}
		
		for(int i = 1; i<count.length; i++) {
			count[i] += count[i-1];
		}
		
		for(int i = arr.length - 1; i>=0; i--) {
			int pos = count[arr[i]]-1;
			output[pos] = arr[i];
			count[arr[i]]--;
		}
		
		for(int i =0; i<n; i++) {
			arr[i] = output[i];
		}
	}

	public static void main(String[] args) {
		int[] arr = {5,5,2,2,2,4,3,3,7,7,9,0};
		countingSort(arr);
		System.out.print("Sorted Array - ");
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}
}
