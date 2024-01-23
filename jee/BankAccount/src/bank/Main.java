package bank;

public class Main {

	public static void main(String[] args) {
		Account alice = new Account("Alice", 100);
		Account bob = new Account("Bob");

		System.out.println(alice);
		System.out.println(bob);
		alice.withdraw(10);
		do {
			System.out.println("Alice balance : " + alice.balance);
		} while (alice.withdraw(10));
	}
}