package fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerFile {

	public static void main(String[] args) throws Exception {
		String data;
		Scanner input = null;
		// Create a List of Clients. Create all needed classes.
		List<PersonInfo> client = new ArrayList<>();

		// Token per Token
		try {
			File myObj = new File("src/fileio/clients_info.txt");
			input = new Scanner(myObj);
			// Read file clients_info.txt, in every line there is a client information.
			while (input.hasNext()) {
				data = input.nextLine();
				String[] token = data.split(" ");
				PersonInfo per = new PersonInfo(token[0], token[1], token[2]);
				client.add(per);
			}

			// Each client has name, email and phone. Separated with spaces.

			// Create a Client object and add it to the clients list.
		} finally {
			if (input != null) {
				input.close();
			}
		}

		// Serializable
		ObjectOutputStream savecontants = null;
		try {
			savecontants = new ObjectOutputStream(new FileOutputStream("src/fileio/client_info_backup.txt"));
			// Save the contacts list object on a file named client_info_backup.txt

			while (!client.isEmpty()) {
				PersonInfo p = client.get(client.size() - 1);
				savecontants.writeObject(p);
				client.remove(client.size() - 1);
			}
		} finally {
			if (savecontants != null) {
				savecontants.close();
			}
		}

		// Deserialize

		ObjectInputStream restoring = null;
		PersonInfo pin;
		try {
			restoring = new ObjectInputStream(new FileInputStream("src/fileio/client_info_backup.txt"));
			// Restore the Contact List.
			while ((pin = (PersonInfo) restoring.readObject()) != null) {
				client.add(pin);
			}
			// Print all the contacts.
		} catch (Exception e) {

		} finally {
			if (restoring != null) {
				restoring.close();
			}
		}
		while (!client.isEmpty()) {
			pin = client.get(0);
			client.remove(0);
			System.out.println("Info: " + pin);
		}
	}
}