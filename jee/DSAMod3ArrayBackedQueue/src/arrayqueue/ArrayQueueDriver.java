package arrayqueue;

public class ArrayQueueDriver {

	public static void main(String[] args) {
		ArrayQueue<Integer> lista = new ArrayQueue<>();
		for (int i = 0; i < 15; i++) {
			lista.enqueue(i);
			if ((i + 1) % 4 == 0) {
				System.out.println("Deq: " + lista.dequeue());
			}
		}
	}
}