package constructorex;

import java.util.Scanner;

public class ConstructorEx4 {
	int x;
	int y;
	
	
	public ConstructorEx4() {
		Scanner scan = new Scanner(System.in);
		System.out.print("�����Է�: ");  this.x = scan.nextInt();
		System.out.print("�����Է�: ");  this.y = scan.nextInt();
 	}

	public int calc() {
		return this.x * this.y;
	}

	public void display() {
		System.out.println("�簢���� ����: " + calc());
    }
	
	
	public static void main(String[] args) {
		ConstructorEx4 ob = new ConstructorEx4();
		ob.display();
	}

}
