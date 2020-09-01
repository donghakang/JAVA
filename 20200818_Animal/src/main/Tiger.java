package main;

import Animal.Animal;

public class Tiger extends Animal {

	Tiger() {
		name = "È£·©ÀÌ";
		age  = 10;
		legs = 4;
	}
	
	void growl() {
		System.out.println("¾îÈåÈåÈåÈåÈåÈïÈå¤ÑÀ¸ÈïÈåÀ¸ÈåÀ¸ÀÀ");
	}

	void info() {
		System.out.println("Æ÷½ÄÀÚ´Â, Àý´ë·Î, ÀáµéÁö ¾Ê½À´Ï´Ù.");
	}
}
