package Sorting;

public class QuickSortEx {

	public static void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			int pivotIdx = partition(arr, low, high);
			quickSort(arr,low, pivotIdx-1);
			quickSort(arr, pivotIdx+1, high);
			
		}
	}
	private static int partition(int[] arr, int low, int high) {
		
		int pivot = arr[high];
		int i= low - 1;
		
		for(int j = low; j<high; j++) {
			if(arr[j] < pivot) {
				i++;
				
				//swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		//final swap pivot to correct place 
		
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
	}
	public static void main(String[] args) {
		
	}
}
