package DSA.Arrayproblems;

public class EvenElements {

	public static void main(String[] args) {
		
		int[] a = {5,2,7,8,3,4};
		
		System.out.print("Even Numbers are : ");
		int count = 0;
		for(int i=0; i<a.length; i++) {
			
			if(a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
				count ++;
			}
		}
		System.out.println("\nTotal Even Numbers: " + count);
	}
}
