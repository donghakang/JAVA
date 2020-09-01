import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Quiz.Question;

public class Main {

	public static void printList() {
		System.out.println("������ �Ͻðڽ��ϱ� ? ");
		System.out.println("1. ���� Ǯ��");
		System.out.println("2. ���� �ֱ�");
	}
	
	public static void main(String[] args) {
		
		ArrayList<Question> questions = new ArrayList<Question> ();
		Question question;
		Scanner scan = new Scanner(System.in);
		String input;
		
		String ex1, ex2, ex3, ex4, ex5;
		
		while (true) {
			printList();
			input = scan.nextLine();
			if (Integer.parseInt(input) == 1) {
				
				if (questions.size() > 0) {
					int pos = new Random().nextInt(questions.size());
					questions.get(pos).print();
					input = scan.nextLine();
					
					questions.get(pos).checkAnswer(Integer.parseInt(input));
				} else {
					System.out.println("������ �ϳ� �̻� ��������");
				}
				
			} else if (Integer.parseInt(input) == 2) {
				System.out.println("������ �����ÿ�.");
				input = scan.nextLine();
				question = new Question(input);
				
				System.out.println("���⸦ �����ÿ�. ");
				System.out.print("1. ");
				ex1 = scan.nextLine();
				System.out.print("2. ");
				ex2 = scan.nextLine();
				System.out.print("3. ");
				ex3 = scan.nextLine();
				System.out.print("4. ");
				ex4 = scan.nextLine();
				System.out.print("5. ");
				ex5 = scan.nextLine();
				question.inputExamples(ex1, ex2, ex3, ex4, ex5);
				
				System.out.println("���� �����ÿ�. ");
				input = scan.nextLine();
				question.inputAnswer(Integer.parseInt(input));
				
				questions.add(question);
			} else {
				System.out.println("�ٽ� �Է��Ͻÿ�");
			}
			
		}
		
	}
	

}
