package solution;

import java.util.Scanner;

/*[문제7]초를 입력하여 분과 초를 출력하시오
0이 입력될때 까지 계속 반복한다
음수가 입력되면 다시 입력을 받는다

[실행결과]
초 입력 : 250
[4]분 [10]초 입니다

초입력 : -84
초입력 : -12
초입력 : 123
[2]분 [3]초 입니다
초입력 : 0
프로그램을 종료합니다
*/
public class ExamTest07 {
	public static void main(String[] args) {
		int hour, minute, second, temp;
		Scanner sc=new Scanner(System.in);
		
		do{
			System.out.print("초 입력 : ");
            temp = sc.nextInt();

            if (temp > 0) {
                minute = (int)(temp / 60);
                second = temp - (minute * 60);
                System.out.println("[" + minute + "]분" + "[" + second + "]초 입니다.");
            }

		}while(temp>0);
		System.out.println("프로그램을 종료합니다");
		sc.close();
	}
}
