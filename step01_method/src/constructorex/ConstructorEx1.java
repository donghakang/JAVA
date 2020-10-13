package constructorex;

public class ConstructorEx1 {

	public ConstructorEx1() {
		System.out.println("default constructor");
	}
	public ConstructorEx1(String s) {
		System.out.println(s + " constructor");
	}
	
	public ConstructorEx1(String s, int i) {
		System.out.println(s + "\t" + i + " constructor");
	}
	
	
	public static void main(String[] args) {
		ConstructorEx1 ob1 = new ConstructorEx1();
		ConstructorEx1 ob2 = new ConstructorEx1("ABC");
		ConstructorEx1 ob3 = new ConstructorEx1("ABC", 10);

	}

}
