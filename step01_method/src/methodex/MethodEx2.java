package methodex;

public class MethodEx2 {
	public static void main(String[] args) {
		int a = view1();
		char b = view2();
		float c = view3();
		boolean d = view4();
		String e = view5();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		view6();
	}
	
	public static int view1() {
		return 1;
	}
	
	public static char view2() {
		return 'c';
	}
	
	public static float view3() {
		return 3.f;
	}
	
	public static boolean view4() {
		return true;
	}
	
	public static String view5() {
		return "Hello~";
	}
	
	public static void view6() {
		System.out.println("±Â¸ð´×");
	}
}
