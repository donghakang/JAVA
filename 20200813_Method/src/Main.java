
public class Main {										 // Class

	static void print() {
		// static  --> ���� �Լ� 
		// void    --> ��ȯ��
		// print() --> �޼ҵ� �̸�
		System.out.println("print");
	}
	
	
	// ������ 
	static void Gugudan(int num) {
		for (int i = 1; i < 10; i ++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
	}
	
	// ���� , ��Ģ ����
	static void Calculate(int num1, int num2, String s) {
		switch (s) {
		case "+":
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case "-":
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case "*":
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		case "/":
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			break;
		case "%":
			System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
			break;
		default:
			System.out.println("ERROR");
			break;
		}
	}
	
	static int add (int num1, int num2) {
		return num1 + num2;
	}
	
	static int totalScore (int[] numbers) {
		int count = 0;
		for (int i = 0; i < numbers.length; i ++) {
			count += numbers[i];
		}
		
		
		return count;
	}
	
	// return methods
	static String cc() {
		return "�ȳ�"; 				// ��ȯ��
	}
	
	static String swearFilter(String s) {
		String result = s;
		result = s.replaceAll("�ٺ�", "**");
		result = s.replaceAll("����", "**");
		result = s.replaceAll("����", "**");
		
		return result;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {             // Method
		Gugudan(3);
		Calculate(4, 3, "+");
		
		int[] a = {1,2,3,4,5,6,7,7,14,321,43,51,234,5,1346,134,51,43,123,5123,5};
		System.out.println(totalScore(a));
	}

}
