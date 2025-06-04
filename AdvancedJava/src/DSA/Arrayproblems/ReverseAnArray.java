package DSA.Arrayproblems;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		int[] arr  = {10,20,30,40,50};
		int n = arr.length;
		
		int start = 0;
		int end = n-1;
		
		while(start >= end) {
			
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start ++;
			end --;
		}
		
		 // Output the reversed array
        System.out.print("Reversed Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
	}
}
