package DSA.Recursive;

public class RevArr {
void rev(int[] arr, int s, int e) {
	if(s >= e) return;
	
	int temp = arr[s];
	arr[s] = arr[e];
	arr[e] = temp;
	
	rev(arr, s+1, e-1);
}
	public static void main(String[] args) {
		RevArr r = new RevArr();
		int[] arr = {1,2,3,4,5,6};
		r.rev(arr, 0, arr.length-1);
		
		for(int n : arr) {
			System.out.print(n+" ");
		}
	}
}
