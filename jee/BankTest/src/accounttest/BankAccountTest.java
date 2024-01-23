package accounttest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import account.BankAccount;

class BankAccountTest {

	BankAccount bankAccount;

	@BeforeEach
	void setUp() {
		bankAccount = new BankAccount();
	}

	@Test
	void testDeposit() {
		bankAccount.deposit(100);
		assertEquals(100, bankAccount.balance);
	}

	@Test
	void testWithdraw() {
		bankAccount.deposit(1000);
		bankAccount.withdraw(100);
		bankAccount.deposit(10);
		assertEquals(bankAccount.balance, 910);
	}

}
