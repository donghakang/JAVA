package inheritanceex;

class SuperEx{
	public void view1() {
		System.out.println("view1 method");
	}
}

class SubEx extends SuperEx{
	public void view2() {
		
		System.out.println("view2 method");
	}
}

public class InheritanceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubEx ob = new SubEx();
		ob.view1();
		ob.view2();
	}

}
