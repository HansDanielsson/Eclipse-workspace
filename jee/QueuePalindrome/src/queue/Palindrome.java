package queue;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		LinkedQueue<Character> lq = new LinkedQueue<>();
		LinkedStack<Character> ls = new LinkedStack<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ange palidrom texten: ");

		String pali = sc.nextLine();
		sc.close();
		System.out.println("texten var: " + pali);
		char[] palichar = pali.toLowerCase().toCharArray();
		for (char pach : palichar) {
			switch (pach) {
			case '!', ',', '.', '?', '-', '*':
				break;
			default:
				lq.enqueue(pach);
				ls.push(pach);
				break;
			}
		}
		boolean lika = true;
		while (lq.isEmpty()) {
			if (!lq.dequeue().equals(ls.pop())) {
				lika = false;
			}
		}
		if (lika) {
			System.out.println("Texten är ett palidrom.");
		} else {
			System.out.println("Inte lika.");
		}
	}
}