package homework;

import java.util.Scanner;

/*
 * 
 * [����4] �Ʒ��� ���� 12���� ������ �迭�� ����� ����Ų�� 
���ϴ� month�� �Է¹޾� �� ���� ������ ����Ͻÿ�

[����]
int []month={31,28,31,30,31,30,31,31,30,31,30,31};

--�Է�ȭ��/���ȭ��--

���ϴ� month�� �Է��Ͻÿ� : 3
3���� 31���Դϴ�.
 */
public class problem4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���ϴ� month�� �Է��Ͻÿ� : ");
		int mm = Integer.parseInt(scan.nextLine());
		int []month={31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.println(mm + "���� " + month[mm-1] + "���Դϴ�.");
		
	}

}
