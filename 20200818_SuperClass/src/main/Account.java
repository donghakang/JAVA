package main;

public class Account {
	String name;
	String num;
	int balance;
	
	public Account(String name, String num, int balance) {
		this.name = name;
		this.num = num;
		this.balance = balance;
	}
	
	int withdraw(int amount) {
		if (amount > balance) {
			System.out.println("�ܾ��� �����մϴ� ");
			return 0;
		} else {
			balance -= amount;
			return amount;
		}
	}
	
	void deposit(int amount) {
		balance += amount;
	}
	
	
}
