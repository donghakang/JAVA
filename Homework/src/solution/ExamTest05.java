package solution;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/*[문제5] 가위, 바위, 보 게임
컴퓨터가(com) 난수 1~3중 하나를 발생하고 가위(1), 바위(2), 보(3)로 사용한다
사용자가(user) 1~3중 입력하여 승패를 결정한다

[실행결과]
가위(1), 바위(2), 보(3) 입력 : 2

컴퓨터 : 보         사용자 : 가위     결과 : You Win!!

컴퓨터 : 가위     사용자 : 보         결과 : You Lose!!

컴퓨터 : 바위     사용자 : 바위     결과 : You Draw!!

*/

public class ExamTest05 {

    private static int game(int com, int user) {
        // 1 가위, 2 바위, 3 보
        if (com == 1) {
            switch (user) {
                case 1:
                    // 가위 : 가위
                    return 0;       // 비김
                case 2:
                    // 가위 : 바위
                    return 1;       // 이김
                default:
                    // 가위 : 보
                    return 2;       // 짐
            }
        } else if (com == 2) {
            switch (user) {
                case 1:
                    // 바위 : 가위
                    return 2;       
                case 2:
                    // 바위 : 바위
                    return 0;      
                default:
                    // 바위 : 보
                    return 1;      
            }
        } else if (com == 3) {
            switch (user) {
                case 1:
                    // 보 : 가위
                    return 1;      
                case 2:
                    // 보 : 바위
                    return 2;      
                default:
                    // 보 : 보
                    return 0;       
            }
        }
        return -1;
    }

	public static void main(String[] args) throws NumberFormatException, IOException {
        Map<Integer,String> RPS = new HashMap<>();
        RPS.put(1,"가위");
        RPS.put(2,"바위");
        RPS.put(3,"보");
        
        Scanner scan = new Scanner(System.in);
        System.out.print("가위(1), 바위(2), 보(3) 입력: ");
        int user = scan.nextInt();
        int com = new Random().nextInt(3) + 1;

        System.out.print("컴퓨터 : " + RPS.get(com) + " \t 사용자 : " + RPS.get(user) + " \t ");
        int result = game(com, user);
        switch (result) {
            case 0:
                System.out.println("You Draw !!!");
                break;
            case 1: 
                System.out.println("You Win  !!!");
                break;  
            case 2:
                System.out.println("You Lose !!!");
                break;
            default:
                break;
        }
	}
}

