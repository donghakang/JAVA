package homework;
/*
 * 

------------------------------------------------------------------
[����2] main()�Լ����� �޼��带 ȣ���Ͽ� ������ ���� ����Ͻÿ�

(����)
1. �Լ��� : output(10,'#'):void
2. ��¹����� for���� �̿��Ͻÿ�

<���>
# # # # # # # # # # 
------------------------------------------------------------------
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
----------------------------------------------------
[����4] �Ʒ��� ���� 12���� ������ �迭�� ����� ����Ų�� 
���ϴ� month�� �Է¹޾� �� ���� ������ ����Ͻÿ�

[����]
int []month={31,28,31,30,31,30,31,31,30,31,30,31};

--�Է�ȭ��/���ȭ��--

���ϴ� month�� �Է��Ͻÿ� : 3
3���� 31���Դϴ�.
 * 
 */


public class homework1 {

	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static int mul(int a, int b) {
		return a * b;
	}
	
	public static double div(int a, int b) {
		return (double)(a) / (double)(b);
	}
	
	public static void main(String[] args) {
		System.out.println("���ϱ�: " + sum(3,5));
		System.out.println("��  ��: " + sub(7,2));
		System.out.println("���ϱ�: " + mul(4,5));
		System.out.printf("������: %.2f", div(7,3));
	}

}
