package accounts;

import customer.Customer;

public class BankAccount {
	double balance;
    // customer whose bankaccount this is.
	Customer customer;
    //counts the number of account made. Shared across all instances
    static int counter = 10000;
    //instance variable of account number
    int accountNumber;
    
    BankAccount(String name, int age) {
	balance = 0;
	customer = new Customer(name, age);
	counter++;
	accountNumber = counter; // first account will have accnt number = 10001
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BankAccount a1 = new BankAccount("x", 35);
		BankAccount a2 = new BankAccount("abc", 16);
		System.out.println("person " + a1.customer.getName() + " " + a1.accountNumber);
		System.out.println("person " + a2.customer.getName() + " " + a2.accountNumber);
		System.out.println(BankAccount.counter);
	}
}