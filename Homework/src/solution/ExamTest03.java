package solution;

import java.util.Scanner;

/*[문제3]3자리 정수를 입력받아서 각각 자리수의 합을 구하시오.

[결과 화면]
3자리 정수를 입력하세요 :457
3자리의 합은 16 입니다.
*/
public class ExamTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("3자리 정수를 입력하세요 :");
        String num = sc.nextLine();

        if (num.length() != 3) {
            System.out.println("3자리가 아닙니다.");
        } else {
            int a = Integer.parseInt(num.substring(0,1));
            int b = Integer.parseInt(num.substring(1,2));
            int c = Integer.parseInt(num.substring(2,3));
    
            System.out.println("3자리의 합은 " + (a + b + c) + "입니다.");
        }
        
		sc.close();
	}
}
