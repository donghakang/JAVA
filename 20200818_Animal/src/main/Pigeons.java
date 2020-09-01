package main;

import Animal.Animal;

public class Pigeons extends Animal {
	int wings;
	
	Pigeons() {
		legs = 2;
		name = "ºñµÑ±â";
		wings = 2;
		age = 2;
	}
	
	void fly() {
		System.out.println(wings + "°³ÀÇ ³¯°³¸¦ °¡Áö°í Çªµåµæ Çªµåµæ");
	}
	
}
