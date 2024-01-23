package errors;

public class TestErrors {

	public static void caseSensitiveErrors() {
		boolean t = true;
		int number = 2;
		if (number > 1 || !t) {
			t = false;
		}
	}

	public static void main(String[] args) {
		caseSensitiveErrors();
	}
}