package multiple;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
	public int port;
	private int ids;
	private List<ClientThread> clients;
	private ServerSocket serverSocket = null;

	public ChatServer(int port) {
		this.port = port;
		ids = 1;
		clients = new ArrayList<>();
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void start() {
		Socket socket = null;
		ClientThread newClient = null;
		System.out.println("Waiting for clients to connect...");
		while (true) {
			try {
				socket = serverSocket.accept();
			} catch (IOException e) {
				System.out.println("I/O error: " + e);
			}
			// new thread for a client
			newClient = new ClientThread(socket, this, ids++);
			newClient.start();
			clients.add(newClient);
			newClient = null;
		}
	}

	public void removeClient(ClientThread clientClosed) {
		clients.remove(clientClosed);
		System.out.println("");
	}

	public static void main(String[] args) {
		try {
			System.out.println("Server IP: " + InetAddress.getLocalHost().getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println("UnknownHostException: " + e);
		}
		int port = 12345;
		ChatServer chatServer = new ChatServer(port);
		chatServer.start();
	}
}