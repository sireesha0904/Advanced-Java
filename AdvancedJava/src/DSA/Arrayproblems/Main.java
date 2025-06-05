package DSA.Arrayproblems;

public class Main {

	public static void main(String[] args) {
		int[] arr = {10,20,40,50};
		int n = arr.length;
		int pos = 2;
		int element = 30;
		
		int[] newArr = new int[n+1];
		
		
		for(int i=0; i<pos; i++) {
			newArr[i] = arr[i];
		}
		
		newArr[pos] = element;
		
		for(int i = pos; i<n; i++) {
			newArr[i+1] = arr[i];
		}
		
		for(int num : newArr) {
			System.out.print(num + " ");
		}
	}
}
