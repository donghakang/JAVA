package problem;

/*[����8] ���� ���α׷��� �ϼ��Ͻÿ�
(1)Ŭ������ : Salary
  -name:String (�̸�)
  -salary:int  (����)
  +Salary()
  +Salary(name:String, salary:int) ==> name, salary�� ����
  +viewInfomation():void     ==> �޼��忡�� �̸��� ������ ���

(2)Ŭ������ : Test8   ==> Salary�� ��ӹ���
  -department:String(�μ�)
  +Test8()
  +Test8(nameString, salary:int, department:String)
  +viewInfomation():void     ==> �μ� ���

(3)main()�Լ�����
   Test8  ob = new Test8("ȫ�浿",85000000,"���ߺ�"); 
   //�������� �ϼ��Ͻÿ�
           :

[���ȭ��]
�̸� : ��ȣ��
���� : 85000000
�μ� : ���ߺ�*/
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
		System.out.println("�̸�: " + this.name);
		System.out.println("����: " + this.salary);
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
		System.out.println("�μ�: " + this.department);
	}
}

public class problem8 {
	public static void main(String[] args) {
		Test8 ob = new Test8("��ȣ��", 85000000, "���ߺ�");
		ob.viewInformation();
	}
}
