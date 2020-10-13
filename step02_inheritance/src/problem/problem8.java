package problem;

/*[문제8] 다음 프로그램을 완성하시오
(1)클래스명 : Salary
  -name:String (이름)
  -salary:int  (연봉)
  +Salary()
  +Salary(name:String, salary:int) ==> name, salary에 대입
  +viewInfomation():void     ==> 메서드에서 이름과 연봉을 출력

(2)클래스명 : Test8   ==> Salary를 상속받음
  -department:String(부서)
  +Test8()
  +Test8(nameString, salary:int, department:String)
  +viewInfomation():void     ==> 부서 출력

(3)main()함수에서
   Test8  ob = new Test8("홍길동",85000000,"개발부"); 
   //나머지를 완성하시오
           :

[출력화면]
이름 : 강호동
연봉 : 85000000
부서 : 개발부*/
class Salary {
	private String name;
	private int salary;
	
	
	public Salary() {
		super();
	}

	public Salary(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public void viewInformation() {
		System.out.println("이름: " + this.name);
		System.out.println("연봉: " + this.salary);
	}
}

class Test8 extends Salary{
	private String department;

	public Test8() {
		super();
	}

	public Test8(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	public void viewInformation() {
		super.viewInformation();
		System.out.println("부서: " + this.department);
	}
}

public class problem8 {
	public static void main(String[] args) {
		Test8 ob = new Test8("강호동", 85000000, "개발부");
		ob.viewInformation();
	}
}
