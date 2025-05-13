package Arrays;

public class MultiDimArray {

	public static void main(String[] args) {
		
		int arr[][] = new int[3][4];
		 
		for(int i=0; i<3; i++) { // Outer Loop
			for(int j = 0; j<4; j++) { // Inner Loop
				System.out.println(arr[i][j]);
			}
		}
	}
}
