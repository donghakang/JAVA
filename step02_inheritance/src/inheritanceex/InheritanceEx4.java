package inheritanceex;

/*
���� �̸��� �̼����̰� ����ó�� 010-1111-1111�Դϴ�

���� �̸��� ��ȣ���̰� ����ó�� 010-1234-5678�Դϴ�
���� ������ 75.3�� �̰� ������ C�Դϴ�

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
		return "���� �̸��� " + this.name + "�̰� ����ó�� " + this.phone + "�Դϴ�.";
	}
}

public class InheritanceEx4 {

	public static void main(String[] args) {
		Emp ob1 = new Emp("�̼���", "010-1111-1111");
		System.out.println(ob1);

		EmpScore ob2 = new EmpScore("������", "010-2132-1234", 53.2, 'F');
		System.out.println(ob2);
	}

}
