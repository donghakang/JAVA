package problem;

import java.util.Scanner;


class Sales {
	protected String article;
	protected int qty;
	protected int cost;
	protected static int cnt = 0;
	protected static double discount = 0;
	
	public Sales() {
		super();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("품목을 입력하시오\t: "); this.article = scan.nextLine();
		System.out.print("수량을 입력하시오\t: "); this.qty = scan.nextInt();
		System.out.print("단가를 입력하시오\t: "); this.cost = scan.nextInt();
		
		Sales.cnt += this.qty;
		
		System.out.println();
	}
}

class Test10 extends Sales {
	private int amount; 
	public void setProcess() {
		this.amount = super.qty * super.cost;
	}
	
	public void getDisplay() {
		this.setProcess();
		System.out.println(super.article + '\t' + (int)(this.amount * (1.0 - Sales.discount)) + "원");
	}
	
	public static void setDiscount(double d) {
		Sales.discount = d;
	}
}

public class Problem10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Test10[] op = new Test10[2];
		op[0] = new Test10();
		op[1] = new Test10();
		
		System.out.print("할인율을 입력하세요 : ");
		Double discount = scan.nextDouble();
		Test10.setDiscount(discount);
		
		System.out.println("\n[[판매가]]");
		for (Test10 ob : op) {
			ob.getDisplay();
		}
		
		
		System.out.println();
		System.out.println("판매건수: " + Sales.cnt + "건");
	}
}
