package main;

public class Main {

	public static void main(String[] args) {
		Account ac1 = new Account("°­µ¿ÇÏ", "100-08-233823", 1000);
		ac1.deposit(2000);
		System.out.println(ac1.balance);

		ac1.withdraw(1000);
		System.out.println(ac1.balance);
	}

}
