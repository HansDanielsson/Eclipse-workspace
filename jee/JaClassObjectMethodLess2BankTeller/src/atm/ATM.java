/**
 * 
 */
package atm;

import bank.BankAccount;

/**
 * @author Hans
 *
 */
public class ATM {
	private int id;

	public ATM(int inid) {
		id = inid;
	}

	public void withdraw(BankAccount account, double amount) {
		if (account.withdraw(amount)) {
			System.out.println("Successful withdraw on ATM of $" + amount);
		} else {
			System.out.println("Error!");
		}
	}

	public int getId() {
		return id;
	}

	private void setId(int inid) {
		id = inid;
	}
}