package Sorting;

import java.util.Arrays;

public class CountingSortEx {

	static void countingSort(int[] arr) {
		
		//1 Initialization
	int max = Arrays.stream(arr).max().getAsInt();
	int[] output	 = new int[arr.length];
	int[] count = new int[max + 1];
	
	// 2 count frequency 
	for(int num : arr) {
		count[num]++;
	}
	
	// 3 prefix sum 
	for(int i = 1; i< count.length; i++) {
		count[i] += count[i - 1];
	}
	
	// 4 build the output[] 
	for(int i = arr.length; i>=0; i--) {
		int pos = count[arr[i]] - 1;
		output[pos] = arr[i];
		count[arr[i]]--;
	}
	
	// copy out[] back to arr
	for(int i =0; i<arr.length; i++) {
		arr[i] = output[i];
	}
	}

	public static void main(String[] args) {
		int[] a = {4,2,2,8,3,3,1};
		countingSort(a);
		System.out.println("Sorted array : ");
		for(int arr : a) {
			System.out.println(arr+" ");
		}
	}
}
