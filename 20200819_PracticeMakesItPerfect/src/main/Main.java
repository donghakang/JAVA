package main;

public class Main {
	
	// for문 2개를 사용해서 2단 부터 9단까지 구구단을 출력하는 메소드
	static void Method1() {
		for (int i = 2; i < 10; i ++) {
			for (int j = 1; j < 10; j ++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
	}
	
	// 파라메터로 입력받은 int 형을 숫자에 해당하는 구구단을 출력하는 메소드
	static void Method2(int n) {
		System.out.println(n + "의 배수");
		for (int i = 1; i < 10; i++) {
			System.out.println(n + " X " + i + " = " + (n * i));
		}
	}
	
	// 파라매터로 입력받은 int 형 배열에 각 방에 모든 숫자에 해당하는 구구단
	static void Method3(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + "의 배수");
			for (int j = 1; j < 10; j ++) {
				System.out.println(numbers[i] + " X " + j + " = " + (numbers[i] * j));
			}
			System.out.println();
		}
	}

	// 파라매터로 받은 2개의 숫자를 더한 후 결과 값을 리턴해주는 메소드
	static int Method4(int a, int b) {
		return a + b;
	}
	
	// 파라매터로 받은 int 형 배열과 string 형의 연산 기호에 따라 배열 안에 모든 숫자를 연산을 한 수 결과 값을 리턴하는 메소드
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
			System.out.println("잘못된 캐릭터");
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
