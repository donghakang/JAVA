package objectex;

class Person {
	public String name;
	public int age;
	public float score;
	
	public void setPerson(String name, int age, float score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public void viewPerson() {
		System.out.println("�̸�: " + this.name);
		System.out.println("����: " + this.age);
		System.out.println("����: " + this.score);
	}
}

public class ObjectEx1 {
	public static void main(String[] args) {
		Person ob1 = new Person();
		ob1.setPerson("������", 28, 73.0f);
		ob1.viewPerson();
	}

}
