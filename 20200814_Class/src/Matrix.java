import java.util.Random;

//The Matrix class has methods for each of the following:
//1 - get the number of rows
//2 - get the number of columns
//3 - set the elements of the matrix at given position (i,j)
//4 - adding two matrices. If the matrices are not addable, "Matrices cannot be added" will be displayed.
//5 - multiplying the two matrices

public class Matrix {
	
	int rows;
	int columns;
	int mat[][]; 
	
	Matrix(int row, int col) {
		Random rand = new Random();
		int num;
		
		this.rows    = row;
		this.columns = col;
		this.mat = new int[col][row];
		for (int i = 0; i < col; i ++) {
			for (int j = 0; j < row; j ++) {
				num = rand.nextInt(10);
				mat[i][j] = num;
			}
		}
	}
	
	int getRow() {
		return this.rows;
	}
	int getCol() {
		return this.columns;
	}
	
	void set(int row, int col, int number) {
		this.mat[col][row] = number;
	}
	
	void print() {
		for (int i = 0; i < this.columns; i ++) {
			for (int j = 0; j < this.rows; j ++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	Matrix add(Matrix mat1, Matrix mat2) {
		if (mat1.rows != mat2.rows) {
			System.out.println("Matrices cannot be added");
			return null;
		} 
		if (mat1.columns != mat2.columns){
			System.out.println("Matrices cannot be added");
			return null;
		}
		
		Matrix mat = new Matrix(mat1.rows, mat1.columns);
		
		for (int i = 0; i < mat1.columns ; i ++) {
			for (int j = 0; j < mat2.rows; j ++) {
				mat.mat[i][j] = mat1.mat[i][j] + mat2.mat[i][j];
			}
		}
		
		return mat;
	}
	
	
}
