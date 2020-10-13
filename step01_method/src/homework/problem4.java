package homework;

import java.util.Scanner;

/*
 * 
 * [문제4] 아래와 같이 12달의 날수를 배열를 만들어 기억시킨후 
원하는 month을 입력받아 그 달의 날수를 출력하시오

[참고]
int []month={31,28,31,30,31,30,31,31,30,31,30,31};

--입력화면/출력화면--

원하는 month을 입력하시오 : 3
3월은 31일입니다.
 */
public class problem4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 month을 입력하시오 : ");
		int mm = Integer.parseInt(scan.nextLine());
		int []month={31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.println(mm + "월은 " + month[mm-1] + "일입니다.");
		
	}

}
