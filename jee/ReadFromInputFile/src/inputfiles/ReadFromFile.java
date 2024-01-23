package inputfiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
	public static void readFile(String fileName) {
		if (fileName != null) {
			try {
				String line = "Hejsan";
				var scanner = new Scanner(new File(fileName));
				while (scanner.hasNextLine()) {
					line = scanner.nextLine();
				}
				System.out.println("Sissta raden " + line);
				scanner.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
}