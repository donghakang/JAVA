package methodex;

// call by value: 값을 전달 
public class MethodEx3 {
	
	public static void show(int a, char b, double c, float d) {
		System.out.println(a + ", " + b + ", " + c + ", " + d);
	}
	
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	public static double avg(int a, int b, int c) {
		return sum(a, b , c) / 3.0;
	}
	
	public static String show4(int a, int b, int c) {
		double avg = avg(a,  b, c);
		if (avg >= 60) {
			return "합격";
		} else {
			return "불합격";
		}
	}
	
	public static void main(String[] args) {
		show(10, 'A', 10.4, 100.3f);
		int sum = sum(95, 85, 73);
		double avg = avg(95, 85, 73);
		System.out.println("합계:" + sum);
		System.out.printf("평균:%10.2f\n", avg);
		System.out.printf("평균:%-10.2f\n", avg);
		System.out.println("결과:" + show4(95,85,73));
	}		
	
}
