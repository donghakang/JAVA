package problem;

/*(1)클래스 : Entry
-word:String
+Entry()                              // "***약어사전***"을 출력하시오
+Entry(word:String)              //  Entry()호출 
+writeView():void                // 약어출력

(2)클래스 : SubEntry   (Entry를 상속받음)
-definition:String 
-year:int
+SubEntry(word:String)                                       //Entry(word)   호출 
+SubEntry(word:String, definition:String, year:int);  //SubEntry(word)호출
+writeView():void                                               //원어, 시기출력

(3)main()함수에서
public static void main(String[] args){
 new SubEntry("OOP","Object Oriented Programming", 1991).writeView();
}

[출력화면]
*****약어사전******
약어 : OOP
원어 : Object Oriented Programming
시기 : 1991년*/

class Entry {
	private String word;

	public Entry() {
		super();
		System.out.println("*****약어사전*****");
	}

	public Entry(String word) {
		super();
		this.word = word;
		System.out.println("*****약어사전*****");
	}
	
	public void writeView() {
		System.out.println("약어: " + this.word);
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
		System.out.println("원어: " + this.definition);
		System.out.println("시기: " + this.year + "년");
	}
	
}

public class Problem9 {
	public static void main(String[] args) {
		new SubEntry("OOP","Object Oriented Programming", 1991).writeView();
	}
}
