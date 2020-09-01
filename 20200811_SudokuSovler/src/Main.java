import java.util.Scanner;

//

public class Main {
	
	public static boolean isFull(int[][] s) {
		for (int i = 0; i < s.length; i ++) {
			for (int j = 0; j < s[0].length; j ++) {
				if (s[i][j] == 0) return false;
			}
		}
		return true;
	}
	
	public static boolean isNumeric(String str) { 
		try {  
			Double.parseDouble(str);  
			return true;
		} catch(NumberFormatException e){  
			return false;  
		}  
	}

	public static void boardFill(boolean[][][] board, int[][] main) {
		int boxX = 0;
		int boxY = 0;
		
		for (int x = 0; x < board.length; x ++) {
			for (int y = 0; y < board.length; y ++) {
				for (int z = 0; z < board.length; z ++) {
					if (main[y][z] != 0) {
						board[x][y][z] = true;
					}
					
					// 만약에 같다면 그 숫자이면 가로, 세로, 박스의 수가 다 바뀐다.
					if (main[y][z] == x + 1) {
						for (int i = 0; i < board.length; i ++) {
							board[x][i][z] = true;
							board[x][y][i] = true;
						}
						for (int i = 0; i < 3; i ++) {
							for (int j = 0; j < 3; j ++) {
								boxX = y / 3 + i;
								boxY = z / 3 + j;
								board[x][boxX][boxY] = true;
							}
						}
					}
				}
			}
		}
	}
	
	
	
	public static void sudokuFill(boolean[][][] board, int[][] main) {
		
		// 넣을 수 있는 자리가 있는지 확인한다.
		boolean isValid1 = true;
		boolean isValid2 = true;
		boolean isValid3 = true;
		int boxX, boxY;
		
		for (int x = 0; x < board.length; x ++) {
			for (int y = 0; y < board.length; y ++) {
				for (int z = 0; z < board.length; z ++) {
					
					if (!board[x][y][z]) {
						for (int i = 0; i < 3; i ++) {
							for (int j = 0; j < 3; j ++) {	
								boxX = y / 3 + i;
								boxY = z / 3 + j;
								if ()
								if (i != y && z != j && !board[x][boxX][boxY]) {
									isValid3 = false;
								}
							}
						}
						
					}
					
					if (isValid3) {
						main[y][z] = x + 1;
						isValid3 = true;
					}
//					if (isValid1 || isValid2 || isValid3) {
//						main[y][z] = x + 1;
//						isValid1 = true;
//						isValid2 = true;
//						isValid3 = true;
//					}
				}
			}
	
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		int ROW = 9;
		int COL = 9;
		int DEPTH = 9;
		
		Scanner scan = new Scanner(System.in);
		String[][] SUDOKU = new String[ROW][COL];
		String input;
		int[][] sudoku = new int[ROW][COL];
		
		boolean[][][] board = new boolean[DEPTH][ROW][COL];

		
//		System.out.println("Welcome to Sudoku\nPut the numbers in the box\nPress '.' for empty space");
//		for (int i = 0; i < ROW; i ++) {
//			System.out.println("Row " + (i + 1) + " : ");
//			for (int j = 0; j < COL; j ++) {
//				input = scan.nextLine();
//				SUDOKU[i][j] = input;
//			}
//		}
//		
//		for (int i = 0; i < ROW; i ++) {
//			for (int j = 0; j < COL; j ++) {
//				if (isNumeric(SUDOKU[i][j])) 	sudoku[i][j] = Integer.parseInt(SUDOKU[i][j]);
//				else 							sudoku[i][j] = 0;
//			}
//		}
//		
		
		sudoku[0] = new int[] {5, 3, 0, 0, 7, 0, 0, 0, 0};
		sudoku[1] = new int[] {6, 0, 0, 1, 9, 5, 0, 0, 0};
		sudoku[2] = new int[] {0, 9, 8, 0, 0, 0, 0, 6, 0};
		sudoku[3] = new int[] {8, 0, 0, 0, 6, 0, 0, 0, 3};
		sudoku[4] = new int[] {4, 0, 0, 8, 0, 3, 0, 0, 1};
		sudoku[5] = new int[] {7, 0, 0, 0, 2, 0, 0, 0, 6};
		sudoku[6] = new int[] {0, 6, 0, 0, 0, 0, 2, 8, 0};
		sudoku[7] = new int[] {0, 0, 0, 4, 1, 9, 0, 0, 5};
		sudoku[8] = new int[] {0, 0, 0, 0, 8, 0, 0, 7, 9};
		
		for (int i = 0; i < ROW; i ++) {
			System.out.println();
			for (int j = 0; j < COL; j ++) {
				System.out.print(sudoku[i][j] + "  ");
			}
		}
		
		System.out.println('\n');
		while (!isFull(sudoku)) {
			boardFill(board, sudoku);
			sudokuFill(board, sudoku);
			break;
		}
		
		for (int i = 0; i < ROW; i ++) {
			System.out.println();
			for (int j = 0; j < COL; j ++) {
				System.out.print(board[0][i][j] + "  ");
			}
		}
		
		for (int i = 0; i < ROW; i ++) {
			System.out.println();
			for (int j = 0; j < COL; j ++) {
				System.out.print(sudoku[i][j] + "  ");
			}
		}
		
		scan.close();
	}
}
