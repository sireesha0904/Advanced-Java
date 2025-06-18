package Searching;

public class SplitArrayLargestSum {

	static int splitArray(int[] arr, int k) {
		int low = getMax(arr);
		int high = getSum(arr);
		int result = high;
		
		while(low <= high) {
			int mid = low + (high - low)/2;
			
			if(isValidSplit(arr, k, mid)) {
				result = mid;
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		return result;
	}
	
	static boolean isValidSplit(int[] arr, int k, int target) {
		int count = 1;
		int currentSum = 0;
		
		for(int a : arr) {
			if(currentSum + a <= target) {
				currentSum += a;
			}
			else {
				count ++;
				currentSum = a;
				
				if(count > k) {
					return false;
				}
			}
		}
		return true;
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
		
		int[] array = {1,2,3,4,5};
		int k = 2;
		int result = splitArray(array, k);
		 System.out.println("Minimum Largest Subarray Sum: " + result);
	}
}
