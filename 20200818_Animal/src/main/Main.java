package main;

public class Main {

	public static void main(String[] args) {
		Snake s = new Snake();
		s.hiss();
		
		System.out.println();

		Tiger t = new Tiger();
		t.call();
		System.out.println();

		
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		d1.bark();
		d1.call();
		d1.setBreed("���޶�Ͼ�");
		d2.setBreed("��Ƽ��");
		d3.setBreed("�ҵ�");		
		d3.myBreed();
		System.out.println();

		
		
		Pigeons b = new Pigeons();
		b.fly();
		b.call();
		System.out.println();

	}

}
