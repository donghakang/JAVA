package constructorex;

public class ConstructorEx6 {
	public static void main(String[] args) {
		//[����1] Student ��ü ob1�� ����� setter�� ���� ������ �������� toString()���� ���
		// ȫ�浿, 75,88,95
		Student ob1 = new Student();
		ob1.setName("ȫ�浿");
		ob1.setKor(75);
		ob1.setMat(88);
		ob1.setEng(95);
		System.out.println(ob1.toString());
		
		System.out.println();
		//[����2] Student ��ü ob2�� ����� �����ڸ� ���� �����͸� �������� getter�� ���
		//�ε鷹, 90,85,88
		Student ob2 = new Student("�ε鷹", 90, 75, 88);
		System.out.println("�̸�: " + ob2.getName());
		System.out.println("����: " + ob2.getKor());
		System.out.println("����: " + ob2.getMat());
		System.out.println("����: " + ob2.getEng());
		System.out.println("����: " + ob2.getTotal());
		System.out.printf("���: %.2f\n", ob2.getAvg());
		System.out.println("����: " + ob2.getGrade());

	}
}
/*
[����1]
ȫ�浿�� ������ 258�� �̸�, ����� 86.00�̰� ������ B�Դϴ�


[����2]
�̸�:�ε鷡
����:90
����:75
����:88
����:253
���:84.33
����:B
*/