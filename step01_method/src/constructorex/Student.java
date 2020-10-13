package constructorex;

/*
Ŭ������ : Student
-name:String
-kor:int
-mat:int
-eng:int

+Student()
+Student(name:String,kor:int,mat:int,eng:int)
+setter&getter  
+toString():String

+getTotal():int              <---- kor+eng+mat �� ����
+getAvg():double             <---- getTotal()�� 3���� ����� ����� ������ ����
+getGrade():char             <---- getAvg()�� �̿��ؼ� A,B,C,D,F������ ���ؼ� ����
*/
public class Student {
	private String name;
	private int kor;
	private int mat;
	private int eng;
	
	public Student() {
		
	}

	public Student(String name, int kor, int mat, int eng) {
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public String toString() {
		return this.name + "�� ������ " + this.getTotal() + "�� �̸�, ����� " + this.getAvg() + "�̰� ������ " + this.getGrade() + "�Դϴ�";
	}

	public int getTotal() {
		return this.kor + this.eng + this.mat;
	}
	
	public double getAvg() {
		return (double)this.getTotal() / 3.0;
	}
	
	public char getGrade() {
		if (getAvg() > 90.0) {
			return 'A';
		} else if (getAvg() > 80.0) {
			return 'B';
		} else if (getAvg() > 70.0) {
			return 'C';
		} else if (getAvg() > 60.0) {
			return 'D';
		} else {
			return 'F';
		}
	}
	
}













