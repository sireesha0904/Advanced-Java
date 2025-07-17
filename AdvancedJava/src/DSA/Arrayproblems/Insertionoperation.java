package DSA.Arrayproblems;

public class Insertionoperation {

	public static void main(String[] args) {
		int[] arr = {5,8,7,10,6};
		int pos = 2;
		int element = 15;
		int n = arr.length;
		
		int[] newArr = new int[n+1];
		
		System.out.print("Before Insertion : ");
		for(int bef : arr) {
			System.out.print(bef + " ");
		}
		
		for(int i = 0; i<pos; i++) {
			newArr[i] = arr[i];
		}
		
		newArr[pos] = element;
		
		for(int i = pos; i<n; i++) {
			newArr[i+1] = arr[i];
		}
		
		// New Array after insertion is 
		System.out.print("\nAfter insertion, element "+element + " in position - "+pos + " : ");
		for(int num : newArr) {
			System.out.print(num + " ");
		}
		
	}
}
