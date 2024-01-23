/**
 * 
 */
package bank;

/**
 * @author Hans
 *
 */
public class BankTeller {
	public void deposit(BankAccount account, double amount) {
		if (account.deposit(amount)) {
			System.out.println("Successful deposit of $" + amount);
		} else {
			System.out.println("Error!");
		}
	}

	public void withdraw(BankAccount account, double amount) {
		if (account.withdraw(amount)) {
			System.out.println("Successful withdraw of $" + amount);
		} else {
			System.out.println("Error!");
		}
	}

	public void transfer(BankAccount fromBank, BankAccount toBank, double amount) {
		if (fromBank.balance() / 2.0 >= amount) {
			fromBank.withdraw(amount);
			toBank.deposit(amount);
			System.out.println("Successful transfer of $" + amount);
		} else {
			System.out.println("Error!");
		}
	}
}