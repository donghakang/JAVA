package Quiz;

public class Question {
	
	public static int number = 0;
	String question;
	String[] examples = new String[5];		// 4 examples
	private int answer;
	
	
	
	public Question() {
		this.answer = 0;
	}
	
	public Question(String question) {
		this.number += 1;
		this.question = question;
	}
	
	public void inputExamples(String ex1, 
							  String ex2, 
						      String ex3, 
							  String ex4, 
							  String ex5) {
		this.examples[0] = ex1;
		this.examples[1] = ex2;
		this.examples[2] = ex3;
		this.examples[3] = ex4;
		this.examples[4] = ex5;
	}
	
	public void inputAnswer(int answer) {
		this.answer = answer;
		System.out.println("�Ϸ�Ǿ����ϴ�. ");
	}
	
	
	public void checkAnswer(int answer) {
		if (this.answer == answer) System.out.println("�����Դϴ�!!!");
		else System.out.println("�����Դϴ�...");
	}
	
	public void print() {
		System.out.println("���� " + this.number + "  " + question);
		for (int i = 0; i < this.examples.length; i ++) {
			System.out.println((i+1) + ". " + this.examples[i]);
		}
		System.out.print("     �� ����: ");
	}
	
	public void print(String printThis) {
		System.out.println(printThis);
	}

}
