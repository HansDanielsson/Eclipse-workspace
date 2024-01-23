package stack;

public class StackOverflowException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1065613537393920742L;

	public StackOverflowException(String message) {
		super(message);
	}
}