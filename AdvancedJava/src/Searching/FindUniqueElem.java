package Searching;

public class FindUniqueElem {

	 int uniqueEle(int[] arr) {
		
		int low =0; int high = arr.length - 1;
		while(low < high) {
			int mid = low + (high - low)/2;
			
			if(mid % 2 == 1) mid --;
			
			if(arr[mid] == arr[mid+1]) {
				low = mid + 2;
			}
			else {
				high = mid;
			}
		}
		return arr[low];
	}
	public static void main(String[] args) {
		FindUniqueElem uni = new FindUniqueElem();
		int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5};
	
		int result = uni.uniqueEle(arr);
		System.out.println("Unique element from array is "+result);
	}
}

