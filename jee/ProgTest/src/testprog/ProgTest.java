package testprog;

public class ProgTest {

	public static void show(Object o) {
		System.out.println("Object");
	}

	public static void show(String o) {
		System.out.println("String");
	}

	public static void main(String[] args) {
		String ref1 = null;
		Object ref2 = null;

		show(ref1);

		show(ref2);

		show("Hi");

		show(new Object());

		show(null);
	}
}