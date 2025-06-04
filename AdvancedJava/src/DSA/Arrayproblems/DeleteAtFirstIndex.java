package DSA.Arrayproblems;

public class DeleteAtFirstIndex {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		int n = arr.length;
		
		int[] newArr = new int[n-1];
		
		for(int i=0, k = 0; i<n; i++) {
			if(i == 0) {
				continue;
			}
			newArr[k] = arr[i];
			k++;
		}
		
		System.out.print("Afeter delete element at 1st index : ");
		for(int num : newArr) {
			
			System.out.print(num + " ");	
		}
	}
}
