package employee;

/* Emp를 상속받는다
* -salary:long
* -bonus:long
* 
* +Engineer()
* +Engineer(eno:int, ename:String, phone:String)
* +toString():String
* 
*  [조건]
*  보너스+=150000을 수당으로 지급
*/
public class Engineer extends Emp{
	private long salary;
	private long bonus;
	
	public Engineer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Engineer(int eno, String ename, String phone) {
		super(eno, ename, phone);
		// TODO Auto-generated constructor stub
	}
	@Override
	void setSalary(long salary) {
		// TODO Auto-generated method stub
		this.salary = salary;
	}
	@Override
	void setBonus(long bonus) {
		// TODO Auto-generated method stub
		this.bonus = bonus + 150000;
	}
	@Override
	public String toString() {
		String str = "";
		str += "사원번호: " + super.getEno() + '\n';
		str += "사원이름: " + super.getEname() + '\n';
		str += "내선번호: " + super.getPhone() + '\n';
		str += "기본급여: " + this.salary + '\n';
		str += "보너스+수당: " + this.bonus + '\n';
		str += "지급금액: " + (this.salary + this.bonus) + '\n';
	
		return str;
	}
	
	
	
	
	
	
}
