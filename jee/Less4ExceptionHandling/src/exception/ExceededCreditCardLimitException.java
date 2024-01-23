package exception;

public class ExceededCreditCardLimitException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double exceededamount;

	public ExceededCreditCardLimitException(double exceededamount) {
		this.exceededamount = exceededamount;
	}

	public double getExceededAmount() {
		return exceededamount;
	}
}