package DSA.Arrayproblems;

public class Prefixsum {

	public static void main(String[] args) {
		
		int[] arr = {2,4,6,12,20};
		int n = arr.length;
		int[] prefix = new int[n];
		
		prefix[0] = arr[0];
		for(int i=1;i<n;i++) {
			prefix[i] = prefix[i-1]+arr[i];
		}
		System.out.print("Prefix sum of an array : ");
		for(int pre : prefix) {
			System.out.print(pre+" ");
		}
		
		
		int l = 1, r = 3;
		int sum = prefix[r] - prefix[l-1]; // 24-2 = 22 and 4+6+12 = 12 hence proved
		 System.out.println("Range Sum [" + l + " to " + r + "] : " + sum);
	}
}
