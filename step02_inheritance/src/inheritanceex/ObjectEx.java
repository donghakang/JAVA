package inheritanceex;

class Test extends Object {
	public String str = "HELLO";
	
	public Test() {
		super();
	}
	
	public void view() {
		System.out.println(this.str.toString());
	}
}

public class ObjectEx {
	public static void main(String[] args) {
		Test ob = new Test();
		ob.view();
	}
}
