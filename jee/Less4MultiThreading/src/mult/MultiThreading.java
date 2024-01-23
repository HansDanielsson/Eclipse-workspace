package mult;

import java.util.Scanner;

public class MultiThreading {

	public static void main(String[] args) {
		Scanner inputReader = new Scanner(System.in);
		String userinput;

		Chef chef = new Chef();
		Entry comingcustomers1 = new Entry();
		Entry comingcustomers2 = new Entry();
		Attender attender1 = new Attender(0);
		// Attender attender2 = new Attender(1);

		chef.start();
		comingcustomers1.start();
		comingcustomers2.start();
		attender1.start();
		// attender2.start();

		// Stop with any key, except just Enter
		while (true) {
			userinput = inputReader.next();
			chef.end();
			comingcustomers1.end();
			comingcustomers2.end();
			attender1.end();
			// attender2.end();
			System.exit(0);
		}
	}
}