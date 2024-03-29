package coding;

public class BST<T extends Comparable<? super T>> {

	/*
	 * Do not add new instance variables or modify existing ones.
	 */
	private BSTNode<T> root;
	private int size;

	/*
	 * Do not add a constructor.
	 */

	/**
	 * Returns whether or not data matching the given parameter is contained within
	 * the tree.
	 *
	 * This should be done recursively.
	 *
	 * Hint: Should you use value equality or reference equality?
	 *
	 * Must be O(log n) for best and average cases and O(n) for worst case.
	 *
	 * @param data The data to search for. You may assume data is never null.
	 * @return true if the parameter is contained within the tree, false otherwise.
	 */
	public boolean contains(T data) {
		// WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
		BSTNode<T> saveRoot = root;
		boolean result = false;
		int compRes = data.compareTo(root.getData());
		if (compRes == 0) {
			result = true;
		} else {
			root = (compRes < 0) ? root.getLeft() : root.getRight();
			if (root != null) {
				result = contains(data);
			}
		}
		root = saveRoot;
		return result;
	}

	/**
	 * Removes and returns the data from the tree matching the given parameter.
	 *
	 * This must be done recursively.
	 *
	 * There are 3 cases to consider: 1: The node containing the data is a leaf (no
	 * children). In this case, simply remove it. 2: The node containing the data
	 * has one child. In this case, simply replace it with its child. 3: The node
	 * containing the data has 2 children. Use the SUCCESSOR to replace the data.
	 * You should use recursion to find and remove the successor (you will likely
	 * need an additional helper method to handle this case efficiently).
	 *
	 * Do NOT return the same data that was passed in. Return the data that was
	 * stored in the tree.
	 *
	 * Hint: Should you use value equality or reference equality?
	 *
	 * Must be O(log n) for best and average cases and O(n) for worst case.
	 *
	 * @param data The data to remove. You may assume that data is never null.
	 * @return The data that was removed.
	 * @throws java.util.NoSuchElementException If the data is not in the tree.
	 */
	public T remove(T data) {
		// WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
		T removeData = null;
		BSTNode<T> tmp;
		if (root != null) {
			BSTNode<T> saveRoot = root;
			BSTNode<T> left = root.getLeft();
			BSTNode<T> right = root.getRight();
			int compRes = data.compareTo(root.getData());
			if (compRes == 0) {
				removeData = root.getData();
				if ((left == null) && (right == null)) {
					root.setData(null);
					saveRoot = null;
				} else if ((left != null) && (right == null)) {
					root.setData(left.getData());
					root.setLeft(left.getLeft());
					root.setRight(left.getRight());
				} else if (left == null) {
					root.setData(right.getData());
					root.setLeft(right.getLeft());
					root.setRight(right.getRight());
				} else {
					tmp = root.getRight();
					while (tmp.getLeft() != null) {
						tmp = tmp.getLeft();
					}
					root.setData(tmp.getData());
					tmp.setData(null);
					tmp = null;
				}
			} else {
				tmp = (compRes < 0) ? left : right;
				if (tmp == null) {
					throw new IllegalArgumentException();
				} else {
					root = tmp;
					removeData = remove(data);
				}
			}
			root = saveRoot;
		}
		return removeData;
	}

	public T remove2(T data) {
		T removeData = null;
		if (root == null) {
			throw new IllegalArgumentException();
		} else {
			BSTNode<T> current = root;
			BSTNode<T> left;
			BSTNode<T> right;
			BSTNode<T> tmp = null;
			BSTNode<T> senti = current;
			int compRes;
			boolean found = true;
			while (found) {
				compRes = data.compareTo(current.getData());
				left = current.getLeft();
				right = current.getRight();
				if (compRes == 0) {
					found = false;
					removeData = current.getData();
					if ((left == null) && (right == null)) {
						if (root == current) {
							root = null;
						} else if (senti.getLeft() == current) {
							senti.setLeft(null);
						} else if (senti.getRight() == current) {
							senti.setRight(null);
						}
					} else if ((left != null) && (right == null)) {
						current.setData(left.getData());
						current.setLeft(left.getLeft());
						current.setRight(left.getRight());
					} else if (left == null) {
						current.setData(right.getData());
						current.setLeft(right.getLeft());
						current.setRight(right.getRight());
					} else {
						senti = current;
						tmp = current.getRight();
						while (tmp.getLeft() != null) {
							senti = tmp;
							tmp = tmp.getLeft();
						}
						current.setData(tmp.getData());
						current.setRight(tmp.getRight());
						if (senti.getLeft() == tmp) {
							senti.setLeft(null);
						} else if (senti.getRight() == tmp) {
							senti.setRight(null);
						}
					}
				} else {
					senti = current;
					current = (compRes < 0) ? left : right;
					if (current == null) {
						throw new IllegalArgumentException();
					}
				}
			}
		}
		return removeData;
	}

	/**
	 * Returns the root of the tree.
	 *
	 * For grading purposes only. You shouldn't need to use this method since you
	 * have direct access to the variable.
	 *
	 * @return The root of the tree
	 */
	public BSTNode<T> getRoot() {
		// DO NOT MODIFY THIS METHOD!
		return root;
	}

	/**
	 * Returns the size of the tree.
	 *
	 * For grading purposes only. You shouldn't need to use this method since you
	 * have direct access to the variable.
	 *
	 * @return The size of the tree
	 */
	public int size() {
		// DO NOT MODIFY THIS METHOD!
		return size;
	}
}