package employee;

/*  Emp를 상속받는다
* -salary:long
* -bonus:long
* 
* +Develoer()
* +Developer(eno:int, ename:String, phone:String)
* +toString():String
* 
*  [조건]
*  보너스+=100000을 수당으로 지급
*/
public class Developer extends Emp{
	private long salary;
	private long bonus;
	
	public Developer() {
		super();
	}
	public Developer(int eno, String ename, String phone) {
		super(eno, ename, phone);
	}
	
	@Override
	public String toString() {
//		사원번호:101
//		 * 사원이름:Scott
//		 * 내선번호:5678
//		 * 기본급여:2500000
//		 * 보너스+수당:450000
//		 * 지급금액 : 2950000원
		String str = "";
		str += "사원번호: " + super.getEno() + '\n';
		str += "사원이름: " + super.getEname() + '\n';
		str += "내선번호: " + super.getPhone() + '\n';
		str += "기본급여: " + this.salary + '\n';
		str += "보너스+수당: " + this.bonus + '\n';
		str += "지급금액: " + (this.salary + this.bonus) + '\n';
	
		return str;
	}
	
	@Override
	void setSalary(long salary) {
		// TODO Auto-generated method stub
		this.salary = salary;
	}
	@Override
	void setBonus(long bonus) {
		// TODO Auto-generated method stub
		this.bonus = bonus + 100000;
	}
	
	
}





