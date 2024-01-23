package trees;

public class NonRecursiveLBTree<E> implements BTree<E> {

	// Attributes (non-recursive definition)
	private E info;
	private BTree<E> leftBTree;
	private BTree<E> rightBTree;

	/*
	 * Constructor of an empty tree
	 */
	public NonRecursiveLBTree() {
		info = null;
		leftBTree = null;
		rightBTree = null;
	}

	/*
	 * Constructor
	 */
	public NonRecursiveLBTree(E info) {
		this.info = info;
		leftBTree = null;
		rightBTree = null;
	}

	/*
	 * Checks if the tree is empty
	 */
	public boolean isEmpty() {
		return (info == null);
	}

	/*
	 * Returns the information stored in the node
	 */
	public E getInfo() throws BTreeException {
		if (isEmpty()) {
			throw new BTreeException("Empty trees do not have info");
		}
		return info;
	}

	/*
	 * Returns left and right subtrees
	 */
	public BTree<E> getLeft() throws BTreeException {
		if (isEmpty()) {
			throw new BTreeException("Empty trees to left path");
		}
		return leftBTree;
	}

	public BTree<E> getRight() throws BTreeException {
		if (isEmpty()) {
			throw new BTreeException("Empty trees to right path");
		}
		return rightBTree;
	}

	/*
	 * Inserts a given tree as a subtree in the given side
	 */
	public void insert(BTree<E> tree, int side) throws BTreeException {
		if (isEmpty()) {
			throw new BTreeException("Empty trees do not have a left or right child");
		}
		if (side == LEFT) {
			if (leftBTree != null) {
				throw new BTreeException("Left subtree is not empty");
			}
			leftBTree = tree;
		} else {
			if (rightBTree != null) {
				throw new BTreeException("Right subtree is not empty");
			}
			rightBTree = tree;
		}
	}

	/*
	 * Tree traversals
	 */
	public String toStringPreOrder() {
		if (isEmpty()) {
			return "";
		} else {
			return info + " " + (leftBTree != null ? leftBTree.toStringPreOrder() : "")
					+ (rightBTree != null ? rightBTree.toStringPreOrder() : "");
		}
	}

	public String toStringInOrder() {
		if (isEmpty()) {
			return "";
		} else {
			return (leftBTree != null ? leftBTree.toStringInOrder() : "") + info + " "
					+ (rightBTree != null ? rightBTree.toStringInOrder() : "");
		}
	}

	public String toStringPostOrder() {
		if (isEmpty()) {
			return "";
		} else {
			return (leftBTree != null ? leftBTree.toStringPostOrder() : "")
					+ (rightBTree != null ? rightBTree.toStringPostOrder() : "") + info + " ";
		}
	}

	/*
	 * Tree properties
	 */
	public int size() {
		if (isEmpty()) {
			return 0;
		}
		return 1 + (leftBTree != null ? leftBTree.size() : 0) + (rightBTree != null ? rightBTree.size() : 0);
	}

	public int height() {
		if (isEmpty()) {
			return -1;
		}
		return 1 + Math.max((leftBTree != null ? leftBTree.height() : -1),
				(rightBTree != null ? rightBTree.height() : -1));
	}
}