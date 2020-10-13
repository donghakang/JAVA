package problem;

/*[����12]
(1)Ŭ������:ScoreTable
  - name:String    ==> �̸�
  - sol:int            ==> ������
  - s: static int     ==> ����(20)
  - score:int         ==> ����=������*����
  +ScoreTable()
  +ScoreTable(name:String,sol:int)  
  +calcScore():void          ==>���
  +display():void             ==> ���  

(3) main()�Լ����� 
    public static void main(String[] args){
           ScoreTable  s1 = new ScoreTable("�ε鷡",5);
           ScoreTable  s2 = new ScoreTable("���޷�",3);
           ScoreTable  s3 = new ScoreTable("������",0);
           //�������� �ϼ��Ͻÿ�
    }
[���ȭ��]
   �̸�      ����      
  ---------------------
   �ε鷡    100
   ���޷�     60
   ������      0*/
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
        ScoreTable  s1 = new ScoreTable("�ε鷡",5);
        ScoreTable  s2 = new ScoreTable("���޷�",3);
        ScoreTable  s3 = new ScoreTable("������",0);
        
        s1.calcScore();
        s2.calcScore();
        s3.calcScore();
        System.out.println("�̸�\t����\n---------------------");
        s1.display();
        s2.display();
        s3.display();
	}
}
