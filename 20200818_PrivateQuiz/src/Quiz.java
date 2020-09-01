
public class Quiz {
	private String quiz;
	private String ex1;
	private String ex2;
	private String ex3;
	private String ex4;
	private String ex5;
	private int ans;
	
	
	void setQuiz(String quiz) {
		this.quiz = quiz;
	}
	
	void setEx(String ex1, String ex2, String ex3, String ex4, String ex5) {
		this.ex1  = ex1;
		this.ex2  = ex2;
		this.ex3  = ex3;
		this.ex4  = ex4;
		this.ex5  = ex5;
	}
	
	void setSpecificEx(int pos, String ex) {
		if (pos == 1) {
			this.ex1 = ex;
		} else if (pos == 2) {
			this.ex2 = ex;
		} else if (pos == 3) {
			this.ex3 = ex;
		} else if (pos == 4) {
			this.ex4 = ex;
		} else if (pos == 5) {
			this.ex5 = ex;
		} else {
			System.out.println("잘못된 입력값");
		}
	}
	
	void setAns(int ans) {
		this.ans = ans;
	}
	
	
	
	
	String getQuiz() {
		return this.quiz;
	}
	
	String getEx() {
		return ex1 + "\n" + ex2 + "\n" + ex3 + "\n" + ex4 + "\n" + ex5;
	}
	
	String getEx1() {
		return ex1;
	}
	
	String getEx2() {
		return ex2;
	}
	
	String getEx3() {
		return ex3;
	}
	
	String getEx4() {
		return ex4;
	}
	
	String getEx5() {
		return ex5;
	}
	
	
	int getAns() {
		return this.ans;
	}
}
