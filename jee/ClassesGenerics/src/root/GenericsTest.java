package root;

public class GenericsTest {

	public static void main(String[] args) {
		Integer a = new Integer(65);
		int b = 65;
		String foo = new String("A new String");

		MyClass<Integer> one = new MyClass<>(a);
		System.out.println(one.get());

		MyClass<Integer> two = new MyClass<>(b);
		System.out.println(two.get());

		MyClass<String> first = new MyClass<>(foo);
		System.out.println(first.get());

		MyClass<String> second = new MyClass<>("A new String");
		System.out.println(second.get());

		// If no equals method is provided,
		// equals is the one implemented by the class Object
		// that compares references
		// So, you should override the equals method for this class
		if (one.equals(two))
			System.out.println("They are equal");
		else
			System.out.println("They are different");

		if (second.equals(first))
			System.out.println("They are equal");
		else
			System.out.println("They are different");
	}
}