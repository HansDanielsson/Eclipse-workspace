package testing;

import java.util.Scanner;

public class InputText {

	public static void main(String[] args) {
		int a;
		float b;
		String s;
		System.out.print("Enter a string :");
		try (Scanner in = new Scanner(System.in)) {
			s = in.nextLine();
			System.out.println("You entered string:" + s + ":");

			System.out.print("Enter a string :");
			s = in.nextLine();
			System.out.println("You entered string:" + s + ":");

			System.out.print("Enter an integer :");
			a = in.nextInt();
			System.out.println("You entered integer :" + a);

			System.out.print("Enter a float :");
			b = in.nextFloat();
		}
		System.out.println("You entered float :" + b);
	}
}