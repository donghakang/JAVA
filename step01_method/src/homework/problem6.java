package homework;

/*
 * [����6]�Լ� overloading�� �̿��Ͽ� ������ �ϼ��Ͻÿ�
(1)Ŭ������:Test6
    �� �ʵ�� : PI:double     (�ʱⰪ:3.141593, final�� ����)
    �� �޼ҵ� : 
           area(a:int):double       => ���ǳ���=������*������*PI
           area(a:int, b:int):double     => �簢���ǳ���=����*����
           area(a:int, b:int, c:int):doble     => ��ٸ����� ����=(�غ� + ���� )*����/2 
(2)����
     1)main()�Լ����� 
       public static void  main(String[] args){
             Test6 ob=new Test6();
             //������ �ϼ��Ͻÿ�
       }
     2)������ area(3),area(4,5),area(3,4,7) �޼��带 ȣ���Ͽ� 
        ������� ���Ѵ�

[���ȭ��]
���ǳ��� : 28.274337
�簢���ǳ��� : 20.0
��ٸ����ǳ��� : 24.5
 */

class Test6 {
	public final double PI;

	public Test6() {
		PI = 3.141593;
	}
	
	public double area(int a) {
		return a * a * PI;
	}
	
	public double area(int a, int b) {
		return (double)(a * b);
	}
	
	public double area(int a, int b, int c) { 
		return (a + b) * c / 2.0;
	}
	
}
public class problem6 {
	public static void main(String[] args) {
		Test6 ob = new Test6();
		System.out.println("���� ����: " + ob.area(3));
		System.out.println("�簢���� ����: " + ob.area(4, 5));
		System.out.println("��ٸ����� ����: " + ob.area(3, 4, 7));
	}
}
