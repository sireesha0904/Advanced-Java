package Arrays;

public class ArraySum {

	public static void main(String[] args) {
		
		int nums[] = {3,13,12,15,16,7};
		
		int sum =0;
		
		for(int num : nums) {
			sum+=num;
		}
		System.out.println("Addition of total "+sum);
	}
}
