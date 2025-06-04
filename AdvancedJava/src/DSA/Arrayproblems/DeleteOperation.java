package DSA.Arrayproblems;

class Delete {
	
	public static int[] del(int[] arr) {
	 
		int n = arr.length;
		int delElementIndex = 2;
		
		int[] newArr = new int[n-1];
		
		for(int i=0, k=0; i<n; i++) {
			
			if(i == delElementIndex) {
				continue;
			}
			newArr[k] = arr[i];
			k++;
		}
		return newArr;
	}
}
public class DeleteOperation {

	public static void main(String[] args) {
		
		int[] a = {10,20,30,40};
		int[] updatedArr = Delete.del(a);
		
		
		System.out.print("Original Array : ");
		for(int org : a) {
			System.out.print(org + " ");
		}
		
		System.out.print("\nArray after deletion: ");
		for(int num : updatedArr) {
			System.out.print(num +" ");
		}
	}
}
