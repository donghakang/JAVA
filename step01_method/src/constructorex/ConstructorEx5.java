package constructorex;

import java.util.Scanner;

/*
[����] �����ڿ��� �μ��� �Է¹޾� ū���� �������� ����Ͻÿ�
show()�޼��忡�� maxValue(), minValue()�� ȣ���Ұ�

Ŭ������ : Max
-a:int
-b:int
+Max()           <--�Է¹ޱ�
+maxValue():int  <--ū�� ����(���׿����� �̿�)
+minValue():int  <--������ ����
+show():void     <--���

[���]
Input a: 5
Input b: 3

ū�� : 5
������: 3
 */
 
class Max {
	public int a;
	public int b;
	
	public Max() {
		Scanner scan = new Scanner(System.in);
		System.out.print("a: ");  this.a = scan.nextInt();
		System.out.print("b: ");  this.b = scan.nextInt();
	}
	
	public int maxValue() {
		return (this.a > this.b) ? this.a : this.b;
	}
	
	public int minValue() {
		return (this.a < this.b) ? this.a : this.b;
	}
	
	public void show() {
		System.out.println("Input a: " + this.a);
		System.out.println("Input b: " + this.b);
		System.out.println("\nū�� : " + this.maxValue());
		System.out.println("������: " + this.minValue());
	}
}


public class ConstructorEx5 {

	public static void main(String[] args) {
		Max ob = new Max();
		ob.show();
	}

}
