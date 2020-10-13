package problem;

/*[문제12]
(1)클래스명:ScoreTable
  - name:String    ==> 이름
  - sol:int            ==> 맞은수
  - s: static int     ==> 배점(20)
  - score:int         ==> 점수=맞은수*배점
  +ScoreTable()
  +ScoreTable(name:String,sol:int)  
  +calcScore():void          ==>계산
  +display():void             ==> 출력  

(3) main()함수에서 
    public static void main(String[] args){
           ScoreTable  s1 = new ScoreTable("민들래",5);
           ScoreTable  s2 = new ScoreTable("진달래",3);
           ScoreTable  s3 = new ScoreTable("개나리",0);
           //나머지를 완성하시오
    }
[출력화면]
   이름      점수      
  ---------------------
   민들래    100
   진달래     60
   개나리      0*/
class ScoreTable {
	private String name;
	private int sol;
	private static int s = 20;
	private int score;
	
	public ScoreTable() {
		super();
	}

	public ScoreTable(String name, int sol) {
		super();
		this.name = name;
		this.sol = sol;
	}
	
	public void calcScore() {
		this.score = ScoreTable.s * this.sol;
	}
	
	public void display() {
		System.out.println(this.name + '\t' + this.score);
	}
	
}
public class Problem12 {
	public static void main(String[] args){
        ScoreTable  s1 = new ScoreTable("민들래",5);
        ScoreTable  s2 = new ScoreTable("진달래",3);
        ScoreTable  s3 = new ScoreTable("개나리",0);
        
        s1.calcScore();
        s2.calcScore();
        s3.calcScore();
        System.out.println("이름\t정수\n---------------------");
        s1.display();
        s2.display();
        s3.display();
	}
}
