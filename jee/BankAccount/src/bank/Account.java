package bank;

public class Account {

	public static int nextAccount = 1;

	public String name;
	public int accountNumber;
	public int balance;

	public Account(String n) {
		name = n;
		accountNumber = nextAccount;
		balance = 0;

		nextAccount++;
	}

	public Account(String n, int b) {
		name = n;
		accountNumber = nextAccount;
		balance = b;

		nextAccount++;
	}

	public void deposit(int b) {
		balance += b;
	}

	public boolean withdraw(int b) {
		var result = false;
		if (balance >= b) {
			balance -= b;
			result = true;
		}
		return result;
	}

	public String toString() {
		return "name: " + name + "\taccount number: " + accountNumber + "\tbalance: " + balance;
	}
}