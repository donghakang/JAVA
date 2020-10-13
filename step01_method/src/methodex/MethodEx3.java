package methodex;

// call by value: ���� ���� 
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
			return "�հ�";
		} else {
			return "���հ�";
		}
	}
	
	public static void main(String[] args) {
		show(10, 'A', 10.4, 100.3f);
		int sum = sum(95, 85, 73);
		double avg = avg(95, 85, 73);
		System.out.println("�հ�:" + sum);
		System.out.printf("���:%10.2f\n", avg);
		System.out.printf("���:%-10.2f\n", avg);
		System.out.println("���:" + show4(95,85,73));
	}		
	
}
