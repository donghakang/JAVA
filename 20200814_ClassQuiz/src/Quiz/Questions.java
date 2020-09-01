package Quiz;

import java.util.ArrayList;

public class Question {
	
	static int number = 0;
	String question;
	String[] examples = new String[5];		// 4 examples
	private int answer;
	
	Question(String question) {
		number += 1;
		this.question = question;
	}
	
	
}
