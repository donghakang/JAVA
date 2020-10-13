package constructorex;

class Member {
	String name;
	int age;

	

	public Member() {
		name = "kim";
		age = 26;
	}

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void view() {
		System.out.println(this.name + "\t" + this.age);
	}
	
	
	
	
}

public class ConstructorEx7 {
	public static void main(String[] args) {
		Member ob1 = new Member("ȫ�浿" , 27);
		ob1.view();				
		
		Member ob2 = new Member();
		ob2.view();
		 
	}
}
