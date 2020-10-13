package homework;
/*
 * [����5]������ ����/�ϼ��Ͻÿ�
(1)Ŭ������:Test5
     �ʵ�� : -base:double  (�ʱⰪ:5.0)
                -height:double (�ʱⰪ:3.5)
     �޼����: +getArea():double
                  +getHypotenuse():double 
                  +getPerimeter():double
(2)����
   1)��  �� : �ﰢ���� ���� = (�غ� * ����) /2
                �������� = Math.sqrt(�غ�*�غ�+����*����)  
                �ѷ����� = �غ� + ���� + �������� 
   2) Test5�� ��ü ob�� �����Ѵ�
   3) getArea()�� �ﰢ���� ���̸� �����Ѵ�
       getHypotenuse() ������ ���̸� �����Ѵ�
       getPerimeter()�� �ѷ����̸� �����Ѵ� 

[���ȭ��]
�ﰢ���ǳ��� : 8.75
�������� : 6.10
�ѷ����� : 14.60
 */

class Test5{
	public double base;
	public double height;

	public Test5() {
		this.base = 5.0;
		this.height = 3.5;
	}

	public Test5(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double getArea() {
		return this.base * this.height / 2.0;
	}
	
	public double getHypotenuse() {
		return Math.sqrt((this.base * this.base) + (this.height * this.height));
	}
	
	public double getPerimeter() {
		return this.base + this.height + this.getHypotenuse();
	}
}
public class problem5 {
	public static void main(String[] args) {
		Test5 ob = new Test5();
		System.out.printf("�ﰢ���ǳ���: %.2f\n", ob.getArea());
		System.out.printf("��������: %.2f\n", ob.getHypotenuse());
		System.out.printf("�ѷ�����: %.2f\n", ob.getPerimeter());
	}
}
