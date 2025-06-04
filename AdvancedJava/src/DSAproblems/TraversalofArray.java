package DSAproblems;

public class TraversalofArray {

	public static void main(String[] args) {
		
		int[] arr = {3,4,1,2,6};
		int n = arr.length;
		
		//forward traversal 
		System.out.print("Forward Traversal of an Array : ");
		for(int i =0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		 // Reverse Traversal
		System.out.print("\nReverse Traversal of an Array : ");
		for(int i = n-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
