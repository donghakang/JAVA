package inheritanceex;

public class EmpScore extends Emp {
	private double score;
	private char grade;
	
	public EmpScore() {
		super();
	}
	
	

	public EmpScore(String name, String phone, double score, char grade) {
		super(name, phone);
		this.score = score;
		this.grade = grade;
	}



	@Override
	public String toString() {
		return super.toString() + '\n' + "나의 점수는 " + this.score + "점이고 학점은 " + this.grade + "입니다.";
	}
	
	
	
}
