package homework;

import java.util.Scanner;
/*
[����3]���� �Է¹޾� �Լ�ȣ���Ͽ� ó���Ͻÿ�
����1)�Է¹��� ����  compute(item, qty, price):void  �Լ����� ó��
����2)����� : �ݾ� = ���� * �ܰ�

-�Է�-
ǰ�� : apple
���� : 10
�ܰ� : 1200

-���-
ǰ�� : apple
�ݾ� : 12000��
*/
public class problem3 {
	
	public static void compute(String item, int qty, int price) {
		System.out.println("ǰ��: " + item);
		System.out.println("�ݾ�: " + (qty * price));
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ǰ��: ");
		String item = scan.nextLine();
		System.out.print("����: ");
		int qty = Integer.parseInt(scan.nextLine());
		System.out.print("�ܰ�: ");
		int price = Integer.parseInt(scan.nextLine());
		
		compute(item, qty, price);
	}
}
