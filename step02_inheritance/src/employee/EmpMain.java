package employee;

public class EmpMain {
	public static void main(String[] args) {
		//[문제 1] Developer로 dev 객체를 만들고 생성자에 101, "Scott", "5678"를 넣으시오
		// salary에 2500000, bonus에 350000 넣고 toString으로 출력하시오
		
		Developer dev = new Developer(101, "Scott", "5678");
		dev.setSalary(2500000);
		dev.setBonus(350000);
		System.out.println(dev);
		
		
		//[문제 2] Engineer로 eng 객체를 만들고 생성자에 01,"Steve","1234"를 넣으시오
		// salary에 1500000, bonus에 75000 넣고 toString으로 출력하시오
		Engineer eng = new Engineer(01, "Steve", "1234");
		eng.setSalary(1500000);
		eng.setBonus(75000);
		System.out.println(eng);
	}
}
/* [출력결과]
 * 사원번호:101
 * 사원이름:Scott
 * 내선번호:5678
 * 기본급여:2500000
 * 보너스+수당:450000
 * 지급금액 : 2950000원
 * 
 * 사원번호:201
 * 사원이름:Steve
 * 내선번호:1234
 * 기본급여:1500000
 * 보너스+수당:225000
 * 지급금액 : 1725000원
 */