package objectex;

// Setter & Getter: �ʵ�(�������)�ϳ��� �ϳ��� ���� �����ϴ� setter�� ���� �����ϴ� getter

class Member {
	public String name; 
	public int age;
	public double tall;
	
	// name
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// age
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// tall
	public double getTall() {
		return tall;
	}
	
	public void setTall(double tall) {
		this.tall = tall;
	}
}

public class ObjectEx3 {
	public static void main(String[] args) {
		Member ob = new Member();
		
		ob.setName("������");
		ob.setAge(26);
		ob.setTall(110.34);
		
		System.out.println("�̸�: " + ob.getName());
		System.out.println("����: " + ob.getAge() + "��");
		System.out.println("����: " + ob.getTall() + "cm");
		
	}
}
