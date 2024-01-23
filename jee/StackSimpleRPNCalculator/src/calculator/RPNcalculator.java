package calculator;

import java.util.Stack;

public class RPNcalculator {

	/*
	 * Implement a simple RPN calculator with an Stack this is a possible solution,
	 * others are also possible
	 */
	public static int calculate(String ops[]) {
		int result = 0;
		int x;
		int y;
		String operators = new String("+-/*");
		// Define a Stack
		Stack<Integer> stackNumber = new Stack<>();

		for (String op : ops) {
			// Implement here your algorithm
			if (operators.contains(op)) {
				y = stackNumber.pop();
				x = stackNumber.pop();
				if (op.compareTo("+") == 0) {
					result = x + y;
				} else if (op.compareTo("-") == 0) {
					result = x - y;
				} else if (op.compareTo("*") == 0) {
					result = x * y;
				} else if (op.compareTo("/") == 0) {
					if (y == 0) {
						throw new IllegalArgumentException("Div zero: " + op);
					}
					result = x / y;
				} else {
					throw new IllegalArgumentException("Unexpected value: " + op);
				}
				stackNumber.push(result);
			} else {
				stackNumber.push(Integer.parseInt(op));
			}
		}

		// if the stack is not empty, result= stack.pop()
		// else result = 0
		if (stackNumber.isEmpty()) {
			result = 0;
		} else {
			result = stackNumber.pop();
		}
		return result;
	}

	public static void main(String[] args) {

		/*
		 * The main program should print
		 * 5 3 + =8
		 * 5 3 - = 2
		 * 2 1 12 3 / - + = -1
		 * 3 2 * 11 - = -5
		 */

		String[] argu = new String[] { "5", "3", "+" };
		int result = calculate(argu);
		System.out.println("5" + " 3" + " +" + " =" + result);
		result = calculate(new String[] { "5", "3", "-" });
		System.out.println("5" + " 3" + " -" + " = " + result);
		result = calculate(new String[] { "2", "1", "12", "3", "/", "-", "+" });
		System.out.println("2" + " 1" + " 12" + " 3" + " /" + " -" + " +" + " = " + result);
		result = calculate(new String[] { "3", "2", "*", "11", "-" });
		System.out.println("3" + " 2" + " *" + " 11" + " -" + " = " + result);
	}
}