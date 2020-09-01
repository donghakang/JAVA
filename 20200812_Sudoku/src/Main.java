
public class Main {
	
	public static void main(String[] args) {
		
		Sudoku sudoku    = new Sudoku();
		Checkboard board = new Checkboard();
		sudoku.board[0] = new int[] {5, 3, 0, 0, 7, 0, 0, 0, 0};
		sudoku.board[1] = new int[] {6, 0, 0, 1, 9, 5, 0, 0, 0};
		sudoku.board[2] = new int[] {0, 9, 8, 0, 0, 0, 0, 6, 0};
		sudoku.board[3] = new int[] {8, 0, 0, 0, 6, 0, 0, 0, 3};
		sudoku.board[4] = new int[] {4, 0, 0, 8, 0, 3, 0, 0, 1};
		sudoku.board[5] = new int[] {7, 0, 0, 0, 2, 0, 0, 0, 6};
		sudoku.board[6] = new int[] {0, 6, 0, 0, 0, 0, 2, 8, 0};
		sudoku.board[7] = new int[] {0, 0, 0, 4, 1, 9, 0, 0, 5};
		sudoku.board[8] = new int[] {0, 0, 0, 0, 8, 0, 0, 7, 9};
		
		board = sudoku.toBoard();
		
	
		
		
		board.refresh(sudoku);
		for (int i = 0; i < 100; i ++) {
			board.fill(sudoku);
		}
	}

}
