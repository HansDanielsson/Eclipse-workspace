/**
 * 
 */
package brillpackage;

/**
 * @author Hans
 *
 */
public class Brilliant {
	static int enigma = 0;
	String name;
	int age;

	Brilliant(String name, int age) {
		this.name = name;
		this.age = age;
		enigma++;
	}

	public void doMagic(int trick) {
		Brilliant.enigma += trick;
	}

	public static int getEnigma() {
		return enigma;
	}

	public static void setEnigma(int enigma) {
		Brilliant.enigma = enigma;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Brilliant sherry = new Brilliant("you", 24);
		System.out.println(enigma);
		sherry.doMagic(679);
		Brilliant suki = new Brilliant("anonymous", 24);
		suki.doMagic(12);
		System.out.println(enigma);
	}
}