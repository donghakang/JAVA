package main;

public class CheckingCard extends Account {
	public CheckingCard(String name, String num, int balance) {
		super(name, num, balance);
	}

	String cardNo;
	
	int pay(int amount) {
		if (balance < amount) {
			System.out.println("������ �����ϱ����� ���� �����մϴ�.");
			return 0;
		} else {
			return withdraw(amount);
		}
	}
}
