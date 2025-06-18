package Searching;

public class SplitArrayLargestSum {

	static int splitArray(int[] arr, int k) {
		int low = getMax(arr);
		int high = getSum(arr);
		int result = high;
	}
	
	static int getMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int a : arr) {
			max = Math.max(a, max);
		}
		return max;
	}
	
	static int getSum(int[] arr) {
		int sum =0;
		for(int a : arr) {
			sum += a;
		}
		return sum;
	}
	public static void main(String[] args) {
		
	}
}
