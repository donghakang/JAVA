import java.util.Random;
import java.util.Scanner;

// 1. 길이가 10인 배열의 각 방에 랜덤 숫자를 20~100 까지 넣는다, 크기가 작은(혹은 큰) 순서대로 정렬한다
// 2. 숫자 2개를 각각 입력하고 랜덤으로 더하기, 빼기 곱하기 중 하나가 실행되는 프로그램


public class Main {

	
	public static void main(String[] args) {
		int[] room = new int[10];
		int number;
		boolean repeated = false;
		
		
		for (int i = 0; i < 10; i ++) {
			repeated = false;
			number = new Random().nextInt(81) + 20;
			for (int j = 0; j < 10; j ++) {
				if (room[j] == number) {  	// 만약 숫자가 같다면, 중복되어있음을 알려줌
					repeated = true;
					break;
				} 
			}
			
			if (repeated) {
				i --;
			} else {
				room[i] = number;
			}
			
		}
		
		
		// SORT
		for (int i = 0; i < 10; i ++ ) {
			for (int j = i; j < 10; j ++) {
				if (room[i] > room[j]) {
					int temp = room[i];
					room[i] = room[j];
					room[j] = temp;
				}
			}
		}
		
		
		for (int i = 0; i < 10; i ++) {
			System.out.print(room[i] + "  ");
		}

		
		while (true) {
			System.out.println('\n');
			int op = new Random().nextInt(3);
			Scanner scan = new Scanner(System.in);
			
			System.out.println("두개의 숫자를 넣으시오 ('exit' to quit) ");
			String number1 = scan.nextLine();
			String number2 = scan.nextLine();

			if (number1.equals("exit") || number2.equals("exit")) break;
			
			
			int num1 = Integer.parseInt(number1);
			int num2 = Integer.parseInt(number2);
			
			if (op == 0)  		System.out.print("+ :     " + num1 + " + " + num2 + " = " + (num1 + num2));
			else if (op == 1)  	System.out.print("* :     " + num1 + " * " + num2 + " = " + (num1 * num2));
			else  				System.out.print("/ :     " + num1 + " / " + num2 + " = " + ((float)num1 / (float)num2));
		}
		
		
		
	
	}

}
