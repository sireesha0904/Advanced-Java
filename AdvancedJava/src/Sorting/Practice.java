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
		
		for(int i = 1; i<n; i++) {
			count[i] += count[i-1];
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
