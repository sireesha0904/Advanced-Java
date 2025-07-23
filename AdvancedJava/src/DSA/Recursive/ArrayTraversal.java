package DSA.Recursive;

public class ArrayTraversal {

void printArr(int[] arr, int i) {
	if(i == arr.length) return;
	System.out.print(arr[i] + " ");
	printArr(arr, i+1);
}
	public static void main(String[] args) {
		ArrayTraversal a = new ArrayTraversal();
		int[] arr = {1,2,3,4,5};
		a.printArr(arr,0);
		
	}
}
