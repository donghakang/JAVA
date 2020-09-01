package main;

import java.util.Random;
import java.util.Scanner;

public class Main {

	
	static void play() {
		
		int finalNumber1 = new Random().nextInt(500);
		int finalNumber2 = new Random().nextInt(500);
		
		int num1Start = 0;
		int num1End = 500;
		int num2Start = 0;
		int num2End = 500;
		
		Scanner scan = new Scanner(System.in);
		String input;
		int estimate = 0;
		
		boolean isUser = true;
		
		while (true) {
			
			if (isUser) {
				System.out.print("����� �����Դϴ�, [" + num1Start + ", " + num1End + "] ���� ���ڸ� �Է��ϼ���: ");
				input = scan.nextLine();
				estimate = Integer.parseInt(input);
				
				if (estimate < finalNumber1) {
					System.out.println("UP!");
					num1Start = estimate;
				} else if (estimate > finalNumber1) {
					System.out.println("DOWN!");
					num1End = estimate;
				} else {
					System.out.println("����� �¸� !!");
					break;
				}
				isUser = !isUser;
			} else {
				int estimate1 = new Random().nextInt(num2End - num2Start - 1) + num2Start + 1;
				
				if (estimate1 < finalNumber2) {
					num2Start = estimate1;
					System.out.println("��ǻ�� �����Դϴ�.");
					System.out.println("��ǻ���� ����: " + estimate1);
					System.out.println("UP!");
					System.out.println("��ǻ���� ����: [" + num2Start + ", " + num2End + "]");
				} else if (estimate1 > finalNumber2) {
					num2End = estimate1;
					System.out.println("��ǻ�� �����Դϴ�.");
					System.out.println("��ǻ���� ����: " + estimate1);
					System.out.println("DOWN!");
					System.out.println("��ǻ���� ����: [" + num2Start + ", " + num2End + "]");
				} else {
					System.out.println("��ǻ�� �����Դϴ�.");
					System.out.println("��ǻ���� ����: " + estimate1);
					System.out.println("��ǻ�� �¸� !!");
					break;
				}
				isUser = !isUser;
				
			}
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("������� ����: " + finalNumber1);
		System.out.println("��ǻ���� ����: " + finalNumber2);
		
	}
	
	public static void main(String[] args) {
		play();
	}

}
