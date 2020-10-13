package overloadex;

public class OverloadEx1 {
	int x = 20;
	int y = 30;
	
	public int max() {
		return (x > y) ? x : y;
	}
	
	public int max(int x, int y) {
		return (x > y) ? x : y;
	}
	
	public int max(char x, char y) {
		return (x > y) ? x : y;
	}
	
	public static void main(String[] args) {
		OverloadEx1 ob = new OverloadEx1();
		System.out.println("MAX: " + ob.max());
		System.out.println("MAX: " + ob.max(100, 95));
		System.out.println("MAX: " + ob.max('d', 'e'));
	}
}
