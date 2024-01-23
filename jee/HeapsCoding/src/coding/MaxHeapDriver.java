package coding;

public class MaxHeapDriver {

	public static void main(String[] args) {

		MaxHeap<Integer> maxHeap = new MaxHeap<>();
		maxHeap.insert(42);
		maxHeap.insert(35);
		maxHeap.insert(28);
		maxHeap.insert(21);
		maxHeap.insert(14);
		maxHeap.insert(7);
		maxHeap.insert(0);

		System.out.println(maxHeap.remove());
		System.out.println(maxHeap.remove());
		System.out.println(maxHeap.remove());
		System.out.println(maxHeap.remove());
		System.out.println(maxHeap.remove());
		System.out.println(maxHeap.remove());
		System.out.println(maxHeap.remove());

	}
}