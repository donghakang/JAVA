import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Quiz> quizArr = new ArrayList<>();
		
		
		Quiz quiz1 = new Quiz();
		quiz1.setQuiz("2+2X2의 답은?");
		quiz1.setEx("1", "8", "6", "4", "10");
		quiz1.setAns(3);
		
		Quiz quiz2 = new Quiz();
		quiz2.setQuiz("시카고는 미국에 있는 도시 이름이다, 그럼 시카고 있는 주의 이름은?");
		quiz2.setEx("미네소타", "일리노이", "워싱턴", "아이오와", "캘리포니아");
		quiz2.setAns(2);
		
		Quiz quiz3 = new Quiz();
		quiz3.setQuiz("다음중 프로그래밍 언어가 아닌 것은?");
		quiz3.setEx("Python", "Java", "Ruby", "Diamond", "C#");
		quiz3.setAns(4);
		
		quizArr.add(quiz1);
		quizArr.add(quiz2);
		quizArr.add(quiz3);
		
		
		
		
		Scanner scan = new Scanner(System.in);
		String input;
		int answer;
		while (true) {
			int randomNumber = new Random().nextInt(3);
			System.out.print("<<Quiz " + (randomNumber+1) + ">>");
			System.out.println(quizArr.get(randomNumber).getQuiz());
			System.out.println("1. " + quizArr.get(randomNumber).getEx1());
			System.out.println("2. " + quizArr.get(randomNumber).getEx2());
			System.out.println("3. " + quizArr.get(randomNumber).getEx3());
			System.out.println("4. " + quizArr.get(randomNumber).getEx4());
			System.out.println("5. " + quizArr.get(randomNumber).getEx5());
			System.out.print("  ㄴ 답변 : ");
			input = scan.nextLine();
			answer = Integer.parseInt(input);
			
			if (answer == quizArr.get(randomNumber).getAns()) {
				System.out.println("정답입니다!!\n");
			} else {
				System.out.println("오답입니다..\n");
			}
			
		}
		
	}

}
