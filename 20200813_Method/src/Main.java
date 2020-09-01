
public class Main {										 // Class

	static void print() {
		// static  --> 정적 함수 
		// void    --> 반환값
		// print() --> 메소드 이름
		System.out.println("print");
	}
	
	
	// 구구단 
	static void Gugudan(int num) {
		for (int i = 1; i < 10; i ++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
	}
	
	// 숫자 , 사칙 연산
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
		return "안녕"; 				// 반환값
	}
	
	static String swearFilter(String s) {
		String result = s;
		result = s.replaceAll("바보", "**");
		result = s.replaceAll("병맛", "**");
		result = s.replaceAll("지랄", "**");
		
		return result;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {             // Method
		Gugudan(3);
		Calculate(4, 3, "+");
		
		int[] a = {1,2,3,4,5,6,7,7,14,321,43,51,234,5,1346,134,51,43,123,5123,5};
		System.out.println(totalScore(a));
	}

}
