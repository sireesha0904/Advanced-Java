package DSA.Recursive;

public class SumOfArray {

	int sum(int[] arr, int i) {
		if(i == arr.length) return 0;
		return arr[i] + sum(arr, i+1);
	}
	public static void main(String[] args) {
		SumOfArray s = new SumOfArray();
		int[] arr = {1,2,3,4};
		int res = s.sum(arr, 0);
		System.out.print(res);
	}

}
