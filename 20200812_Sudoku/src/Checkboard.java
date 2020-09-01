
public class Checkboard {
	static int size = 9;
	static boolean[][][] board = new boolean[size][size][size];
	
	public static void refresh(Sudoku sudoku) {
		for (int d = 0; d < size; d ++) {
			for (int h = 0; h < size; h ++) {
				for (int w = 0; w < size; w ++) {
					if (sudoku.board[h][w] == d + 1) {
						// 가로 바꾸기
						for (int i = 0; i < size; i ++) {
							board[d][h][i] = true;
						}
						// 세로 바꾸기
						for (int j = 0; j < size; j ++) {
							board[d][j][w] = true;
						}
						// 칸에 있는거 바꾸기
						for (int x = 0; x < 3; x ++) {
							for (int y = 0; y < 3; y ++) {
								int W = (w / 3) * 3 + y;
								int H = (h / 3) * 3 + x;
								
								board[d][H][W] = true;
							}
						}
					}
				}
			}
		}
	}
	
	
	public static void fill(Sudoku sudoku) {
		boolean isValid1 = true;
		boolean isValid2 = true;
		boolean isValid3 = true;
		
		for (int d = 0; d < size; d ++) {
			for (int h = 0; h < size; h ++) {
				for (int w = 0; w < size; w ++) {
					isValid1 = true;
					isValid2 = true;
					isValid3 = true;
					
					if (board[d][h][w] == false) {
						// 가로 확인
						for (int i = 0; i < size; i ++) {
							if (i != w) {
								if (board[d][h][i] == false) {
									isValid1 = false;
								}
							}
						}
						// 세로 확인
						for (int i = 0; i < size; i ++) {
							if (i != w) {
								if (board[d][i][w] == false) {
									isValid2 = false;
								}
							}
						}
						// 칸에 있는거 바꾸기
						for (int x = 0; x < 3; x ++) {
							for (int y = 0; y < 3; y ++) {
								int W = (w / 3) * 3 + y;
								int H = (h / 3) * 3 + x;
								if (!(W == w && H == h)) {
									if (board[d][H][W] == false) {
										isValid3 = false;
									}
								}
							}
						}
						
						if (d == 6 && h == 1 && w == 2) System.out.println(isValid1 + "  " + isValid2 + "  " + isValid3);
						if (isValid1 || isValid2 || isValid3) {
							// number goes in.
							sudoku.board[h][w] = d + 1;
							refresh(sudoku);
//							for (int i = 0; i < size; i++) {
//								board[i][h][w] = true;
//							}
//							
						}
					}
				}
			}
		}
	}
	
	
	public static void guess(int max) {
		
	}
	
	public static void print(int number) {
		for (int h = 0; h < size; h ++) {
			for (int w = 0; w < size; w ++) {
				System.out.print(board[number][h][w] + "  ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
