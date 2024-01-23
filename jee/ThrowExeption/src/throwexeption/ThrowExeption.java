package throwexeption;

public class ThrowExeption {

	private static int countLenght(String namn) throws IllegalArgumentException {
		if ((namn == null) || (namn.equals("hej"))) {
			throw new IllegalArgumentException();
		}
		return namn.length();
	}

	public static void main(String[] args) {
		String namn;
		namn = "Hej";
		int l = countLenght(namn);
		if (l == 3) {
			System.out.println("Nu ere 3 tecken");
		}
		namn = null;
		try {
			l = countLenght(namn);
			System.out.println("Null ger " + l);
		} catch (Exception e) {
			System.out.println("Nu exeptions");
		}
	}
}