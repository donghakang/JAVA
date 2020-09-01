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
				System.out.print("사용자 차례입니다, [" + num1Start + ", " + num1End + "] 안의 숫자를 입력하세요: ");
				input = scan.nextLine();
				estimate = Integer.parseInt(input);
				
				if (estimate < finalNumber1) {
					System.out.println("UP!");
					num1Start = estimate;
				} else if (estimate > finalNumber1) {
					System.out.println("DOWN!");
					num1End = estimate;
				} else {
					System.out.println("사용자 승리 !!");
					break;
				}
				isUser = !isUser;
			} else {
				int estimate1 = new Random().nextInt(num2End - num2Start - 1) + num2Start + 1;
				
				if (estimate1 < finalNumber2) {
					num2Start = estimate1;
					System.out.println("컴퓨터 차례입니다.");
					System.out.println("컴퓨터의 추측: " + estimate1);
					System.out.println("UP!");
					System.out.println("컴퓨터의 범위: [" + num2Start + ", " + num2End + "]");
				} else if (estimate1 > finalNumber2) {
					num2End = estimate1;
					System.out.println("컴퓨터 차례입니다.");
					System.out.println("컴퓨터의 추측: " + estimate1);
					System.out.println("DOWN!");
					System.out.println("컴퓨터의 범위: [" + num2Start + ", " + num2End + "]");
				} else {
					System.out.println("컴퓨터 차례입니다.");
					System.out.println("컴퓨터의 추측: " + estimate1);
					System.out.println("컴퓨터 승리 !!");
					break;
				}
				isUser = !isUser;
				
			}
			System.out.println();
			
		}
		
		System.out.println();
		System.out.println("사용자의 숫자: " + finalNumber1);
		System.out.println("컴퓨터의 숫자: " + finalNumber2);
		
	}
	
	public static void main(String[] args) {
		play();
	}

}
