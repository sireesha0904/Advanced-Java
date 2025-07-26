package DSA.Backtracking;

public class Sudoku4x4 {

	public static void main(String[] args) {
		 int[][] board = {
		            {1, 2, 0, 4},
		            {0, 0, 3, 0},
		            {0, 3, 0, 0},
		            {2, 0, 0, 1}
		        };

		        Sudoku4x4 solver = new Sudoku4x4();

		        if (solver.solve(board)) {
		            solver.printBoard(board);
		        } else {
		            System.out.println("No solution exists for this Sudoku!");
		        }
		        
		        
	}

    void printBoard(int[][] board) {
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
    }

	private boolean solve(int[][] board) {
		int n = board.length;
		
		for(int row = 0; row<n; row++) {
			for(int col = 0; col <n; col++) {
				if(board[row][col] == 0) {
					for(int num = 1; num<=n; num++) {
						if(isvalid(board,row,col,num)) {
							board[row][col] = num;
							if(solve(board)) return true; //recursion
							board[row][col] = 0; // backtrack
						}
					}
				}
			}
		}
		return true;
	}
}
