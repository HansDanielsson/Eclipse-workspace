package testavlfsats;

public class TestAvlfSats {

	private static int enRutin(String name) {
		int result;
		if (name == null) {
			result = 20;
		} else {
			result = 30;

			if (name.isBlank()) {
				result = 60;
			}

			if (name.isEmpty()) {
				result = 70;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		var tal1 = enRutin(null);
		var tal2 = enRutin("");
		var tal3 = enRutin("    ");
		System.out.println("Tal 1 " + tal1);
		System.out.println("Tal 2 " + tal2);
		System.out.println("Tal 3 " + tal3);
	}
}