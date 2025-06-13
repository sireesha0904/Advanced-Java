package DSA.Arrayproblems;

public class MaxSumSubArray {

	public static int max(int[] arr,int k) {
	int windowSlide =0, maxSum = 0;
	
	for(int i=0; i < k; i++) {
		windowSlide += arr[i];
	}
	maxSum = windowSlide;
	
	for(int i=k; i<arr.length; i++) {
		windowSlide += arr[i];
		windowSlide -= arr[i-k];
		maxSum = Math.max(maxSum, windowSlide);
	}
	return maxSum;
	}
	
	public static void main(String[] args) {

		int[] inp = {2,1,3,4};
		System.out.println("Max sum of sub array elements with length 2 : "+max(inp, 2));
		
	}

}
