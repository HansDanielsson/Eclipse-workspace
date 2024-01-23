package queue;

public class NaturalQueue extends Queue {

	public NaturalQueue(int numElements) {
		super(numElements);
	}

	@Override
	public void enqueue(int element) {
		if (element >= 0) {
			super.enqueue(element);
		}
	}
}