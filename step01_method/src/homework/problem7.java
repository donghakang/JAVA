package homework;
/*
 * 
 * [문제7]다중클래스를 만들고 setter & getter를 이용하여 다음을 완성하시오
(1)클래스명:  BookShop
    필드명 : -name:String   (책이름)
                -author:String   (저자) 
                -price:int          (가격) 
    메서드명 : +setBook(bname:String,  author:String, price:int):void
                   +viewBook():void
                   +setter & getter
(2)조건
    1) Test7클래스의 main()메서드에서 BookShop 클래스로 객체 ob를 만든다
    2) setBook("자바완성","홍길동",25000)로 값을 대입한후 viewBook()메서드로 출력한다
    3)  setName("JSP잡기"),  setAuthor("이순신"), setPrice(3500)로 값을 대입한후
         getName(), getAuthor(), getPrice()로 출력한다

[출력화면]
책이름 : 자바완성
저  자 : 홍길동
가  격 : 25000원

책이름 : JSP잡기
저  자 : 이순신
가  격 : 35000원
 

 */



class BookShop{
	String name;
	String author;
	int price;
	
	public void setBook(String name, String author, int price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public void viewBook() {
		System.out.println("책이름: " + this.name);
		System.out.println("저  자: " + this.author);
		System.out.println("가  격: " + this.price);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}
	
}


public class problem7 {
	public static void main(String[] args) {
		BookShop ob = new BookShop();
		ob.setBook("자바완성", "홍길동", 25000);
		ob.viewBook();
		
		System.out.println();
		ob.setName("JSP잡기");
		ob.setAuthor("이순신");
		ob.setPrice(3500);
		System.out.println("책이름: " + ob.getName());
		System.out.println("저  자: " + ob.getAuthor());
		System.out.println("가  격: " + ob.getPrice());
	}
}
