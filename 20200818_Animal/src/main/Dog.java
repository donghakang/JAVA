package main;

import Animal.Animal;

public class Dog extends Animal {

	String breed;
	
	Dog() {
		legs = 4;
		name = "∞ªæÛ¡„";
		age  = 15;
	}
	
	void setBreed(String breed) {
		this.breed = breed;
	}
	
	void bark() {
		System.out.println("ø–ø–ø–ø–ø–ø–ø–ø–ø–ø–ø–ø–");
	}
	
	void myBreed() {
		System.out.println("¿Ã ∞≠æ∆¡ˆ¿« ¡æ¿∫ " + this.breed + " ¿‘¥œ¥Ÿ");
	}
	
	@Override
	public void call() {
		super.call();
		System.out.println("∞≠æ∆¡ˆ ¡æµÈ ¡ﬂ «—±π ø°º≠¥¬ ∏ª∆º¡Ó∞° ¡¶¿œ ¿Ø∏Ì«’¥œ¥Ÿ.");
	}
}
