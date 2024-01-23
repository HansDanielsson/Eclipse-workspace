package main;

import atm.ATM;
import bank.BankAccount;
import bank.BankTeller;

public class Main {

	public static void main(String[] args) {
		BankAccount a = new BankAccount(1234, 100.00);
		BankAccount b = new BankAccount(12, 10);
		BankTeller john = new BankTeller();
		john.deposit(a, 100.00);
		john.transfer(a, b, 100.00);
		System.out.println("a = " + a.balance());
		System.out.println("b = " + b.balance());
		ATM xyz = new ATM(222);
		xyz.withdraw(a, 50.00);
	}
}