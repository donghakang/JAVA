package main;

import Animal.Animal;

public class Dog extends Animal {

	String breed;
	
	Dog() {
		legs = 4;
		name = "������";
		age  = 15;
	}
	
	void setBreed(String breed) {
		this.breed = breed;
	}
	
	void bark() {
		System.out.println("�ппппппппппп�");
	}
	
	void myBreed() {
		System.out.println("�� �������� ���� " + this.breed + " �Դϴ�");
	}
	
	@Override
	public void call() {
		super.call();
		System.out.println("������ ���� �� �ѱ� ������ ��Ƽ� ���� �����մϴ�.");
	}
}
