package main;

public class Vehicle {
	int wheel;
	int weight;
	int capacity;
	String model;
	String company;
	
	void ride() {
		System.out.println("작동중 입니다.");
	}
	
	void print() {
		System.out.println(company +"의 " + model + "입니다.");
	}
	
	
}
