package methodex;

// call by reference : �ּҸ� �����ϴ� ���
public class MethodEx5 {
	
	public static void view1(String str) {
		System.out.println(str);
	}
	
	public static void view2(int[] num) {
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}
		
		for (int i : num) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		String str = "happy";
		view1(str);
		
		int[] num = {10, 20, 30, 40, 50};
		view2(num);
	}
}
