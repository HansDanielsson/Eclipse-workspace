package trees;

public class LBTree<E> implements BTree<E> {

	// Attribute that represents the root node (recursive definition)
	private LBNode<E> root;

	/*
	 * Constructor of an empty tree
	 */
	public LBTree() {
		root = null;
	}

	/*
	 * Constructor
	 */
	public LBTree(E info) {
		root = new LBNode<>(info, new LBTree<>(), new LBTree<>());
	}

	/*
	 * Checks if the tree is empty
	 */
	public boolean isEmpty() {
		return (root == null);
	}

	/*
	 * Returns the information stored in the node
	 */
	public E getInfo() throws BTreeException {
		if (isEmpty()) {
			throw new BTreeException("Empty trees do not have info");
		}
		return root.getInfo();
	}

	/*
	 * Returns left and right subtrees
	 */
	public BTree<E> getLeft() throws BTreeException {
		if (isEmpty()) {
			throw new BTreeException("Empty trees do not have a left child");
		}
		return root.getLeft();
	}

	public BTree<E> getRight() throws BTreeException {
		if (isEmpty()) {
			throw new BTreeException("Empty trees do not have a right child");
		}
		return root.getRight();
	}

	/*
	 * Inserts a given tree as a subtree in the given side
	 */
	public void insert(BTree<E> tree, int side) throws BTreeException {
		if (isEmpty()) {
			throw new BTreeException("Empty trees do not have a left or right child");
		}
		if (side == LEFT) {
			if (!root.getLeft().isEmpty()) {
				throw new BTreeException("Left subtree is not empty");
			}
			root.setLeft(tree);
		} else {
			if (!root.getRight().isEmpty()) {
				throw new BTreeException("Right subtree is not empty");
			}
			root.setRight(tree);
		}
	}

	/*
	 * Tree traversals (dummy implementations)
	 */
	public String toStringPreOrder() {
		if (isEmpty()) {
			return "";
		} else {
			return root.getInfo() + " " + root.getLeft().toStringPreOrder() + root.getRight().toStringPreOrder();
		}
	}

	public String toStringInOrder() {
		if (isEmpty()) {
			return "";
		} else {
			return root.getLeft().toStringInOrder() + root.getInfo() + " " + root.getRight().toStringInOrder();
		}
	}

	public String toStringPostOrder() {
		if (isEmpty()) {
			return "";
		} else {
			return root.getLeft().toStringPostOrder() + root.getRight().toStringPostOrder() + root.getInfo() + " ";
		}
	}

	/*
	 * Tree properties (dummy implementations)
	 */
	public int size() {
		if (isEmpty()) {
			return 0;
		}
		return 1 + root.getLeft().size() + root.getRight().size();
	}

	public int height() {
		if (isEmpty()) {
			return -1;
		}
		return 1 + Math.max(root.getLeft().height(), root.getRight().height());
	}
}