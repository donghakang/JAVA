package employee;

/* Emp�� ��ӹ޴´�
* -salary:long
* -bonus:long
* 
* +Engineer()
* +Engineer(eno:int, ename:String, phone:String)
* +toString():String
* 
*  [����]
*  ���ʽ�+=150000�� �������� ����
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
		str += "�����ȣ: " + super.getEno() + '\n';
		str += "����̸�: " + super.getEname() + '\n';
		str += "������ȣ: " + super.getPhone() + '\n';
		str += "�⺻�޿�: " + this.salary + '\n';
		str += "���ʽ�+����: " + this.bonus + '\n';
		str += "���ޱݾ�: " + (this.salary + this.bonus) + '\n';
	
		return str;
	}
	
	
	
	
	
	
}
