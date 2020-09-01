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
		d1.setBreed("포메라니안");
		d2.setBreed("말티즈");
		d3.setBreed("불독");		
		d3.myBreed();
		System.out.println();

		
		
		Pigeons b = new Pigeons();
		b.fly();
		b.call();
		System.out.println();

	}

}
