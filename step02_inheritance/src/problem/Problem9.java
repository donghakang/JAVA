package problem;

/*(1)Ŭ���� : Entry
-word:String
+Entry()                              // "***������***"�� ����Ͻÿ�
+Entry(word:String)              //  Entry()ȣ�� 
+writeView():void                // ������

(2)Ŭ���� : SubEntry   (Entry�� ��ӹ���)
-definition:String 
-year:int
+SubEntry(word:String)                                       //Entry(word)   ȣ�� 
+SubEntry(word:String, definition:String, year:int);  //SubEntry(word)ȣ��
+writeView():void                                               //����, �ñ����

(3)main()�Լ�����
public static void main(String[] args){
 new SubEntry("OOP","Object Oriented Programming", 1991).writeView();
}

[���ȭ��]
*****������******
��� : OOP
���� : Object Oriented Programming
�ñ� : 1991��*/

class Entry {
	private String word;

	public Entry() {
		super();
		System.out.println("*****������*****");
	}

	public Entry(String word) {
		super();
		this.word = word;
		System.out.println("*****������*****");
	}
	
	public void writeView() {
		System.out.println("���: " + this.word);
	}
	
}


class SubEntry extends Entry {
	private String definition;
	private int year;
	
	public SubEntry(String word) {
		super(word);	
	}

	public SubEntry(String word, String definition, int year) {
		super(word);
		this.definition = definition;
		this.year = year;
	}
	
	public void writeView() {
		super.writeView();
		System.out.println("����: " + this.definition);
		System.out.println("�ñ�: " + this.year + "��");
	}
	
}

public class Problem9 {
	public static void main(String[] args) {
		new SubEntry("OOP","Object Oriented Programming", 1991).writeView();
	}
}
