package main;

public class CheckingCard extends Account {
	public CheckingCard(String name, String num, int balance) {
		super(name, num, balance);
	}

	String cardNo;
	
	int pay(int amount) {
		if (balance < amount) {
			System.out.println("물건을 구매하기위한 돈이 부족합니다.");
			return 0;
		} else {
			return withdraw(amount);
		}
	}
}
