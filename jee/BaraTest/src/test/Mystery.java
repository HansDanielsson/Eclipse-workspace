package test;

public class Mystery {
	
	public static void mystery(Node cur) {
		if (cur == null || cur.next == null) {
			System.out.println("CS 1332 is cool!");
			return;
		}
		if (cur.next != null && cur.data.length() < 5) {
			mystery(cur.next.next);
			System.out.println(cur.data.length());
			mystery(cur.prev);
		} else if (cur.data.length() % 2 == 1) {
			System.out.println(cur.data);
			mystery(cur.next);
		} else if (cur.data.length() % 2 == 0) {
			mystery(cur.next.next);
			System.out.println(cur.data.length());
		}

	}

	public static void main(String[] args) {

		Node head = new Node("Mary", null, null);
		Node n1 = new Node("Ivan", null, head);
		Node n2 = new Node("Stephanie", null, n1);
		Node n3 = new Node("Andrew", null, n2);
		Node n4 = new Node("Miguel", null, n3);
		Node n5 = new Node("Adrianna", null, n4);
		head.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		mystery(head);
	}
}
