package employee;

public class EmpMain {
	public static void main(String[] args) {
		//[���� 1] Developer�� dev ��ü�� ����� �����ڿ� 101, "Scott", "5678"�� �����ÿ�
		// salary�� 2500000, bonus�� 350000 �ְ� toString���� ����Ͻÿ�
		
		Developer dev = new Developer(101, "Scott", "5678");
		dev.setSalary(2500000);
		dev.setBonus(350000);
		System.out.println(dev);
		
		
		//[���� 2] Engineer�� eng ��ü�� ����� �����ڿ� 01,"Steve","1234"�� �����ÿ�
		// salary�� 1500000, bonus�� 75000 �ְ� toString���� ����Ͻÿ�
		Engineer eng = new Engineer(01, "Steve", "1234");
		eng.setSalary(1500000);
		eng.setBonus(75000);
		System.out.println(eng);
	}
}
/* [��°��]
 * �����ȣ:101
 * ����̸�:Scott
 * ������ȣ:5678
 * �⺻�޿�:2500000
 * ���ʽ�+����:450000
 * ���ޱݾ� : 2950000��
 * 
 * �����ȣ:201
 * ����̸�:Steve
 * ������ȣ:1234
 * �⺻�޿�:1500000
 * ���ʽ�+����:225000
 * ���ޱݾ� : 1725000��
 */