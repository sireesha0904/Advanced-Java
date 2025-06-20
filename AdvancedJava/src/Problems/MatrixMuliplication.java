package Problems;

public class MatrixMuliplication {

	static int[][] multiply(int[][] A, int[][] B) {
		int m = A.length;
		int n = A[0].length;
		int p = B[0].length;  // m * p 
		
		int[][] result = new int[m][p];
		
		if(B.length != n) {
			throw new IllegalArgumentException("Invalid matrix dimensions for multiplication.");
		}
		
		for(int i=0; i<m ; i++) {
			for(int j=0; j<p; j++) {
				for(int k =0; k<n; k++) {
					result[i][j] += A[i][k] + B[k][j];
				}
			}
		}
		return result;
	}
	
	public static void printMatrix(int[][] matrix) {
		for(int[] row : matrix) {
			for(int val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
	
		
	}
}
