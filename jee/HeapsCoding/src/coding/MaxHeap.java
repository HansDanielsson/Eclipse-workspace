package coding;

public class MaxHeap<T extends Comparable<? super T>> {
	
	/*
	 * The initial capacity of the MaxHeap when created with the default
	 * constructor.
	 *
	 * DO NOT MODIFY THIS VARIABLE!
	 */
	public static final int INITIAL_CAPACITY = 13;

	/*
	 * Do not add new instance variables or modify existing ones.
	 */
	private T[] backingArray;
	private int size;

	/**
	 * This is the constructor that constructs a new MaxHeap.
	 *
	 * Recall that Java does not allow for regular generic array creation, so
	 * instead we cast a Comparable[] to a T[] to get the generic typing.
	 */
	public MaxHeap() {
		// DO NOT MODIFY THIS METHOD!
		backingArray = (T[]) new Comparable[INITIAL_CAPACITY];
	}

	/**
	 * Removes and returns the max item of the heap. As usual for array-backed
	 * structures, be sure to null out spots as you remove. Do not decrease the
	 * capacity of the backing array.
	 *
	 * Method should run in O(log n) time.
	 *
	 * You may assume that the heap is not empty.
	 *
	 * @return The data that was removed.
	 */
	public T remove() {
		// WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
		T item = null;
		if (backingArray[1] != null) {
			item = backingArray[1];
			int last = backingArray.length - 1;
			while ((last > 0) && (backingArray[last] == null)) {
				last--;
			}
			backingArray[1] = backingArray[last];
			backingArray[last] = null;
			size--;
			maxHeapify(1);
		}
		return item;
	}

	private void swap(int fpos, int spos) {
		T tmp = backingArray[fpos];
		backingArray[fpos] = backingArray[spos];
		backingArray[spos] = tmp;
	}

	private void maxHeapify(int pos) {
		if (pos > (size / 2) && pos <= size) {
			return;
		}
		if ((backingArray[pos] != null) && (backingArray[2 * pos] != null) && (backingArray[2 * pos + 1] != null)) {
			if ((backingArray[pos].compareTo(backingArray[2 * pos]) < 0)
					|| (backingArray[pos].compareTo(backingArray[2 * pos + 1]) < 0)) {
				if (backingArray[2 * pos].compareTo(backingArray[2 * pos + 1]) > 0) {
					swap(pos, 2 * pos);
					maxHeapify(2 * pos);
				} else {
					swap(pos, 2 * pos + 1);
					maxHeapify(2 * pos + 1);
				}
			}
		}
	}

	public void insert(T element) {
		backingArray[++size] = element;
		/**
		int current = size;
		if (current > 1) {
			while (backingArray[current].compareTo(backingArray[current / 2]) > 0) {
				swap(current, current / 2);
				current = current / 2;
			}
		}
		*/
	}

	/**
	 * Returns the backing array of the heap.
	 *
	 * For grading purposes only. You shouldn't need to use this method since you
	 * have direct access to the variable.
	 *
	 * @return The backing array of the list
	 */
	public T[] getBackingArray() {
		// DO NOT MODIFY THIS METHOD!
		return backingArray;
	}

	/**
	 * Returns the size of the heap.
	 *
	 * For grading purposes only. You shouldn't need to use this method since you
	 * have direct access to the variable.
	 *
	 * @return The size of the list
	 */
	public int size() {
		// DO NOT MODIFY THIS METHOD!
		return size;
	}
}