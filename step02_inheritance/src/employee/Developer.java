package employee;

/*  Emp�� ��ӹ޴´�
* -salary:long
* -bonus:long
* 
* +Develoer()
* +Developer(eno:int, ename:String, phone:String)
* +toString():String
* 
*  [����]
*  ���ʽ�+=100000�� �������� ����
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
//		�����ȣ:101
//		 * ����̸�:Scott
//		 * ������ȣ:5678
//		 * �⺻�޿�:2500000
//		 * ���ʽ�+����:450000
//		 * ���ޱݾ� : 2950000��
		String str = "";
		str += "�����ȣ: " + super.getEno() + '\n';
		str += "����̸�: " + super.getEname() + '\n';
		str += "������ȣ: " + super.getPhone() + '\n';
		str += "�⺻�޿�: " + this.salary + '\n';
		str += "���ʽ�+����: " + this.bonus + '\n';
		str += "���ޱݾ�: " + (this.salary + this.bonus) + '\n';
	
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





