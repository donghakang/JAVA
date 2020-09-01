
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		System.out.println(num);	 			// 10
		
		a(num);									// 11
		System.out.println(num);				// 10
		
		
		int[] num1 = { 10 };
		System.out.println(num1[0]);			// 10
		b(num1);								// 11
		System.out.println(num1[0]);
		
		
		
		String str = "aa"; 			// primitive type
		String str2 = str;
		str2 = "bb";
		
		System.out.println(str);
		
		int a = 10;
		int b = a;
		b = 27;
		
		System.out.println(a);
	}

	
	static void a(int num) {
		num += 1;
		System.out.println(num);				// 11
	}
	
	static void b(int[] num1) {
		num1[0]++;
		System.out.println(num1[0]);
	}
}
