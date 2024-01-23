package module;

public class Pond {

	public static void main(String[] args) {
		Frog peppo = new Frog("Peppo");
		Frog pepe = new Frog("Pepe", 10, 15);
		Frog peepaw = new Frog("Peepaw", 4.6, 5);
		Frog myfroggy = new Frog("MyFroggy", 13, 30);

		Fly flysex = new Fly(6);

		System.out.println("2: " + peppo);
		// 3)
		peppo.eat(flysex);
		System.out.println("4: " + flysex);
		// 5)
		peppo.grow(8);
		// 6)
		peppo.eat(flysex);
		System.out.println("7: " + flysex);
		System.out.println("8: " + peppo);
		System.out.println("9: " + myfroggy);
		// 10)
		peepaw.grow(4);
		System.out.println("11: " + peepaw);
		System.out.println("12: " + pepe);
	}
}