package methodex;

// call by reference : 주소를 전달하는 방식
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
