package methodex;

// call by reference : �ּҸ� �����ϴ� ���
public class MethodEx6 {
	
	public static void view1() {
		System.out.println("static method");
	}
	
	public void view2() {
		System.out.println("non-static method");

	}
	
	public static void main(String[] args) {
		MethodEx6.view1();
		
		MethodEx6 ob = new MethodEx6();
		ob.view2();
	}
}
