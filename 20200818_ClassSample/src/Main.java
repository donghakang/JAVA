
public class Main {
	public static void main (String[] args) {
		Dog d = new Dog();
		d.bark();
		
		// 틀린방법
//		d.age = 10;		
//		d.name = "애기";			// private 이라서 볼 수 없다.
	
		// 옳은 방법
		d.setAge(10);
		d.setName("애기");
	
		System.out.println(d.getAge());
		System.out.println(d.getName());
	}
	
	
	
}
