package trees;

public class BTreeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9092243617003235439L;

	/**
	 * Constructor without parameters
	 */
	public BTreeException() {
		super();
	}

	/**
	 * Constructor that receives the exception message
	 * @param message
	 */
	public BTreeException(String message) {
		super(message);
	}
}