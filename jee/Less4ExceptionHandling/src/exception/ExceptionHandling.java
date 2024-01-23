package exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			// Limit $2000.00
			CreditCard card = new CreditCard(62656565, 2000.0);
			System.out.println("Credit Card State:");
			System.out.println(card.getCreditState());

			try {
				System.out.println("\n\tBuying $1500.00");
				card.buy(1500.00);

				System.out.println("\nCredit Card State:");
				System.out.println(card.getCreditState());

				System.out.println("\n\tBuying $800.00\n");
				card.buy(800.00);
			} catch (ExceededCreditCardLimitException e) {
				System.out.println("Invalid Buy, Limit Exceeded by " + e.getExceededAmount());
				e.printStackTrace(); // Print Stack Trace
			}
		} catch (InvalidCreditCardNumber e) {

		}
	}
}