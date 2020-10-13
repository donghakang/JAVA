package homework;
/*
 * 
 * [����7]����Ŭ������ ����� setter & getter�� �̿��Ͽ� ������ �ϼ��Ͻÿ�
(1)Ŭ������:  BookShop
    �ʵ�� : -name:String   (å�̸�)
                -author:String   (����) 
                -price:int          (����) 
    �޼���� : +setBook(bname:String,  author:String, price:int):void
                   +viewBook():void
                   +setter & getter
(2)����
    1) Test7Ŭ������ main()�޼��忡�� BookShop Ŭ������ ��ü ob�� �����
    2) setBook("�ڹٿϼ�","ȫ�浿",25000)�� ���� �������� viewBook()�޼���� ����Ѵ�
    3)  setName("JSP���"),  setAuthor("�̼���"), setPrice(3500)�� ���� ��������
         getName(), getAuthor(), getPrice()�� ����Ѵ�

[���ȭ��]
å�̸� : �ڹٿϼ�
��  �� : ȫ�浿
��  �� : 25000��

å�̸� : JSP���
��  �� : �̼���
��  �� : 35000��
 

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
		System.out.println("å�̸�: " + this.name);
		System.out.println("��  ��: " + this.author);
		System.out.println("��  ��: " + this.price);
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
		ob.setBook("�ڹٿϼ�", "ȫ�浿", 25000);
		ob.viewBook();
		
		System.out.println();
		ob.setName("JSP���");
		ob.setAuthor("�̼���");
		ob.setPrice(3500);
		System.out.println("å�̸�: " + ob.getName());
		System.out.println("��  ��: " + ob.getAuthor());
		System.out.println("��  ��: " + ob.getPrice());
	}
}
