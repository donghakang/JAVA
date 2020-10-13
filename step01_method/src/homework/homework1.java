package homework;
/*
 * 

------------------------------------------------------------------
[문제2] main()함수에서 메서드를 호출하여 다음과 같이 출력하시오

(조건)
1. 함수명 : output(10,'#'):void
2. 출력문에서 for문을 이용하시오

<결과>
# # # # # # # # # # 
------------------------------------------------------------------
[문제3]값을 입력받아 함수호출하여 처리하시오
조건1)입력받은 값을  compute(item, qty, price):void  함수에서 처리
조건2)계산방법 : 금액 = 수량 * 단가

-입력-
품명 : apple
수량 : 10
단가 : 1200

-출력-
품명 : apple
금액 : 12000원
----------------------------------------------------
[문제4] 아래와 같이 12달의 날수를 배열를 만들어 기억시킨후 
원하는 month을 입력받아 그 달의 날수를 출력하시오

[참고]
int []month={31,28,31,30,31,30,31,31,30,31,30,31};

--입력화면/출력화면--

원하는 month을 입력하시오 : 3
3월은 31일입니다.
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
		System.out.println("더하기: " + sum(3,5));
		System.out.println("빼  기: " + sub(7,2));
		System.out.println("곰하기: " + mul(4,5));
		System.out.printf("나누기: %.2f", div(7,3));
	}

}
