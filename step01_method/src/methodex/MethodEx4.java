package methodex;


// ��ø �޼ҵ� �ȿ��� �Ǵٸ� �޼ҵ带 ȣ���ϴ°�.
public class MethodEx4 {
	
	public static int total(int a, int b, int c) {
		return a + b + c;
	}
	
	public static double avg(int tot) {
		return (double)tot/3;
	}
	
	public static char grade(double av) {
		switch((int)av/10) {
		case 10:
			return 'A';
		case 9:
			return 'B';
		case 8:
			return 'C';
		case 7:
			return 'D';
		case 6:
			return 'F';
		default:
			return 'F';
		}
	}
	
	public static String result(char grade) {
		if (grade == 'F') {
			return "���հ�";
		} else {
			return "�հ�";
		}
	}
	
	public static void main(String[] args) {
		int k = 95, e = 85, m = 73;
		System.out.println("����:" + total(k,e,m) + "��");
		System.out.printf("���:%,2f��\n", avg(total(k,e,m)));
		System.out.println("����:"+grade(avg(total(k,e,m))));
		System.out.println("���:"+result(grade(avg(total(k,e,m)))));
		
	}		
}

/*
���� : switch()�� �̿��Ͽ� ��� ���ϱ�
       90�̻� 'A'   80�̻� 'B'  70�̻� 'C'  60�̻� 'D'  ������ 'F'
��� : if ~ else�� �̿��Ͽ� 'F'������ ��� "���հ�"
                                    �������� "�հ�"�� ����

[���ȭ��]
���� : 253��
��� : 84.33
���� : B
��� : �հ�
*/