package inheritanceex;

class ParentEx {
	public ParentEx() {
		System.out.println("parent class");
	}
}

class ChildEx extends ParentEx{
	public ChildEx() {
		super();		// ���� ����
		System.out.println("child class");
	}
}

public class InheritanceEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChildEx();
	}

}
