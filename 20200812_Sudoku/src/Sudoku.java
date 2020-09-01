
public class Sudoku {
	
	static int size = 9;
	static int[][] board = new int[size][size];
	
	public static Checkboard toBoard() {
		Checkboard checkboard = new Checkboard();
		
		for (int d = 0; d < size; d ++) {
			for (int h = 0; h < size; h ++) {
				for (int w = 0; w < size; w ++) {
					if (board[h][w] == 0) {
						checkboard.board[d][h][w] = false;
					} else {
						checkboard.board[d][h][w] = true;
					}
				}
			}
		}
		
		return checkboard;
	}
	
	public static boolean isFill() {
		for (int h = 0; h < size; h ++) {
			for (int w = 0; w < size; w ++) {
				if (board[h][w] == 0) return false;
			}
		}
		return true;
	}
	
	public static int find(int number) {
		int count = 0;
		for (int i = 0; i < size; i ++) {
			for (int j = 0; j < size; j ++) {
				if (board[i][j] == number) {
					count ++;
				}
			}
		}
		return count;
	}
	
	public static int findMax() {
		int step = 1;
		int max  = 0;
		int count;
		int king = 0;
		for (int i = 1; i <= size; i++) {
			count = find(i);
			if (count > max) {
				max = count;
				king = i;
			}
		}
		return king;
	}
	
	public static int findNext() {
		int step = 1;
		int max  = 0;
		int count;
		int king = 0;
		for (int i = 1; i <= size; i++) {
			count = find(i);
			if (count > max && count != size) {
				max = count;
				king = i;
			}
		}
		return king;
	}
	
	public static void print() {
		for (int h = 0; h < size; h ++) {
			for (int w = 0; w < size; w ++) {
				System.out.print(board[h][w] + "  ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
