package constructorex;

public class ConstructorEx2 {
	public ConstructorEx2() {
		System.out.println("default constructor");
	}
	
	public ConstructorEx2(String s) {
		System.out.println(s + " constructor");
	}
	
	public ConstructorEx2(String s, int i) {
		this();
		System.out.println(s + "\t" + i + " constructor");
	}
	
	public static void main(String[] args) {
		new ConstructorEx2("ABC", 2);

	}

}
