package exception;

public class CreditCard {
	private double creditavailable;
	private double limit;
	private int number;

	public CreditCard(int number, double limit) throws InvalidCreditCardNumber {
		this.number = number;
		this.creditavailable = limit;
		this.limit = limit;
	}

	public void paidCreditCard(double amount) {
		creditavailable += amount;
	}

	public void buy(double amount) throws ExceededCreditCardLimitException {
		if (amount <= creditavailable) {
			creditavailable -= amount;
		} else {
			double exceeded = amount - creditavailable;
			throw new ExceededCreditCardLimitException(exceeded);
		}
	}

	public String getCreditState() {
		return "Credit Available: $" + creditavailable + " Credit Limit: $" + limit;
	}

	public double getCreditAvailable() {
		return creditavailable;
	}

	public double getLimit() {
		return limit;
	}

	public int getNumber() {
		return number;
	}
}