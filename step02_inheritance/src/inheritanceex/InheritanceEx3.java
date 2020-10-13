package inheritanceex;

//class Branch  {
//	public Branch (String str) {
//		System.out.println(str + " branch constructor");
//	}
//	
//	public Branch (String str, int num) {
//		this(str);
//		System.out.println(str + "\t" + num + " branch constructor");
//	}
//	
//}
//
//class Leaf extends Branch {
//	public Leaf(String str, int num) {
//		super(str, num);
//		System.out.println(str + "\t" + num + " leaf constructor");
//	}
//}
//
//public class InheritanceEx3 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		new Leaf("ABC", 10);
//	}
//
//}

class Branch {
	public Branch() {
		System.out.println("branch default constructor");
	}
	
	public Branch(String str, int num) {
		this();
		System.out.println(str + "\t" + num + "\tbranch constructor");
	}
}

class Leaf extends Branch {
	public Leaf (String str) {
		super(str, 10);
		System.out.println(str + "\t" + "leaf constructor");
	}
	public Leaf() {
		this("ABC");
		System.out.println("leaf default constructor");
	}
}

public class InheritanceEx3 {
	public static void main(String[] args) {
		new Leaf();
	}
}