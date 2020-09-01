import java.util.Scanner;

/**
 *  
 *       *
 *      ***
 *     *****
 *    *******
 *   *********
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		String height;
		int W, H;
		
		System.out.print("H: ");
		height = scan.nextLine();
		H      = Integer.parseInt(height);
		W      = 2 * H - 1;
		
		for (int h = 0; h < H; h ++) {
			for (int w = 0; w < W; w ++) {
				if      (w > (H - 1) + h) System.out.print(" ");
				else if (w < (H - 1) - h) System.out.print(" ");
				else    System.out.print("*");
			}
			System.out.println();
		}
		
		scan.close();
	}
	
}
