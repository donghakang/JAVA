package main;

import Animal.Animal;

public class Pigeons extends Animal {
	int wings;
	
	Pigeons() {
		legs = 2;
		name = "��ѱ�";
		wings = 2;
		age = 2;
	}
	
	void fly() {
		System.out.println(wings + "���� ������ ������ Ǫ��� Ǫ���");
	}
	
}
