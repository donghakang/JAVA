
public class Main {
	public static void main (String[] args) {
		Dog d = new Dog();
		d.bark();
		
		// Ʋ�����
//		d.age = 10;		
//		d.name = "�ֱ�";			// private �̶� �� �� ����.
	
		// ���� ���
		d.setAge(10);
		d.setName("�ֱ�");
	
		System.out.println(d.getAge());
		System.out.println(d.getName());
	}
	
	
	
}
