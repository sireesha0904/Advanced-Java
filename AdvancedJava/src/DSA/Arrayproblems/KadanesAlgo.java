package DSA.Arrayproblems;

public class KadanesAlgo {

	public static void main(String[] args) {
		int[] arr = {2,-1,3,-2,4};
		int n = arr.length;
		
		int maxSum = Integer.MIN_VALUE;
		int countSum = 0;
		
		for(int i=0; i<n; i++) {
			countSum += arr[i];
			
			if(countSum > maxSum) {
				maxSum = countSum;
			}
			
			if(countSum <0) {
			countSum = 0;	
			}
		}
		System.out.println("Maximum Sum of Sub Array is : " + maxSum);

	}
}
