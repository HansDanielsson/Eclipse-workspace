package multiple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientThread  extends Thread {
	
	private ChatServer server;
	protected Socket socket;
	public int id;
	
	public ClientThread(Socket clientSocket, ChatServer server, int id) {
		this.socket = clientSocket;
		this.server = server;
		this.id = id;
	}

	@Override
	public void run() {
		InputStream inp = null;
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			inp = socket.getInputStream();
			in = new BufferedReader(new InputStreamReader(inp));
			out = new PrintWriter(socket.getOutputStream());
		} catch (IOException e) {
			return;
		}
		out.println("Welcome user#" + id);
		out.flush();

		String line;
		try {
			while ((line = in.readLine()) != null) {
				System.out.println("Message received from user#" + id + ": " + line);
				out.println(line);
				out.flush();
			}
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		server.removeClient(this);
		server = null;
	}
}