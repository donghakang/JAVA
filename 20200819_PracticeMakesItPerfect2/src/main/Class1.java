package main;

public class Class1 {
	int num1;
	int num2;
	String ch;
	
	public Class1() {
		this.num1 = 0;
		this.num2 = 0;
		this.ch = "";
	}
	
	public Class1(int num1, int num2, String ch) {
		this.num1 = num1;
		this.num2 = num2;
		this.ch = ch;
	}
	
	public int operate() {
		if (this.ch.equals("+")) {
			return this.num1 + this.num2;
		} else if (this.ch.equals("-")) {
			return this.num1 - this.num2;
		} else if (this.ch.equals("*")) {
			return this.num1 * this.num2;
		} else if (this.ch.equals("/")) {
			return this.num1 / this.num2;
		} else {
			return -1;
		}
	}
}
