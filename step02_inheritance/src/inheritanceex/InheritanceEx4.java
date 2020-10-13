package inheritanceex;

/*
나의 이름은 이순신이고 연락처는 010-1111-1111입니다

나의 이름은 강호동이고 연락처는 010-1234-5678입니다
나의 점수는 75.3점 이고 학점은 C입니다

*/

class Emp {
	private String name;
	private String phone; 
	
	public Emp() {
		super();
	}
	
	public Emp(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	public String toString() {
		return "나의 이름은 " + this.name + "이고 연락처는 " + this.phone + "입니다.";
	}
}

public class InheritanceEx4 {

	public static void main(String[] args) {
		Emp ob1 = new Emp("이순신", "010-1111-1111");
		System.out.println(ob1);

		EmpScore ob2 = new EmpScore("강감찬", "010-2132-1234", 53.2, 'F');
		System.out.println(ob2);
	}

}
