package main;

public class Main {
	
	// for�� 2���� ����ؼ� 2�� ���� 9�ܱ��� �������� ����ϴ� �޼ҵ�
	static void Method1() {
		for (int i = 2; i < 10; i ++) {
			for (int j = 1; j < 10; j ++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
	}
	
	// �Ķ���ͷ� �Է¹��� int ���� ���ڿ� �ش��ϴ� �������� ����ϴ� �޼ҵ�
	static void Method2(int n) {
		System.out.println(n + "�� ���");
		for (int i = 1; i < 10; i++) {
			System.out.println(n + " X " + i + " = " + (n * i));
		}
	}
	
	// �Ķ���ͷ� �Է¹��� int �� �迭�� �� �濡 ��� ���ڿ� �ش��ϴ� ������
	static void Method3(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + "�� ���");
			for (int j = 1; j < 10; j ++) {
				System.out.println(numbers[i] + " X " + j + " = " + (numbers[i] * j));
			}
			System.out.println();
		}
	}

	// �Ķ���ͷ� ���� 2���� ���ڸ� ���� �� ��� ���� �������ִ� �޼ҵ�
	static int Method4(int a, int b) {
		return a + b;
	}
	
	// �Ķ���ͷ� ���� int �� �迭�� string ���� ���� ��ȣ�� ���� �迭 �ȿ� ��� ���ڸ� ������ �� �� ��� ���� �����ϴ� �޼ҵ�
	static Double Method5(int[] a, String ch) {
		Double returnValue = null;
		if (ch.equals("+")) {
			int value = 0;
			for (int i = 0; i < a.length; i ++) {
				value += a[i];
			}
			returnValue = new Double(value);
		} else if (ch.equals("-")) {
			int value = 0;
			for (int i = 0; i < a.length; i ++) {
				value -= a[i];
			}
			returnValue = new Double(value);
			
		} else if (ch.equals("*")) {
			int value = 1;
			for (int i = 0; i < a.length; i ++) {
				value *= a[i];
			}
			returnValue = new Double(value);
		} else if (ch.equals("/")) {
			if (a.length > 1) {
				Double value =  new Double(a[0]);
				for (int i = 1; i < a.length; i ++) {
					value /= a[i];
				}
				returnValue = value;
			}
		} else {
			System.out.println("�߸��� ĳ����");
		}
		return returnValue;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method1();
		System.out.println();
		
		Method2(3);
		int[] a = new int[] {1,6,4,3};
		System.out.println();
		
		Method3(a);
		
		System.out.println(Method4(1,6));
		System.out.println(Method5(a, "/"));

	}

}
