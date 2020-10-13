package objectex;

// Setter & Getter: 필드(멤버변수)하나당 하나씩 값을 대입하는 setter와 값을 리턴하는 getter

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
		
		ob.setName("강동하");
		ob.setAge(26);
		ob.setTall(110.34);
		
		System.out.println("이름: " + ob.getName());
		System.out.println("나이: " + ob.getAge() + "세");
		System.out.println("신장: " + ob.getTall() + "cm");
		
	}
}
